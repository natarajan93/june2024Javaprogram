package calculator;

import java.util.Scanner;

public class Method {

	public int add(int a, int b) {
		return a + b;

	}

	public int add1(int a, int b, char sy) {
		if (sy == '+') {
			return a + b;

		} else if (sy == '-') {
			return a - b;

		} else if (sy == '*') {
			return a * b;

		} else if (sy == '/') {
			return a / b;

		}
		   throw new  IllegalArgumentException("Enter the correct symbal");
	}

	public int sub(int a, int b) {
		return a - b;

	}

	public int sub1(int a, int b, char sy) {
		if (sy == '+') {
			return a + b;

		} else if (sy == '-') {
			return a - b;

		} else if (sy == '*') {
			return a * b;

		} else if (sy == '/') {
			return a / b;

		}
		   throw new  IllegalArgumentException("Enter the correct symbal");

	}

	public int mul(int a, int b) {
		return a * b;

	}

	public int mul1(int a, int b, char sy) {
		if (sy == '+') {
			return a + b;

		} else if (sy == '-') {
			return a - b;

		} else if (sy == '*') {
			return a * b;

		} else if (sy == '/') {
			return a / b;

		}
		
	    throw new  IllegalArgumentException("Enter the correct symbal");
	
	}

	public double div(int a, int b) {
		return a / b;

	}

	public double div1(double a, int b, char sy) {
		if (sy == '+') {
			return a + b;

		} else if (sy == '-') {
			return a - b;

		} else if (sy == '*') {
			return a * b;

		} else if (sy == '/') {
			return a / b;

		}
		   throw new  IllegalArgumentException("Enter the correct symbal");

	}

}