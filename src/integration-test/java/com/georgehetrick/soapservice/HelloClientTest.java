package com.georgehetrick.soapservice;

import com.georgehetrick.soapservice.client.HelloServiceImplService;
import static org.junit.jupiter.api.Assertions.*;
import com.georgehetrick.soapservice.client.HelloServiceImpl;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

public class HelloClientTest {
	@Test
	public void helloServiceTest() {
		URL url;
		try {
			url = new URL("http://localhost:8999/HelloService?wsdl");
	        HelloServiceImpl helloService =  (new HelloServiceImplService(url)).getHelloServiceImplPort();
	        String hello = helloService.sayHello();
	        assertEquals(hello, "Hello");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
