package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.com.restapi.test.restapi.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
	TestBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restClient;
	
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testbase =new TestBase();
	serviceurl =prop.getProperty("URL");
	apiurl =prop.getProperty("serviceURL");
	
	url = serviceurl+apiurl;
	RestClient restClient = new RestClient();
	restClient.get(url);
		
	}
	
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		restClient.get(url);
			
		
	}

}
