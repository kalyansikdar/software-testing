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
public class Problem3ClassTestParameterized {

	private Problem3Class p3Class;
    double distance;
    int count, count2;
    boolean greenLight, yellowLight, redLight, buzzer, brakes;

    @Before
	public void setUp() throws Exception {
    	p3Class = new Problem3Class();
	}

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
//			Parameters are: (1,2,3,4,5)
//			1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//            Test case 1
			{400.0,   2,	true,	false,	false,	false,	false,	0},
//			Test case 2
			{95.1,   2,	false,	true,	false,	false,	false,	0},
//			Test case 3
			{50.0,   2,	false,	true,	false,	true,	false,	0},
//			Test case 4
			{25.1,   2,	false,	false,	true,	true,	false,	0},
//			Test case 5
			{25.0,   1,	false,	false,	true,	true,	false,	0},
//			Test case 6
			{25.0,   2,	false,	false,	true,	true,	true,	3},
//			Test case 7
			{49.9,   2,	false,	false,	true,	true,	false,	0},
//			Test case 8
			{95.0,   2,	false,	true,	false,	true,	false,	0},
//			Test case 9
			{399.9,	2,	false,	true,	false,	false,	false,	0},
//			Test case 10
			{25.0,   0,	false,	false,	true,	true,	true,	1},
//			Test case 11
			{0.0,   2,	false,	false,	true,	true,	true,	3},
//			Test case 12
			{1000.0,   2,	true,	false,	false,	false,	false,	0}
       });
    }

    public Problem3ClassTestParameterized(double distance, int count, boolean greenLight, 
    		boolean yellowLight, boolean redLight, boolean buzzer, boolean brakes, int count2) {
    	this.distance=distance;
    	this.count=count;
    	this.greenLight=greenLight;
    	this.yellowLight=yellowLight;
    	this.redLight=redLight;
    	this.buzzer=buzzer;
    	this.brakes=brakes;
    	this.count2= count2;
    }
    
	@Test
	public void test() {
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