package mathematics;

import exceptions.MathsExceptions;
import interfaces.IMaths;

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
		//Ecrire l'impl�mentation de multiplication en utilisant que des additions
		//Tester tous les cas possibles (positifs, n�gatifs, 0)
		return a*b ;
	}

	@Override
	public double division(int a, int b) throws MathsExceptions {
		if (b == 0) {
			throw new MathsExceptions("Division par z�ro impossible");
		}
		try {
			return a / b;
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}

}