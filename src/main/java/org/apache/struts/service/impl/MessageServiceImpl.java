package org.apache.struts.service.impl;

import org.apache.struts.service.MessageService;


public class MessageServiceImpl implements MessageService {

  public void printMessage( String msg ) {
    System.out.println(msg + " -- print from MessageServiceImpl");
  }

}
