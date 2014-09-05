package org.apache.struts.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.struts.service.CarModelsService;


public class CarModelsServiceImpl implements CarModelsService {

  /**
   * Simulate prepare data from DB
   */
  @Override
  public List<String> getAvailableCarModels() {
    return Arrays.asList( "Ford", "Chrysler", "Toyota", "Nissan" );
  }

}
