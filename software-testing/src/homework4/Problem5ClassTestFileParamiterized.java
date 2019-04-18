package homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTestFileParamiterized {

	private Problem5Class p5Class;
	
	@Before
	public void setUp () {
		p5Class = new Problem5Class();
	}
	
	@Test
	@FileParameters("src/homework4/Problem5.csv")	
	public void testCalcY(int testcaseNumber, double x, double y) {		
		
		assertEquals(y,p5Class.calcY(x), .001);
	}
}