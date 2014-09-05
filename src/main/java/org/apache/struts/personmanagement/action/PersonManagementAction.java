package org.apache.struts.personmanagement.action;


import org.apache.log4j.Logger;
import org.apache.struts.service.MessageService;

import com.opensymphony.xwork2.ActionSupport;


public class PersonManagementAction extends ActionSupport {

  private static final long serialVersionUID = 1L;
  
  private static final Logger logger = Logger.getLogger(PersonManagementAction.class);
  
  private MessageService messageService;
  
//  public String list() throws Exception {
//    log.info( "Executing list method ....." );
//    return SUCCESS;
//  }
  
  public String create() throws Exception {
    logger.info( "Executing create method ....." );
    messageService.printMessage( "Executing create method ....." );
    return SUCCESS;
  }
  
  public String edit() throws Exception {
    logger.info( "Executing edit method ....." );
    messageService.printMessage( "Executing edit method ....." );
    return SUCCESS;
  }
  
  public String delete() throws Exception {
    logger.info( "Executing delete method ....." );
    messageService.printMessage( "Executing delete method ....." );
    return SUCCESS;
  }
  
  public String saveOrUpdate() throws Exception {
    logger.info( "Executing saveOrUpdate method....." );
    messageService.printMessage( "Executing saveOrUpdate method ....." );
    return SUCCESS;
  }
  
  public MessageService getMessageService() {
    return messageService;
  }
  
  public void setMessageService( MessageService messageService ) {
    this.messageService = messageService;
  }

}
