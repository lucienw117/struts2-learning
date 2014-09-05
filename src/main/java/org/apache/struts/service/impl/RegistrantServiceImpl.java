package org.apache.struts.service.impl;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.struts.register.model.Person;


public class RegistrantServiceImpl implements org.apache.struts.service.RegistrantService {
	
  private static final Logger logger = Logger.getLogger(RegistrantServiceImpl.class);

  /**
   * Simulate initialize/prepare data from DB or something
   */
  @Override
  public Person getRegistrant() {
    Person person = new Person();
    person.setFirstName("Arthur");
    person.setSport("Baseball");
    person.setGender("Female");
    person.setResidency("FL");
    person.setOver21(true);
    person.setCarModels(Arrays.asList( "Ford", "Nissan" ));
    return person;
  }

  /**
   * Simulate store data into DB or something
   */
	@Override
	public void saveRegistrant(Person registrant) {
		logger.info("Saving registrant's First name: " + registrant.getFirstName());
		logger.info("Saving registrant's Last name: " + registrant.getLastName());
		logger.info("Saving registrant's Email: " + registrant.getEmail());
		logger.info("Saving registrant's Favorite sport: " + registrant.getSport());
		logger.info("Saving registrant's State Resident: " + registrant.getResidency());
		logger.info("Saving registrant's Car models owned: " + registrant.getCarModels());
	}

}
