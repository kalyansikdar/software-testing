package homework;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		Problem1Class_HW5 p1class = new Problem1Class_HW5();
		
		int testcaseNumber = 1;
		boolean deepDish = true;
		double ordAmount = 500.00;
		int numPizzas = 5;
		double discount = 0.2;
		double total = 108.25;
		boolean specialOrderStatus = true;
		
		p1class.specialOrder(deepDish, ordAmount, numPizzas);
		//determineMemberBonus(cart, firstTimeBuyer, goldStatus, bonusPoints, taxRate);
			
			assertEquals(total, p1class.getTotal(), .01);
			assertEquals(specialOrderStatus, p1class.isSpecialOrderStatus());
	}

}
