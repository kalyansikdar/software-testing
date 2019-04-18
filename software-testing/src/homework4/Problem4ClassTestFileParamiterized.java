package homework4;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTestFileParamiterized {

	private Problem4Class p4Class;
	
	@Before
	public void setUp () {
		p4Class = new Problem4Class();
	}
	
	@Test
	@FileParameters("src/homework4/Problem4.csv")	
	public void testDetermineMemberBonus(int testcaseNumber, double cart, boolean firstTimeBuyer, boolean goldStatus, int bonusPoints, 
			double taxRate, double total, boolean memberBonus) {		
		p4Class.determineMemberBonus(cart, firstTimeBuyer, goldStatus, bonusPoints, taxRate);
		
		assertEquals(total,p4Class.getTotal(), .01);
		assertEquals(memberBonus,p4Class.isMemberBonus());
	}
}