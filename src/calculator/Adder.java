package calculator;

import javax.jws.*;
@WebService
public class Adder {
        @WebMethod
	public double add(double a, double b){

		double result = a + b;
		return result;
	}

	@WebMethod
	public double substract(double a,double b){

		double result = a - b;
		return result;
	}
}
