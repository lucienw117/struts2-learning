package org.apache.struts.register.action;


import java.util.Arrays;
import java.util.List;

import org.apache.struts.register.model.Person;
import org.apache.struts.register.model.State;
import org.apache.struts.service.CarModelsService;
import org.apache.struts.service.RegistrantService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;


public class RegisterAction extends ActionSupport implements Preparable {

  private static final long serialVersionUID = 1L;

  private Person personBean;
  // Services in this action
  private RegistrantService registrantService;
  private CarModelsService carModelsService;
  
  private List<String> carModelsAvailable;

// Move personBean initialization from the method below into RegistrantService
//  
//  @Override
//  public String input() throws Exception {
//    personBean = new Person();
//    //      personBean.setSport( "Baseball" );
//    return super.input();
//  }

  @Override
  public String execute() throws Exception {
    //call Service class to store personBean's state in database
	registrantService.saveRegistrant(personBean);
    return SUCCESS;
  }

  public void validate() {

    if ( personBean.getFirstName().length() == 0 ) {
      addFieldError( "personBean.firstName", "First name is required." );
    }

    if ( personBean.getEmail().length() == 0 ) {
      addFieldError( "personBean.email", "Email is required." );
    }

    if ( personBean.getAge() == null || personBean.getAge() < 18 ) {
      addFieldError( "personBean.age", "Age is required and must be 18 or older" );
    }

  }

  public Person getPersonBean() {
    return personBean;
  }

  public void setPersonBean( Person person ) {
    personBean = person;
  }

  /**
   * prepare options for Favorite Sport selection in register.jsp
   */
  public List<String> getSports() {
    return Arrays.asList( "Football", "Baseball", "Basketball" );
  }

  /**
   * prepare options for Gender in register.jsp
   */
  public List<String> getGenders() {
    return Arrays.asList( "Male", "Female", "Not Sure" );
  }
  
  /**
   * prepare object option list for State Resident in register.jsp
   */
  public List<State> getStates() {
    return Arrays.asList( new State("AZ", "Arizona"), new State("CA", "California"), new State("FL", "Florida"), new State("KS", "Kansas"), new State("NY", "New York") );
  }
  
  /**
   * prepare options for Car models owned in register.jsp
   */
  public List<String> getCarModelsAvailable() {
//    return Arrays.asList( "Ford", "Chrysler", "Toyota", "Nissan" );
    return carModelsAvailable;
  }

  @Override
  public void prepare() throws Exception {
    // Simulate initialize/prepare data from service
    personBean = registrantService.getRegistrant();  // The statement also be executed after fail validation, but user's input in view won't be overwritten by this statement.
    carModelsAvailable = carModelsService.getAvailableCarModels();
  }

  public CarModelsService getCarModelsService() {
    return carModelsService;
  }
  
  public void setCarModelsService( CarModelsService carModelsService ) {
    this.carModelsService = carModelsService;
  }
  
  public RegistrantService getRegistrantService() {
    return registrantService;
  }

  public void setRegistrantService( RegistrantService registrantService ) {
    this.registrantService = registrantService;
  }
}