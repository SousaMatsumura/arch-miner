/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 29 17:00:55 GMT 2018
 */

package postprocessors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import postprocessors.PostProcessorFactory;
import postprocessors.RolePostProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PostProcessorFactory_ESTest extends PostProcessorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RolePostProcessor rolePostProcessor0 = PostProcessorFactory.createPostProcessor(":EcVY");
      assertNull(rolePostProcessor0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RolePostProcessor rolePostProcessor0 = PostProcessorFactory.createPostProcessor("removeWeakRoles");
      assertNotNull(rolePostProcessor0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PostProcessorFactory postProcessorFactory0 = new PostProcessorFactory();
  }
}
