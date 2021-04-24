package com.iut.as2021.metier;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import com.iut.as2021.mathematics.Maths;
import com.iut.as2021.tools.IutTools;

public class Calculer {
	
	private IMaths maths;
	
	public Calculer(IMaths maths) {
		this.setMaths(maths);
	}
	
	public void setMaths(IMaths maths) {
		this.maths = maths;
	}
	
	public double run(String expression) {
		
		int operatorIndex = IutTools.searchOperatorIndex(expression);
		System.out.println(operatorIndex);
		double resultat=0;
		
		if(operatorIndex>0) {
			String left = IutTools.getLeftExpression(expression, operatorIndex);
			String right = IutTools.getRightExpression(expression, operatorIndex);
			String operationSign = Character.valueOf(expression.charAt(operatorIndex)).toString();
			switch(operationSign) {
			case "+": resultat = maths.addition(Integer.valueOf(left), Integer.valueOf(right));	break;
			case "-": resultat = maths.soustraction(Integer.valueOf(left), Integer.valueOf(right));	break;
			case "*": resultat = maths.multiplication(Integer.valueOf(left), Integer.valueOf(right)); break;
			//case "/": resultat = maths.division(Integer.valueOf(left), Integer.valueOf(right)); break;
			default: System.out.println("L'operation n'a pas pu etre effectuee car elle est inconnue"); break;
			}
		}
		
		return resultat;		
	}

	
}
