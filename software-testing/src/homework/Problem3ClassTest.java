package homework;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	private Problem3Class p3Class;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem3ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//				Test case 1
				$(400.0,   2,	true,	false,	false,	false,	false,	0),
//				Test case 2
				$(95.1,   2,	false,	true,	false,	false,	false,	0),
//				Test case 3
				$(50.0,   2,	false,	true,	false,	true,	false,	0),
//				Test case 4
				$(25.1,   2,	false,	false,	true,	true,	false,	0),
//				Test case 5
				$(25.0,   1,	false,	false,	true,	true,	false,	0),
//				Test case 6
				$(25.0,   2,	false,	false,	true,	true,	true,	3),
//				Test case 7
				$(49.9,   2,	false,	false,	true,	true,	false,	0),
//				Test case 8
				$(95.0,   2,	false,	true,	false,	true,	false,	0),
//				Test case 9
				$(399.9,	2,	false,	true,	false,	false,	false,	0),
//				Test case 10
				$(25.0,   0,	false,	false,	true,	true,	true,	1),
//				Test case 11
				$(0.0,   2,	false,	false,	true,	true,	true,	3),
//				Test case 12
				$(1000.0,   2,	true,	false,	false,	false,	false,	0)
		);
	}
	
	@Before
	public void setUp() throws Exception {
		p3Class = new Problem3Class();
	}

	@Test
	@Parameters(method="parametersForProblem3ClassTest")
	public void testSetWarnings(double distance, int count, boolean greenLight, boolean yellowLight, boolean redLight, boolean buzzer, boolean brakes, int count2) {
		
//		Problem1Class p1class = new Problem1Class();
//		double rate;
		p3Class.setCount(count);
//		assertEquals(rate, p1class.calcRate(member, primeStatus, cart));
		p3Class.setWarnings(distance);
		
//		assertEquals(p3Class.setWarnings(status, temp, pressure));
//		assertEquals(count,p3Class.getCount());
		
		assertEquals(greenLight,p3Class.isGreenLight());
		assertEquals(yellowLight,p3Class.isYellowLight());
		assertEquals(redLight,p3Class.isRedLight());
		assertEquals(buzzer,p3Class.isBuzzer());
		assertEquals(brakes,p3Class.isBrakes());
		assertEquals(count2,p3Class.getCount());
		
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
