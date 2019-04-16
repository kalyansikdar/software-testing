package homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	private Problem4Class p4Class;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem4ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//				Test case 1
				$(2500.00,    true,    true,    750,    0.0825,    2165.00,    true),
//				Test case 2
				$(1500.01,    true,    true,    750,    0.0825,    1380.19,    true),
//				Test case 3
				$(750.01,    true,    true,    750,    0.0825,    710.40,    true),
//				Test case 4
				$(500.00,    true,    true,    750,    0.0825,    487.12,    true),
//				Test case 5
				$(1000.01,    false,    true,    750,    0.0825,    947.19,    true),
//				Test case 6
				$(1000.01,    false,    true,    750,    0.0825,    947.19,    true),
//				Test case 7
				$(1000.01,    false,    false,    751,    0.0825,    947.19,    true),
//				Test case 8
				$(1000.00,    false,    false,    751,    0.0825,    947.18,    false),
//				Test case 9
				$(1000.01,    false,    false,    750,    0.0825,    947.19,    false),
//				Test case 10
				$(0.00,    false,    false,    751,    0.0825,    0.00,    false),
//				Test case 11
				$(10000.00,    false,    false,    751,    0.0825,    8660.00,    true),
//				Test case 12
				$(750.00,    true,    true,    750,    0.0825,    730.68,    true),
//				Test case 13
				$(1500.00,    true,    true,    750,    0.0825,    1420.78,    true),
//				Test case 14
				$(2499.99,    true,    true,    750,    0.0825,    2300.30,    true),
//				Test case 15
				$(1000.01,    true,    false,    750,    0.0825,    947.19,    true),
//				Test case 16
				$(2499.99,    true,    true,    0,    0.0825,    2300.30,    true),
//				Test case 17
				$(2499.99,    true,    true,    1000,    0.0825,    2300.30,    true)
		);
	}
	
	@Before
	public void setUp() throws Exception {
		p4Class = new Problem4Class();
	}

	@Test
	@Parameters(method="parametersForProblem4ClassTest")
	public void testDetermineMemberBonus(double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, double taxRate, double total, boolean memberBonus) {
		
		p4Class.determineMemberBonus(cart, firstTimeBuyer, goldStatus, bonusPoints, taxRate);
		
		assertEquals(total,p4Class.getTotal(), .01);
		assertEquals(memberBonus,p4Class.isMemberBonus());
		
	}
}
