package homework;

public class Problem3Class_HW5 {

	public int calcPrevBoxNumber (int boxInCarNum, int rrCarNum, int shipmentNum) {
		int[] BoxesperRRCar = {190, 200, 210, 215, 190, 200, 215, 210, 190};
		int boxSum=0;
		if (((shipmentNum % 5 == 0) && (shipmentNum % 10 != 0)) || (shipmentNum % 25 == 0)) 
			{
			BoxesperRRCar[1] = 210;
			BoxesperRRCar[2] = 200;
			}
		for (int i=0;i<rrCarNum-1;i++)
			boxSum+=BoxesperRRCar[i];
		return boxSum+=boxInCarNum;
	}
}