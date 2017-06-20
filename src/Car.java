
public class Car {
		
	String mod;
	int price;
	int wheel;
	
	public Car(String mod, int price){
		this.mod = mod;
		this.price = price;
		System.out.println(mod +"-------"+price);
	}
	
	public Car(){
		System.out.println("in Car constructor");
		
	}
	
	public static void main(String args[]){
		Car c = new Car();
		
		c.mod = "Merc";
		c.price = 12565;
		c.wheel = 4;
		
		Car c2 = new Car();

		c2.mod = "BMW";
		c2.price = 223658;
		c2.wheel = 4;
		
		start();
	}
	
	public static void start(){
		System.out.println("Car is starting");
	}
	
	public void accel(){
		System.out.println("Car is accelerating");
	}

}
