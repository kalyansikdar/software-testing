package homework;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ClassTestParameterized {

	private Problem2Class p2Class;
	Problem2ClassStatus status;
	double temp, pressure;
	boolean HPCell;

    @Before
	public void setUp() throws Exception {
    	p2Class = new Problem2Class();
	}

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
//			Parameters are: (1,2,3,4)
//			1=status, 2=temp(F), 3=pressure (inHg), 4=return
//			Test case 1
			{Problem2ClassStatus.NorthernHemisphere,   120.1,	30.5, true},
//			Test case 2
			{Problem2ClassStatus.SouthernHemisphere,	80.0,	31.1,true},
//			Test case 3
			{Problem2ClassStatus.NorthernHemisphere,   120.0,	30.6, true},
//			Test case 4
			{Problem2ClassStatus.SouthernHemisphere,   79.9,	31.1, false},
//			Test case 5
			{Problem2ClassStatus.NorthernHemisphere,   120.1,	39.1, true},
//			Test case 6
			{Problem2ClassStatus.SouthernHemisphere,   80.0,	39.6, false},
//			Test case 7
			{Problem2ClassStatus.NorthernHemisphere,   120.0,	30.5, false},
//			Test case 8
			{Problem2ClassStatus.SouthernHemisphere,   80.0,	31.0, false},
//			Test case 9
			{Problem2ClassStatus.NorthernHemisphere,   120.0,	39.0, true},
//			Test case 10
			{Problem2ClassStatus.SouthernHemisphere,   80.0,	39.5, true},
//			Test case 11
			{Problem2ClassStatus.NorthernHemisphere,   0.0,	39.1, false},
//			Test case 12
			{Problem2ClassStatus.NorthernHemisphere,   150.0,	39.1, true},
//			Test case 13
			{Problem2ClassStatus.NorthernHemisphere,   120.0,	0.0, false},
//			Test case 14
			{Problem2ClassStatus.NorthernHemisphere,   120.0,	40.0, false}
       });
    }

    public Problem2ClassTestParameterized(Problem2ClassStatus status, double temp, 
    		double pressure, boolean HPCell) {
    	this.status=status;
    	this.temp=temp;
    	this.pressure=pressure;
    	this.HPCell=HPCell;
    }
    
	@Test
	public void test() {
		assertEquals(HPCell, p2Class.highPressCell(status, temp, pressure));
		}
}