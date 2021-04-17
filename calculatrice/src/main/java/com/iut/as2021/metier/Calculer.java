package com.iut.as2021.metier;

import com.iut.as2021.interfaces.IMaths;
import com.iut.as2021.mathematics.Maths;

public class Calculer {
	
	private IMaths maths;
	
	public Calculer(IMaths maths) {
		this.setMaths(maths);
	}
	
	public void setMaths(IMaths maths) {
		this.maths = maths;
	}
	
	public double run(String expression) {
		
		int posSigneAddition = expression.indexOf("+");
		int posSigneSoustraction = expression.indexOf("-");
		int posSigneMultiplication = expression.indexOf("*");
		double resultat = 0;
		
		boolean addition = (posSigneAddition>0);
		boolean soustraction = (posSigneSoustraction>0);
		boolean multiplication = (posSigneMultiplication>0);
		
		if (addition) {
			String left = getLeftExpression(expression, posSigneAddition);
			String right = getRightExpression(expression, posSigneAddition);
			resultat = maths.addition(Integer.valueOf(left), Integer.valueOf(right));
		}
		
		else if (soustraction) {
			String left = getLeftExpression(expression, posSigneSoustraction);
			String right = getRightExpression(expression, posSigneSoustraction);
			resultat = maths.soustraction(Integer.valueOf(left), Integer.valueOf(right));
		}
		
		else if (multiplication) {
			String left = getLeftExpression(expression, posSigneMultiplication);
			String right = getRightExpression(expression, posSigneMultiplication);
			resultat = maths.multiplication(Integer.valueOf(left), Integer.valueOf(right));
		}
		
		return resultat;
			
	}

	private String getRightExpression(String expression, int pos) {
		String right = expression.substring(pos+1).trim();
		return right;
	}

	private String getLeftExpression(String expression, int pos) {
		String left = expression.substring(0, pos).trim();
		return left;
	}

}
