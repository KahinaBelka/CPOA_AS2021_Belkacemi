package tests.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

	private IMaths maths;

	@Before
	public void setUp() {
		this.maths = new Maths();
	}

	@Test
	public void testAdditionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}

	@Test
	public void testAdditionCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.addition(-4, -10), -14);
	}

	@Test
	public void testAdditionCasGeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.addition(-4, 10), 6);
	}

	@Test
	public void testSoustractionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.soustraction(6, 3), 3);
	}

	@Test
	public void testSoustractionCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.soustraction(-5, -3), -2);
	}

	@Test
	public void testSoustractionCasGeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.soustraction(2, -3), 5);
	}

	@Test
	public void testMultiplicationCasGeneralNombrePositif() {
		Assert.assertEquals(maths.multiplication(2, 3), 6);
	}

	@Test
	public void testMultiplicationCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.multiplication(-2, -3), 6);
	}

	@Test
	public void testMultiplicationCasGeneralNombrePositifetNegatif() {
		Assert.assertEquals(maths.multiplication(-2, 3), -6);
	}

	@Test
	public void testDivisionCasGeneralNombrePositif() throws MathsExceptions {
		Assert.assertEquals(maths.division(28, 7), 4, 0);
	}

	@Test(expected = MathsExceptions.class)
	public void testDivisionParZero() throws MathsExceptions {
		try {
			maths.division(4, 0);
		}
		catch (MathsExceptions me) {
			Assert.assertEquals(me.getMessage(), "Division par zéro impossible");
			throw me;
		}
	}
	
	@Test
	public void testDivisionCasGeneralNombreNegatif() throws MathsExceptions {
		Assert.assertEquals(maths.division(-16, -4), 4, 0);
	}
	
	@Test
	public void testDivisionCasGeneralNombrePositifetNegatif() throws MathsExceptions {
		Assert.assertEquals(maths.division(28, -7), -4, 0);
	}
	
	
}
