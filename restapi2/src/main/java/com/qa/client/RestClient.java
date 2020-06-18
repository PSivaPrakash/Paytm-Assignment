package com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//1.GET Method - connection. 
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient =     HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closeablehttpresponse =   httpClient.execute(httpget);
		int statuscode =    closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("Status Code : " +statuscode );
		
		
		 String responseString =   EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
		 
		 JSONObject responseJson = new JSONObject(responseString);
		 System.out.println("Response JSON : " +responseJson );
	}

}
