package chapter4;

public class Plane extends Vehicle implements iVehicle{
	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}

	
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}


	public void vShow() {
	}

}
