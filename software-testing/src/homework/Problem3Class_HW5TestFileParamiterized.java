package homework;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3Class_HW5TestFileParamiterized {

	private Problem3Class_HW5 p3Class;
	
	@Before
	public void setUp () {
		p3Class = new Problem3Class_HW5();
	}
	
	@Test
	@FileParameters("src/homework/Problem3_HW5.csv")	
	public void testCalcPrevBoxNumber(int testcaseNumber, int boxInCarNum, int rrCarNum, 
			int shipmentNum, int expectedBoxNumber) {			
		
		assertEquals(expectedBoxNumber,p3Class.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
	}
}