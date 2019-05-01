package homework;

public class Problem1Class_HW5 {
	
	private double total;
	private boolean specialOrderStatus;

	public void specialOrder (boolean deepDish, double ordAmount, int numPizzas) {

		double discount;
		if (ordAmount > 500.0)	// Changed the condition from (ordAmount >= 100.0) to (ordAmount > 500.0)
			discount = 0.20;
		else
			if (ordAmount > 250.0) // changed from (ordAmount >= 250.0)
				discount = 0.15;
			else
				if (ordAmount > 100.0) // Changed the condition from (ordAmount > 500.0) to (ordAmount > 100.0)
					discount = 0.1;
				else
					if (ordAmount <= 50.0)
						discount = 0.0;
					else
						discount = 0.05;
		total = ordAmount*(1-discount)*1.0825;
				
		specialOrderStatus = (deepDish) && ((ordAmount > 50.0) || (numPizzas > 4) ) ||
				(!deepDish) && ((ordAmount <= 50.0) || (numPizzas > 4) || (ordAmount > 50.0)&&(numPizzas <= 4)); 
		}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isSpecialOrderStatus() {
		return specialOrderStatus;
	}

	public void setSpecialOrderStatus(boolean specialOrderStatus) {
		this.specialOrderStatus = specialOrderStatus;
	}
}