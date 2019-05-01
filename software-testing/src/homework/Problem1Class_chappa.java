package homework;

public class Problem1Class_chappa {
	
	private double total;
	private boolean specialOrderStatus;

	public void specialOrder (boolean deepDish, double ordAmount, int numPizzas) {

		double discount;
		if (ordAmount > 500.00 &&ordAmount<=5000.00)
			discount = 0.80;
		else
			if (ordAmount > 250.0)
				discount = 0.85;
			else
				if (ordAmount > 100.0)
					discount = 0.9;
				else
					if (ordAmount > 50.0)
						discount = 0.95;
					else
						discount = 1.00;
		total = ordAmount*(discount)*1.0825;
				
		specialOrderStatus = (deepDish) && ((ordAmount > 50.0) || (numPizzas > 4) ) ||
				(!deepDish) && ((ordAmount <= 50.0) || (numPizzas > 4) || (ordAmount > 50.0)&&(numPizzas <= 4) );
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