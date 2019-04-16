package homework4;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		Problem1Class p1class = new Problem1Class();
		double rate = 0.95;
//		System.out.println(p1class.calcRate(true, true, 5000.00));
		assertEquals(rate, p1class.calcRate(true, true, 5000.00), 0.001);
		System.out.println(p1class.calcRate(true, true, 5000.00));
	}

}
