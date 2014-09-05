package org.apache.struts.hellohttpsession.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;


public class HelloHttpSessionAction extends ActionSupport implements SessionAware,  ParameterNameAware {

  private static final long serialVersionUID = 1L;
  
  private Map<String, Object> userSession ;
  private static final String HELLO_COUNT = "helloCount";

  /**
   * The SessionAware interface has one method, setSession, that your Action class will need to override.
   * The Struts 2 framework has an interceptor that will inject the HTTP session object into the Action class by calling the setSession method.
   */
  @Override
  public void setSession( Map<String, Object> session ) {
    userSession = session;
  }
  
  /**
   * Increase the value of HELLO_COUNT stored in the user's 
   * HTTP session.  
   */
  private void increaseHelloCount() {
          
      Integer helloCount = (Integer) userSession.get(HELLO_COUNT);
      
      if (helloCount == null ) {
          helloCount = 1;
      } else {
          helloCount++;
      }
      
      userSession.put(HELLO_COUNT, helloCount);
  }

  @Override
  public String execute() throws Exception {
    increaseHelloCount();
    return SUCCESS;
  }

  /**
   * This method will be called by the Struts 2 framework for each parameter in the request scope. 
   * By returning false if the parameter name contains "session" we are telling the Struts 2 framework to ignore that parameter. 
   * This will prevent a malicious user from trying to hack the HTTP session object.
   * 
   * Also refer to <param name="params.excludeParams"> in struts.xml
   * 
   * Note: the same issue exists if you implement the ServletRequestAware interface, which is why the method returns false if the parameter name contains "request".
   */
  @Override
  public boolean acceptableParameterName( String parameterName ) {
    boolean allowedParameterName = true ;
    
    if ( parameterName.contains("session")  || parameterName.contains("request") ) {
        allowedParameterName = false ;
    } 
     
    return allowedParameterName;
  }

}
