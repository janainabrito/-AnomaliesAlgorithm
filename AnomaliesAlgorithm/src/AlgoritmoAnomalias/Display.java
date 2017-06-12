package AlgoritmoAnomalias;

import java.util.Scanner;

public class Display {

	public double weight() {
		double brightness = receiveBrightness();
		double screenState = receiveScreenState();
		double b = 8.1; // PowerTutor proportional
		return brightness * screenState * b;
	}

	public double receiveBrightness() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("brightness: ");
		return input.nextDouble();
	}

	public double receiveScreenState() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("screenState: ");
		return input.nextDouble();
	}
}