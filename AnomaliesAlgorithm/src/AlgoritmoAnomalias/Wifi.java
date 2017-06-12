package AlgoritmoAnomalias;

import java.util.Scanner;

public class Wifi {

	public double weight() {
		double wifiRSSI = receiveWifiRSSI();
		double wifiState = receiveWifiState();
		double b = receiveBatteryPower()/100;
		return wifiRSSI * wifiState * b;
	}
	
	public double receiveWifiRSSI() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("wifiRSSI: ");
		return input.nextDouble();
	}
	
	public double receiveWifiState() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("wifiState: ");
		return input.nextDouble();
	}
	
	public double receiveBatteryPower() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("batteryPower: ");
		return input.nextDouble();
	}
	
}
