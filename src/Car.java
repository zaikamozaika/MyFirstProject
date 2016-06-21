
public class Car {
 String color;
 int numberOfDoors;
 
 boolean startEngine(){
	 return true;
 }
 
 boolean stopEngine(){
	 return false;
 }
 

 @Override
 public String toString(){
	 return super.toString()+"My color is "+this.color+" and I have "+this.numberOfDoors+" doors.";
 }
}
