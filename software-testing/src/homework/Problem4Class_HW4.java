package homework;

public class Problem4Class_HW4 {
	
	public double calcTotal (double total, boolean existingMember, boolean validDiscount, Problem4ServerData sMemberPoints) {
		
		return ((existingMember || validDiscount && sMemberPoints.getMemberPoints()>=650) && (total >= 2_000.0)) ? 0.85*total*1.0825 : total*1.0825;
	}
}