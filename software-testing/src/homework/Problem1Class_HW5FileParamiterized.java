package homework;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1Class_HW5FileParamiterized {

	private Problem1Class_HW5 p1Class;
	
	@Before
	public void setUp () {
		p1Class = new Problem1Class_HW5();
	}
	
	@Test
	@FileParameters("src/homework/Problem1_HW5.csv")	
	public void testSpecialOrder(int testcaseNumber, boolean deepDish, double ordAmount, int numPizzas, 
			double discount, boolean specialOrderStatus, double total) {		
		p1Class.specialOrder(deepDish, ordAmount, numPizzas);
		
		assertEquals(total, p1Class.getTotal(), .01);
		assertEquals(specialOrderStatus, p1Class.isSpecialOrderStatus());
	}
}