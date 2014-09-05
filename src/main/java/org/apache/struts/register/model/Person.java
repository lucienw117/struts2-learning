package org.apache.struts.register.model;

import java.util.List;


public class Person
{
    private String firstName;
    private String lastName;
    private String sport;
    private String gender;
    private String email;
    private String phoneNumber;
    // Fix display "0" issue in textfield
    // private int age;
    private Integer age;
    
    private String residency;
    
    private Boolean over21;
    
    private List<String> carModels;
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge( Integer age) {
        this.age = age;
    }
 
    public String getSport() {
      return sport;
    }

    public void setSport( String sport ) {
      this.sport = sport;
    }

    public String getGender() {
      return gender;
    }

    public void setGender( String gender ) {
      this.gender = gender;
    }
    
    public String getResidency() {
      return residency;
    }

    public void setResidency( String residency ) {
      this.residency = residency;
    }
    
    public Boolean isOver21() {
      return over21;
    }

    public void setOver21( Boolean over21 ) {
      this.over21 = over21;
    }
    
    public List<String> getCarModels() {
      return carModels;
    }

    public void setCarModels( List<String> carModels ) {
      this.carModels = carModels;
    }
    
    public String getPhoneNumber() {
      return phoneNumber;
    }

    
    public void setPhoneNumber( String phoneNumber ) {
      this.phoneNumber = phoneNumber;
    }
    
    public String toString() {
        return "First Name: " + getFirstName() + " Last Name: " + getLastName() + " Email: " + getEmail() + " Age: " + getAge() ;
    }

}
