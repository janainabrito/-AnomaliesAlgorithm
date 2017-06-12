package AlgoritmoAnomalias;

import java.util.Scanner;

public class Gpu {

	public double weight() {
		double fgpu = receiveFgpu();
		double gpuLoad = receiveGpuLoad();
		return fgpu * (gpuLoad / 100);
	}

	public double receiveFgpu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("fgpu(MHz): ");
		return input.nextDouble();
	}

	public double receiveGpuLoad() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("gpuLoad(%): ");
		return input.nextDouble();
	}

}
