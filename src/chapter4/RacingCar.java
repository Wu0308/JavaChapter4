package chapter4;

public class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCar(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("生產了編號為"+ course +"的賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為" + course);
	}

	public void newShow() {
		System.out.println("賽車的車號是"+ num);
		System.out.println("汽油量是"+ gas);
		System.out.println("賽車的編號是"+ course);
	}
	
	public void show() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}
	
	
		
}
