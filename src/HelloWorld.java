
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color ="blue";
		car2.color = "red";
		
		car1.numberOfDoors = 5;
		car2.numberOfDoors = 3;
		
		
		System.out.println("The first car is "+car1.color);
		System.out.println("The second car is "+ car2.color);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());

	}

}
