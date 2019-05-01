package homework;

public class Problem2Class_HW5 {
	
	public double calcTotal (double total, boolean existingMember, boolean validDiscount, int memberPoints) {
		
		return ((existingMember || validDiscount && memberPoints>=650) && (total >= 2_000.0)) ? 0.85*total*1.0825 : total*1.0825;
	}
}