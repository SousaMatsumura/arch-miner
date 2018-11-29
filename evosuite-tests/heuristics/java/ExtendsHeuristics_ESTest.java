/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 17:11:14 GMT 2018
 */

package heuristics.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heuristics.AnalysedFile;
import heuristics.ConfigurableHeuristics;
import heuristics.java.ExtendsHeuristics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.repodriller.domain.Modification;
import org.repodriller.domain.ModificationType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendsHeuristics_ESTest extends ExtendsHeuristics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExtendsHeuristics extendsHeuristics0 = new ExtendsHeuristics();
      try { 
        extendsHeuristics0.configureHeuristic("", (String[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heuristics.java.ExtendsHeuristics", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtendsHeuristics extendsHeuristics0 = new ExtendsHeuristics();
      String[] stringArray0 = new String[4];
      ConfigurableHeuristics configurableHeuristics0 = extendsHeuristics0.configureHeuristic("interface", stringArray0);
      assertEquals("extends", configurableHeuristics0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExtendsHeuristics extendsHeuristics0 = new ExtendsHeuristics();
      ModificationType modificationType0 = ModificationType.ADD;
      Modification modification0 = new Modification(",", ".", modificationType0, ".", ".");
      AnalysedFile analysedFile0 = new AnalysedFile(modification0);
      Boolean boolean0 = extendsHeuristics0.getRole(analysedFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExtendsHeuristics extendsHeuristics0 = new ExtendsHeuristics();
      String string0 = extendsHeuristics0.getName();
      assertEquals("extends", string0);
  }
}