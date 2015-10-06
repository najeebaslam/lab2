import calculator.*;
import java.*;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
public class CalculatorClient{
	
	public static void main(String args[]){
       
       // geting server for Adder 
       AdderService addService = new AdderService ();
       Adder addPort = addService.getAdderPort();
       
       // getting service for Muliplier 
       MultiplierService mulService = new MultiplierService ();
       Multiplier mulPort = mulService.getMultiplierPort();

       double a = 15.32;
       double b = 8.17;
       double addResult = addPort.add(a, b); 
       System.out.println("I am adding two nos : " +a +"  + " +b);
       System.out.println("Adding result  " + addResult);
       System.out.println("Now Subtracting a no from the result ...");
       
       double subResult = addPort.substract(addResult, a); 
       System.out.println("Substract result  " + subResult);
       System.out.println("Now Mutiplaying the result with the result ...");

       double mulResult  = mulPort.multiplay(subResult, addResult);  
       System.out.println("Multiplacation result  " + mulResult);

   }

 }