import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.repodriller.domain.Commit;
import org.repodriller.persistence.PersistenceMechanism;
import org.repodriller.scm.CommitVisitor;
import org.repodriller.scm.RepositoryFile;
import org.repodriller.scm.SCMRepository;

import role.MappingStrategyConfigurator;
import role.RoleMappingStrategy;

public class ArchitectureVisitor implements CommitVisitor {

	protected RoleMappingStrategy mappingStrategy;

	public ArchitectureVisitor() {
		this.mappingStrategy = new RoleMappingStrategy();
	}

	public static ArchitectureVisitor createAndConfigure(String configurationPath) {
		ArchitectureVisitor visitor = new ArchitectureVisitor();
		visitor.setStrategy(MappingStrategyConfigurator.fromJSON(configurationPath));
		return visitor;
	}

	public void setStrategy(RoleMappingStrategy strategy) {
		this.mappingStrategy = strategy;
	}

	@Override
	public void process(SCMRepository repository, Commit commit, PersistenceMechanism writer) {
		List<RepositoryFile> files = repository.getScm().files();
		String repositoryID = getRepositoryID(repository.getPath());
		String repositoryPath = repository.getPath();
		for (RepositoryFile file : files) {
			String filePath = relativePath(repositoryPath, file.getFullName());
			Map<String, String> roleMap = removeWeakRoles(this.mappingStrategy.applyHeuristics(file));
			if (roleMap.size() == 0) {
				writer.write(repositoryID, filePath, "unknown", "");
			} else {
				for (Map.Entry<String, String> entry : roleMap.entrySet()) {
					writer.write(repositoryID, filePath, entry.getKey(), entry.getValue());
				}
			}
		}
	}
	
	private Map<String, String> removeWeakRoles(Map<String, String> roleMap) {
		Map<String, String> consolidatedMap = new HashMap<>(roleMap);
		for (Map.Entry<String, String> entry : roleMap.entrySet()) {
			if (!entry.getKey().contains("*") && entry.getKey().contains(":")) {
				String[] splitRole = entry.getKey().split(":");
				splitRole[splitRole.length-1] = "*";
				String weakRole = String.join(":", splitRole);
				consolidatedMap.remove(weakRole);
			}
		}
		return consolidatedMap;
		
	}
	
	protected String getRepositoryID(String repositoryPath) {
		String lastDir = repositoryPath.substring(repositoryPath.lastIndexOf('/')+1);
		return lastDir.substring(0, lastDir.lastIndexOf('-'));
	}
	
	protected String relativePath(String repositoryPath, String filePath) {
		return filePath.substring(repositoryPath.length()+1);
	}
}
