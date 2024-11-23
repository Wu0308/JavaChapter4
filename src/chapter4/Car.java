package chapter4;

public class Car extends Vehicle implements iVehicle,iMaterial{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas +"的車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num + "，汽油量設為" + gas);
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("速度是" + speed);
	}
	
	public String toString() {
		String str = "車號:"+ num + ";汽油量:" + gas;
		return str;
	}

	
	public void mShow() {
		System.out.println("車子的材質是鐵");
		
	}

	public void vShow() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	
	
	
	
	
	
	
}
