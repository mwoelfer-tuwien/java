/**
 * 
 */
package test;

import static org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import bruch.Bruch
/**
 * @author uhs374h
 *
 */
class BruchTest{
	Bruch a,b
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a= new Bruch(3, 2)
		b= new Bruch(3, 4)
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		(a,b)=[null,null]	
	}

	/**
	 * Test method for {@link bruch.Bruch#Bruch(java.math.BigInteger)}.
	 */
	@Test
	public void testBruchBigIntegerBigInteger() {
		def z=2
		def BigInteger n=4
		def Bruch c=new Bruch(z,n)
		String expected = "Bruch(2, 4)"
		String actual=c.toString()
		assertEquals(expected, actual)	
	}

	/**
	 * Test method for {@link bruch.Bruch#Bruch(java.math.BigInteger)}.
	 */
	@Test
	public void testBruchBigInteger() {
		def z=8
		Bruch c=new Bruch(z)
		String expected = "Bruch(8, 1)"
		String actual=c.toString()
		assertEquals(expected, actual)	
	}

	/**
	 * Test method for {@link bruch.Bruch#Bruch(bruch.Bruch)}.
	 */
	@Test
	public void testBruchBruch() {
		Bruch c=new Bruch(a.z,a.n)
		assertEquals(c,a)
	}

	/**
	 * Test method for {@link bruch.Bruch#doubleValue()}.
	 */
	@Test
	public void testDoubleValue() {
		Double expected=a.z/a.n
		Double actual=a.doubleValue()
		assertEquals(expected, actual,0.001)
	}

	/**
	 * Test method for {@link bruch.Bruch#get()}.
	 */
	@Test
	public void testGetZ() {
		def z=2, n=4
		Bruch c=new Bruch(z,n)
		BigInteger expected = z
		def actual=c.z
		assertEquals(expected, actual)	
	}

	/**
	 * Test method for {@link bruch.Bruch#set(java.lang.String, java.lang.Object)}.
	 */
	@Test
	public void testSetZ() {
		def z=2, z2=4, n=4
		Bruch c=new Bruch(z,n)
		c.setZ(z2)
		BigInteger expected = z2
		def actual=c.z
		assertEquals(expected, actual)	
	}

	/**
	 * Test method for {@link bruch.Bruch#get(java.lang.Object)}.
	 */
	@Test
	public void testGetN() {
		def z=2, n=4
		Bruch c=new Bruch(z,n)
		BigInteger expected = n
		def actual=c.getN()
		assertEquals(expected, actual)	
	}

	/**
	 * Test method for {@link bruch.Bruch#set(java.lang.String,java.lang.Object)}.
	 */
	@Test
	public void testSetN() {
		def z=2, n=4, n2=4
		Bruch c=new Bruch(z,n)
		c.setN(n2)
		BigInteger expected = n2
		def actual=c.getN()
		assertEquals(expected, actual)	
	}
	/**
	 * Test method for {@link bruch.Bruch#multiply(bruch.Bruch)}.
	 */
	@Test
	public void testMultiplyBruch() {
		Bruch actual=b*a
		Bruch expected=new Bruch(9,8)
		assertEquals(expected, actual)
	}

	/**
	 * Test method for {@link bruch.Bruch#multiply(bruch.Bruch)}.
	 */
	@Test
	public void testMultiplyBruch2() {
		Bruch actual=a*b
		Bruch expected=new Bruch(9,8)
		assertEquals(expected, actual)
	}
	/**
	 * Test method for {@link bruch.Bruch#divide(bruch.Bruch)}.
	 */
	@Test
	public void testDivideBruch() {
		Bruch actual=b/a
		Bruch expected=new Bruch(1,2)
		assertEquals(expected, actual)
	}

	/**
	 * Test method for {@link bruch.Bruch#divide(bruch.Bruch)}.
	 */
	@Test
	public void testDivideBruch2() {
		Bruch actual=a/b
		Bruch expected=new Bruch(2,1)
		assertEquals(expected, actual)
	}

	/**
	 * Test method for {@link bruch.Bruch#divide(bruch.Bruch)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testDivideBruchIllegalArgumentException() {
		Bruch c=new Bruch(0)
		Bruch actual=a/c
		fail("not reachable")
	}
	/**
	 * Test method for {@link bruch.Bruch#plus(bruch.Bruch)}.
	 */
	@Test
	public void testPlusBruch() {
		Bruch actual=b+a
		Bruch expected=new Bruch(9,4)
		assertEquals(actual, expected)
	}

	/**
	 * Test method for {@link bruch.Bruch#plus(bruch.Bruch)}.
	 */
	@Test
	public void testPlusBruch2() {
		Bruch actual=a+b
		Bruch expected=new Bruch(9,4)
		assertEquals(actual, expected)
	}

	/**
	 * Test method for {@link bruch.Bruch#minus(bruch.Bruch)}.
	 */
	@Test
	public void testMinusBruch() {
		Bruch actual=a-b
		Bruch expected=new Bruch(3,4)
		assertEquals(actual, expected)
	}
	/**
	 * Test method for {@link bruch.Bruch#minus(bruch.Bruch)}.
	 */
	@Test
	public void testMinusBruch2() {
		Bruch actual=b-a
		Bruch expected=new Bruch(-3,4)
		assertEquals(actual, expected)
	}

	/**
	 * Test method for {@link bruch.Bruch#doubleValue()}.
	 */
	@Test
	public void testdoubleValue() {
		def z=2
		def n=4
		Bruch c=new Bruch(z,n)

		Double expected = c as Double
		Double actual=c.doubleValue()
		assertEquals(expected, actual, 0.001)	
	}

	/**
	 * Test method for {@link bruch.Bruch#minus(z:java.math.BigInteger)}.
	 */
	@Test
	public void testMinusBigInteger() {
		def z=2
		Bruch c=new Bruch(z)
		Double expected = 0.5
		Double actual=(c-a) as Double
		assertEquals(expected, actual, 0.001)	
	}

	/**
	 * Test method for {@link bruch.Bruch#asType(jva.lang.Object)}.
	 */
	@Test
	public void testasBigInteger() {
		def z=2
		Bruch c=new Bruch(z)
		BigInteger expected = z
		BigInteger actual=c as BigInteger
		assertEquals(expected, actual)
	}
	
	/**
	 * Test method for {@link bruch.Bruch#asType(jva.lang.Object)}.
	 */
	@Test
	public void testasInteger() {
		def z=2
		Bruch c=new Bruch(z)
		Integer expected = z
		Integer actual=c as Integer
		assertEquals(expected, actual)
	}
	/**
	 * Test method for {@link bruch.Bruch#asType(jva.lang.Object)}.
	 */
	@Test
	public void testasLong() {
		def z=2
		Bruch c=new Bruch(z)
		Long expected = z
		Long actual=c as Long
		assertEquals(expected, actual)
	}

	/**
	 * Test method for {@link bruch.Bruch#asType(jva.lang.Object)}.
	 */
	@Test
	public void testasDouble() {
		Long z=2, n=3
		Bruch c=new Bruch(z,n)

		Double expected = z/n
		Double actual=c as Double
		assertEquals(expected, actual, 0.001)
	}

	/**
	 * Test method for {@link bruch.Bruch#asType(jva.lang.Object)}.
	 */
	@Test
	public void testasBigDecimal() {
		def z=2, n=3
		Bruch c=new Bruch(z, n)

		BigDecimal expected = z/n
		BigDecimal actual=c as BigDecimal
		assertEquals(expected, actual, 0.001)
	}

	/**
	 * Test method for {@link bruch.Bruch#plus(java.math.BigInteger)}.
	 */
	@Test
	public void testPlusBigIntegerBigInteger() {
		Bruch actual=a.plus(b.z,b.n)
		Bruch expected = new Bruch(9,4)
		assertEquals(expected, actual)	
	}
	/**
	 * Test method for {@link bruch.Bruch#plus(java.math.BigInteger)}.
	 */
	@Test
	public void testMinusBigIntegerBigInteger() {
		Bruch actual=a.minus(b.z,b.n)
		Bruch expected = new Bruch(3,4)
		assertEquals(expected, actual)
	}
	/**
	 * Test method for {@link bruch.Bruch#multiply(java.math.BigInteger)}.
	 */
	@Test
	public void testMultiplyBigIntegerBigInteger() {
		Bruch actual=a.multiply(b.z,b.n)
		Bruch expected = new Bruch(9,8)
		assertEquals(expected, actual)	
	}
	/**
	 * Test method for {@link bruch.Bruch#div(java.math.BigInteger)}.
	 */
	@Test
	public void testDivideBigIntegerBigInteger() {
		Bruch actual=a.div(b.z,b.n)
		Bruch expected = new Bruch(2,1)
		assertEquals(expected, actual)
	}
	/**
	 * Test method for {@link bruch.Bruch#plus(java.math.BigInteger)}.
	 */
	@Test
	public void testPlusBigInteger() {
		Bruch actual=a+b.z
		Bruch expected = new Bruch(9,2)
		assertEquals(expected, actual)	
	}
	/**
	 * Test method for {@link bruch.Bruch#multiply(java.math.BigInteger)}.
	 */
	@Test
	public void testMultiplyBigInteger() {
		Bruch actual=a*b.z
		Bruch expected = new Bruch(9,2)
		assertEquals(expected, actual)
	}
	/**
	 * Test method for {@link bruch.Bruch#div(java.math.BigInteger)}.
	 */
	@Test
	public void testDivideBigInteger() {
		Bruch actual=a/b.z
		Bruch expected = new Bruch(1,2)
		assertEquals(expected, actual)
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDivideBigInteger2() {
		BigInteger c=0;
		Bruch d = new Bruch(c)
		Bruch actual=a/d
		fail("not reachable")
	}

		@Test(expected=IllegalArgumentException.class)
	public void testDivideBigInteger3() {
		Bruch actual=a/0
		fail("not reachable")
	} 
	
	/**
	 * Test method for {@link bruch.Bruch#plus(java.math.BigInteger)}.
	 */
	@Test
	public void testasString() {
		String expected="Bruch(3, 2)"
		String actual=a as String
		assertEquals(actual, expected)	
	}

	
	/**
	 * Test method for {@link bruch.Bruch#shorten()}.
	 */
	@Test
	public void testShorten() {
		Bruch c=new Bruch(36,12)
		c.shorten()
		Double expected=3.0
		Double actual=c.doubleValue()
		assertEquals(expected, actual,0.001)
		
	}

	/**
	 * Test method for {@link bruch.Bruch#gcd(java.math.BigInteger, java.math.BigInteger)}.
	 */
	@Test
	public void testGcd() {
		def z= 3*3*4*5*6*7
		def n= 2*3*3*4*5*6
		BigInteger expected = 3*3*4*5*6
		BigInteger actual=Bruch.gcd(z,n)
		assertEquals(actual, expected)
	}

	/**
	 * Test method for {@link bruch.Bruch#toString()}
	 */
	@Test
	public void testToString() {
		String expected="Bruch(3, 2)"
		String actual=a.toString()
		assertEquals(actual, expected)	
	}

	/**
	 * Test method for {@link bruch.Bruch#compareTo(bruch.Bruch)}.
	 */
	@Test
	public void testcompareToGreather() {
		assertEquals(a<=>b,1)
	}

	/**
	 * Test method for {@link bruch.Bruch#compareTo(bruch.Bruch)}.
	 */
	@Test
	public void testcompareToLower() {
		assertEquals(b<=>a,-1)
	}
	/**
	 * Test method for {@link bruch.Bruch#compareTo(bruch.Bruch)}.
	 */
	@Test
	public void testcompareToEquals() {
		assertEquals(a<=>a,0)
	}

	/**
	 * Test method for {@link bruch.Bruch#negative(bruch.Bruch)}.
	 */
	@Test
	public void testNegative() {
		assertEquals(a, -(-a))
	}
	/**
	 * Test method for {@link bruch.Bruch#correct()}
	 */
	@Test
	public void testCorrect() {
		Bruch c=-a
		a.n=-a.n
		a.correct()
		assertEquals(a, c)
	}

	/**
	 * Test method for {@link bruch.Bruch#negative(bruch.Bruch)}.
	 */
	@Test
	public void testNegative2() {
		Bruch c=-a
		a.z=-a.z
		assertEquals(a, c)
	}

}
