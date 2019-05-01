package homework;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {
	private Problem2Class p2class;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem2ClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//				Test case 1
				$(Problem2ClassStatus.NorthernHemisphere,   120.1,	30.5, true),
//				Test case 2
				$(Problem2ClassStatus.SouthernHemisphere,	80.0,	31.1,true),
//				Test case 3
				$(Problem2ClassStatus.NorthernHemisphere,   120.0,	30.6, true),
//				Test case 4
				$(Problem2ClassStatus.SouthernHemisphere,   79.9,	31.1, false),
//				Test case 5
				$(Problem2ClassStatus.NorthernHemisphere,   120.1,	39.1, true),
//				Test case 6
				$(Problem2ClassStatus.SouthernHemisphere,   80.0,	39.6, false),
//				Test case 7
				$(Problem2ClassStatus.NorthernHemisphere,   120.0,	30.5, false),
//				Test case 8
				$(Problem2ClassStatus.SouthernHemisphere,   80.0,	31.0, false),
//				Test case 9
				$(Problem2ClassStatus.NorthernHemisphere,   120.0,	39.0, true),
//				Test case 10
				$(Problem2ClassStatus.SouthernHemisphere,   80.0,	39.5, true),
//				Test case 11
				$(Problem2ClassStatus.NorthernHemisphere,   0.0,	39.1, false),
//				Test case 12
				$(Problem2ClassStatus.NorthernHemisphere,   150.0,	39.1, true),
//				Test case 13
				$(Problem2ClassStatus.NorthernHemisphere,   120.0,	0.0, false),
//				Test case 14
				$(Problem2ClassStatus.NorthernHemisphere,   120.0,	40.0, false)
		);
	}

	@Before
	public void setUp() throws Exception {
		p2class = new Problem2Class();
	}
	
	@Test
	@Parameters(method="parametersForProblem2ClassTest")
	public void testhighPressCell(Problem2ClassStatus status, double temp, double pressure, boolean HPCell) {
		
		assertEquals(HPCell, p2class.highPressCell(status, temp, pressure));
	}

}
