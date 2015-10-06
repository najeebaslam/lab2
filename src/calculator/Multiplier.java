package calculator;

import javax.jws.*;
@WebService
public class Multiplier{

   @WebMethod
	public double multiplay(double a,double b){

		double result = a * b;
		return result;
	}
}
