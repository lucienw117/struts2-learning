package org.apache.struts.helloworld.action;

import org.apache.log4j.Logger;
import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;


/**
 * Acts as a Struts 2 controller that responds
 * to a user action by setting the value
 * of the Message model class, and returns a String 
 * result.
 * @author Bruce Phillips
 *
 */
public class HelloWorldAction extends ActionSupport {

  private static final long serialVersionUID = 1L;
  
  private static final Logger logger = Logger.getLogger(HelloWorldAction.class);

  /**
   * The model class that stores the message
   * to display in the view.
   */
  private MessageStore messageStore;

  private static int helloCount = 0;

  private String userName;

  /*
   * Creates the MessageStore model object and 
   * returns success.  The MessageStore model
   * object will be available to the view.
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  public String execute() throws Exception {
	  
	logger.info("into HelloWorldAction ................");

    messageStore = new MessageStore();
    if ( userName != null ) {
      messageStore.setMessage( messageStore.getMessage() + " " + userName );
    }
    helloCount++;
    return SUCCESS;
  }

  public MessageStore getMessageStore() {
    return messageStore;
  }

  public void setMessageStore( MessageStore messageStore ) {
    this.messageStore = messageStore;
  }

  public int getHelloCount() {
    return helloCount;
  }

  public void setHelloCount( int helloCount ) {
    HelloWorldAction.helloCount = helloCount;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName( String userName ) {
    this.userName = userName;
  }

}
