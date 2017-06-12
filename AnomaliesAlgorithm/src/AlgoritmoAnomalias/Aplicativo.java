package AlgoritmoAnomalias;

public class Aplicativo {
	
	Cpu cpu = new Cpu();
	Display display = new Display();
	Gpu gpu = new Gpu();
	Gps gps = new Gps();
	MemoryUsage memoryUsage = new MemoryUsage();
	Wifi wifi = new Wifi();
	double weight = 0;

	public double weight(){
		return weight = cpu.weight() 
				 		+ display.weight() 
				 		+ gpu.weight() 
				 		+ gps.weight()
				 		+ memoryUsage.weight() 
				 		+ wifi.weight();
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Gpu getGpu() {
		return gpu;
	}

	public void setGpu(Gpu gpu) {
		this.gpu = gpu;
	}

	public Gps getGps() {
		return gps;
	}

	public void setGps(Gps gps) {
		this.gps = gps;
	}

	public MemoryUsage getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(MemoryUsage memoryUsage) {
		this.memoryUsage = memoryUsage;
	}

	public Wifi getWifi() {
		return wifi;
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
