package com.georgehetrick.soapservice;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public class HelloServiceImpl {
  @WebMethod
  public String sayHello() {
    return "Hello";
  }
}