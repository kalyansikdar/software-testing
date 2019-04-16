package homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	private Problem1Class p1class;

	@SuppressWarnings("unused")
	private static final Object[] parametersForproblem1ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//				Test case 1
				$(true,   true,	5000.00, .950),
//				Test case 2
				$(false,   true,	5000.00,.975),
//				Test case 3
				$(true,   false,	5000.00,	.925),
//				Test case 4
				$(false,   false,	5000.00,	.965),
//				Test case 5
				$(true,  true,		4999.99,	.900),
//				Test case 6
				$(true,  false,		4999.99,	.950),
//				Test case 7
				$(false,  true,		4999.99,	.955),
//				Test case 8
				$(false,  false,	4999.99,	.985),
//				Test case 9
				$(true,  true,	4999.99,	.900),
//				Test case 10
				$(true,  true,		10000.00,	.950)
		);
	}
	
	@Before
	public void setUp() throws Exception {
		p1class = new Problem1Class();
	}

	@Test
	@Parameters(method="parametersForproblem1ClassTest")
	public void testCalcRate(boolean member, boolean primeStatus, double cart, double rate) {
		
//		Problem1Class p1class = new Problem1Class();
//		double rate;
		
//		assertEquals(rate, p1class.calcRate(member, primeStatus, cart));
		assertEquals(rate, p1class.calcRate(member, primeStatus, cart), 0.001);
//		mymeal.nextMeal();
//		assertEquals(MealNames.lunch,mymeal.meal);
//		//
//		// Remove the comment delimiters below to raise a wrong assertion to show the exception raised
//		assertEquals(MealNames.breakfast,mymeal.meal);
//		mymeal.nextMeal();
//		assertEquals(MealNames.supper,mymeal.meal);
//		//
//		// Remove the comment delimiters below to raise a wrong assertion to show the exception raised
//		assertEquals(MealNames.lunch,mymeal.meal);
//		mymeal.nextMeal();
//		assertEquals(MealNames.breakfast,mymeal.meal);
//		//Remove the comment delimiters below to raise a wrong assertion to show the exception raised
//		assertEquals(MealNames.lunch,mymeal.meal);
		//
	}

}
