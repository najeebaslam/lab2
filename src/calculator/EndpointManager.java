package calculator;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
public class EndpointManager{
	
	public static void main(String args[]){
       Adder a = new Adder();
       Multiplier m = new Multiplier();
       Endpoint.publish("http://localhost:1234/calculator/adder", a); 
       Endpoint.publish("http://localhost:1234/calculator/multiplier", m); 
   }

 }