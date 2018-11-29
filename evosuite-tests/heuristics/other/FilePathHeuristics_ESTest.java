/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 17:05:35 GMT 2018
 */

package heuristics.other;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heuristics.AnalysedFile;
import heuristics.other.FilePathHeuristics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.repodriller.domain.Modification;
import org.repodriller.domain.ModificationType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilePathHeuristics_ESTest extends FilePathHeuristics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      // Undeclared exception!
      try { 
        filePathHeuristics0.configureHeuristic("directory", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heuristics.other.FilePathHeuristics", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      String[] stringArray0 = new String[3];
      try { 
        filePathHeuristics0.configureHeuristic(":,g-=eH\",i%", stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heuristics.other.FilePathHeuristics", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      FilePathHeuristics filePathHeuristics1 = filePathHeuristics0.mapDirectory("/");
      assertEquals("path", filePathHeuristics1.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "native ";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "n2_iS}oI0Daw]z+Qjr";
      stringArray0[5] = "";
      stringArray0[6] = "";
      filePathHeuristics0.mapDirectories(stringArray0);
      ModificationType modificationType0 = ModificationType.DELETE;
      Modification modification0 = new Modification("", "jNz;xs}T~V/8^", modificationType0, " `9NN>3", "jNz;xs}T~V/8^");
      AnalysedFile analysedFile0 = new AnalysedFile(modification0);
      Boolean boolean0 = filePathHeuristics0.getRole(analysedFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "rA";
      stringArray0[1] = "$_3^SygB-Mue.*";
      stringArray0[2] = "vc1!eLa[4V (QO1an`F";
      FilePathHeuristics filePathHeuristics1 = filePathHeuristics0.mapDirectories(stringArray0);
      ModificationType modificationType0 = ModificationType.ADD;
      Modification modification0 = new Modification("path", "#<>TU_z7.", modificationType0, "rA", "vc1!eLa[4V (QO1an`F");
      AnalysedFile analysedFile0 = new AnalysedFile(modification0);
      Boolean boolean0 = filePathHeuristics1.getRole(analysedFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FilePathHeuristics filePathHeuristics0 = new FilePathHeuristics();
      String string0 = filePathHeuristics0.getName();
      assertEquals("path", string0);
  }
}
