package homework;

public class Problem1Class_HW5 {
	
	private double total;
	private boolean specialOrderStatus;

	public void specialOrder (boolean deepDish, double ordAmount, int numPizzas) {

		double discount;
		double taxrate = 0.0825;
		if (ordAmount > 500.0)
			discount = 0.20;
		else
			if (ordAmount > 250.0)
				discount = 0.15;
			else
				if (ordAmount > 100.0)
					discount = 0.1;
				else
					if (ordAmount > 50.0)
						discount = 0.05;
					else
						discount = 0.0;
		total = ordAmount * (1-discount) * (1+taxrate); // updated the equation with (1-discount)
		
		specialOrderStatus = (!deepDish) || (ordAmount > 50.0) || (numPizzas > 4);  // simplified the given 
		//equation and updated it as per the k-map result
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