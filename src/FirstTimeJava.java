//method: function inside an object
//Everything in java is an object
public class FirstTimeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		//Same as writing console.log in JS ("S" in system has to be capital)
		//Java is object oriented
		//Primitive types 
		//Four integer types 
		//(OF THE FOUR 2 ARE FLOATING TYPES)
		//FOR STRINGS "'CHAR'ACTER"
		//AND IN ADDITION TO CHAR, STRING CLASS CALLED "String"
		
		boolean isThursday = true;
		boolean isHungry = false;
		
//		int age = 27;
		
		byte aByte = 127;
		
		short aShort = 4000;
		
		long aLong = 123456789;
		
		// these are four different ways of integer types
		
		//Floats
		// 'Double' most used primitive type for large decimals
		// Whenever you use 'float' you must put a 'f' at the end of your variable
		
		double pie = 3.14;
		
		float morePie = 3.14f;
		
		//'Char' uses single quotes ''
		char c = 'c';
		
		// double quotes for 'String'
		String comment = "Todays a nice day";
		
		comment = "I wanna fly";
		System.out.println(comment);
		
		// in Java creating a variable without a type is an "illegal operation"
		
		// final makes the variable a constant 
		final String favoriteFood = "paella";
//		favoriteFood = "pizza";
		
		System.out.println(comment + " and i want " + favoriteFood);
		
		double weigth = 150;
		double venusWeight = weigth * 0.91;
		
		System.out.println("Object's weight on venus is " + venusWeight);
		
		int x = 18;
		int y = 20;
		if (x > y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("y is greater than x");
		}
		
		int age = 19;
		
		if (age > 20){
			System.out.println("You can have a drink");
		}else if (age > 17) {
			System.out.println("Not old enough");
		} else {
			System.out.println("Go home, way too young");
		}
		
	}

}
