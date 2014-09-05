package org.apache.struts.service;

import org.apache.struts.register.model.Person;


public interface RegistrantService {
  public Person getRegistrant();
  public void saveRegistrant(Person registrant);
}
