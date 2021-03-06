/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 17:18:29 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchitectureStudy_ESTest extends ArchitectureStudy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          ArchitectureStudy.main(stringArray0);
          assertEquals(1, stringArray0.length);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ArchitectureStudy architectureStudy0 = new ArchitectureStudy();
          // Undeclared exception!
          try { 
            architectureStudy0.execute();
            fail("Expecting exception: RuntimeException");
          
          } catch(RuntimeException e) {
             //
             // Couldn't create JGit instance with path /home/edupsousa/Documents/Mestrado/Projetos/spring/239444
             //
             verifyException("org.repodriller.scm.GitRepository", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
