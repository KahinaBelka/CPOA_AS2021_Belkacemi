package com.iut.as2021.main;

import com.iut.as2021.interfaces.IMaths;

import com.iut.as2021.mathematics.Maths;
import com.iut.as2021.metier.Calculer;
import com.iut.as2021.metier.MathResultat;
import com.iut.as2021.tools.IutTools;
import com.iut.as2021.enumerations.EOperation;
import com.iut.as2021.exceptions.MathsExceptions;

public class StartTestMaths {

	public static void main(String[] args) throws MathsExceptions {
		
		
		MathResultat calcul = new MathResultat("");
		double result = calcul.calculate();
		System.out.println(result);
		
	}

}
