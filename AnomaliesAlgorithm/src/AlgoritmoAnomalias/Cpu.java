package AlgoritmoAnomalias;

import java.util.Scanner;

public class Cpu {

	double[] fcpu = new double[4];
	double[] cpuLoad = new double[4];
	double[] b = new double[4];

	public double weight() {
		double[] fcpu = receiveFcpu();
		double[] b = b();
		double weight = 0;
		for (int i = 0; i < fcpu.length; i++) {
			weight = weight + fcpu[i] * b[i];
		}
		return weight / 4;
	}

	public double[] receiveFcpu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < fcpu.length; ++i) {
			System.out.println("fcpu(MHz) " + fcpu[i] + ": ");
			fcpu[i] = input.nextDouble();
		}
		return fcpu;
	}

	public double[] receiveCpuLoad() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < cpuLoad.length; ++i) {
			System.out.println("cpuLoad(%) " + cpuLoad[i] + ": ");
			cpuLoad[i] = input.nextDouble();
		}
		return cpuLoad;
	}

	public double[] b() {
		double[] cpuLoad = receiveCpuLoad();
		for (int i = 0; i < cpuLoad.length; i++) {
			b[i] = cpuLoad[i] / 100;
		}
		return b;
	}

	public double[] getFcpu() {
		return fcpu;
	}

	public void setFcpu(double[] fcpu) {
		this.fcpu = fcpu;
	}

	public double[] getCpuLoad() {
		return cpuLoad;
	}

	public void setCpuLoad(double[] cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	public double[] getB() {
		return b;
	}

	public void setB(double[] b) {
		this.b = b;
	}

}
