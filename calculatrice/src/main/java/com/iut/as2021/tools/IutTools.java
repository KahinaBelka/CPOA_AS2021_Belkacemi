package com.iut.as2021.tools;

import com.iut.as2021.enumerations.EOperation;

public class IutTools {
	
	public static String getLeftExpression(String expression, int pos) {
		return expression.substring(0, pos).trim();
	}

	public static String getRightExpression(String expression, int pos) {
		return expression.substring(pos + 1).trim();
	}
	
	public static int searchOperatorIndex(String expression) {
		EOperation[] operations = EOperation.values();
		for(int i=1; i<expression.length(); i++) {
			char character = expression.charAt(i);
			for(int j=0; j<operations.length; j++) {
				if(Character.valueOf(character).toString().equals(operations[j].getOperateur())){
					return expression.indexOf(character, 1);	
				}	
			}
		}
		return -1;
	}
		

}
