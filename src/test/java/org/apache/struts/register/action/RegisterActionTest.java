package org.apache.struts.register.action;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;

/**
 * For more Struts2 JUnit testing info, please refer to 
 * http://struts.apache.org/release/2.2.x/docs/struts-2-junit-plugin-tutorial.html
 * 
 * If we use "struts2-convention-plugin" in struts2, it will raise the error below when we run JUnit test in maven.
 * Though it doesn't affect the build process, we still need to figure out a grace way to sort out.
 * 
 * java.io.FileNotFoundException: class path resource [WEB-INF/content/] cannot be resolved to URL because it does not exist
 *  at org.springframework.core.io.ClassPathResource.getURL(ClassPathResource.java:178)
 *  at org.springframework.core.io.AbstractFileResolvingResource.getFile(AbstractFileResolvingResource.java:48)
 *
 */
public class RegisterActionTest extends StrutsSpringTestCase {

	@Test
	public void testExecuteValidationPasses() throws Exception {
	 
	  request.setParameter("personBean.firstName", "Bruce");
	  request.setParameter("personBean.lastName", "Phillips");
	  request.setParameter("personBean.email", "bphillips@ku.edu");
	  request.setParameter("personBean.age", "19");
	 
	  ActionProxy actionProxy = getActionProxy("/register.action");
	  RegisterAction action = (RegisterAction) actionProxy.getAction() ;
	 
	  assertNotNull("The action is null but should not be.", action);
	 
	  String result = actionProxy.execute();
	  assertEquals("The execute method did not return " + ActionSupport.SUCCESS + " but should have.", ActionSupport.SUCCESS, result);
	   
	}

}
