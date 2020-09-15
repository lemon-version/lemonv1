package lesson1;

public class MyClass {
/*
 * this is my first program 
 * multilinee command
 */
	//different single command 
	public static void main(String[] args) {
		//perfect calling , static method call through class name,not object name.

		//static -> members belong to the class instead of a specific instance.
		//int a =10 ;
		//int variable_name = 12;
		///System.out.println("hello world!!!");
		//System.out.println(a);
		//System.out.println(variable_name);
		
		
		StaticHello instance0 = new StaticHello();
		//static->members belong to the class instead of a specific instance.
		//perfect calling , static method call through class name,not object name.
		
		String first=StaticHello.static_method("static class calling!");
		
		
		//incorrect way ,run but give error suggetions
		String first1=instance0.static_method("static instance calling");
		
		//cant call class name ,only static method allowed
		String second=instance0.non_static_method("non static instance calling");
		
		System.out.println(first+"\n"+ first1+" \n"+second);
		
		instance0.age=39;
		StaticHello.age=10;
		System.out.println(instance0.age);//not printing its value,run it..
		System.out.println(StaticHello.age);
		
		instance0.roll_number=39;
		//StaticHello.roll_number=10; //error
		System.out.println(instance0.roll_number);
		//System.out.println(StaticHello.roll_number);//error
		
		
		
		//inheritance main class
		Rectangle_Inheritance recin =new Rectangle_Inheritance();
		triangle_Inheritance triin = new triangle_Inheritance();
		recin.set_values(45, 47);
		triin.set_values(34, 42);
		
		System.out.println("area of rectangle: "+ recin.area());
		System.out.println("area of triangle: "+ triin.area());
		
		
		
		
		
		
		
	}

}
