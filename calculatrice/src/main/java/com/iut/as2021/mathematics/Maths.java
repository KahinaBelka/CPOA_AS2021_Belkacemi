package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		int result = 0;
		if((a<0 && b<0) || (a>0 && b<0)) {
			for(int i = 0; i<-b; i++) {
				result = addition(result, -a);
			}
		}
		else if(a<0 && b>0) {
			for(int i = 0; i<b; i++) {
				result = addition(result, a);
			}
		}
		else {
			for(int i = 0; i<b; i++) {
				result = addition(result, a);
			}
		}
		return result;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions {
		if (b == 0) {
			throw new MathsExceptions("Division par zero impossible");
		}
		try {
			return a / b;
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}

}
