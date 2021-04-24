package tests.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

	private IMaths maths;

	@Before
	public void setUp() {
		this.maths = new Maths();
	}

	@Test
	public void testAdditionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.addition(6, 3), 9);
	}

	@Test
	public void testAdditionCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.addition(-8, -10), -18);
	}

	@Test
	public void testAdditionCasGeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.addition(8, -12), -4);
	}

	@Test
	public void testSoustractionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.soustraction(5, 8), -3);
	}

	@Test
	public void testSoustractionCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.soustraction(-10, -3), -7);
	}

	@Test
	public void testSoustractionCasGeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.soustraction(8, -3), 11);
	}

	@Test
	public void testMultiplicationCasGeneralNombrePositif() {
		Assert.assertEquals(maths.multiplication(4, 3), 12);
	}

	@Test
	public void testMultiplicationCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.multiplication(-10, -7), 70);
	}

	@Test
	public void testMultiplicationCasGeneralNombrePositifetNegatif() {
		Assert.assertEquals(maths.multiplication(8, -4), -32);
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
			Assert.assertEquals(me.getMessage(), "Division par zero impossible");
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
