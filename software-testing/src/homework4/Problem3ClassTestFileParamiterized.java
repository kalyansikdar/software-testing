package homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTestFileParamiterized {

	private Problem3Class p3Class;
	
	@Before
	public void setUp () {
		p3Class = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/homework4/Problem3.csv")	
	public void test(int testcaseNumber, double distance, int count, boolean greenLight, 
    		boolean yellowLight, boolean redLight, boolean buzzer, boolean brakes, int count2) {		
		p3Class.setCount(count);
		p3Class.setWarnings(distance);
		
		assertEquals(greenLight,p3Class.isGreenLight());
		assertEquals(yellowLight,p3Class.isYellowLight());
		assertEquals(redLight,p3Class.isRedLight());
		assertEquals(buzzer,p3Class.isBuzzer());
		assertEquals(brakes,p3Class.isBrakes());
		assertEquals(count2,p3Class.getCount());
	}
}