// Do not contain "struts" in package or else the convention mechanism will not work
package org.apache.helloconvention.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


public class HelloConventionAction extends ActionSupport {

  private static final long serialVersionUID = 1L;
  
  private static final Logger logger = Logger.getLogger(HelloConventionAction.class);

  @Override
  public String execute() throws Exception {
    logger.info( "Running into HelloConventionAction.class .................... " );
    return SUCCESS;
  }

}
