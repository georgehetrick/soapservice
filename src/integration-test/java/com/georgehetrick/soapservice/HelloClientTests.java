package com.georgehetrick.soapservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import com.georgehetrick.soapservice.client.HelloServiceImpl;
import com.georgehetrick.soapservice.client.HelloServiceImplService;

public class HelloClientTests {
	@Test
	public void helloServiceTest() {
		try {
			URL url = new URL("http://localhost:8999/HelloService?wsdl");
			HelloServiceImpl helloService =  (new HelloServiceImplService(url)).getHelloServiceImplPort();
			String hello = helloService.sayHello();
			assertEquals(hello, "Hello");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
