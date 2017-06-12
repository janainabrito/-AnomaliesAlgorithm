package AlgoritmoAnomalias;

import java.util.Scanner;

public class Gps {

	public double weight() {
		double gpsState = receiveGpsState();
		double b = 301.55; // PowerTutor proportional
		return gpsState * b;
	}

	public double receiveGpsState() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("gpsState: ");
		return input.nextDouble();
	}

}
