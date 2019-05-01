package homework;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2Class_Hw5FileParamiterized {

	private Problem2Class_HW5 p2Class;
	
	@Before
	public void setUp () {
		p2Class = new Problem2Class_HW5();
	}
	
	@Test
	@FileParameters("src/homework/Problem2_new.csv")	
	public void testSpecialOrder(int testcaseNumber, boolean existingMember, boolean validDiscount, 
			int memberPoints, double total, double expTotal) {		
		double result = p2Class.calcTotal(total, existingMember, validDiscount, memberPoints);
		
		assertEquals(expTotal, result, .01);
	}
}