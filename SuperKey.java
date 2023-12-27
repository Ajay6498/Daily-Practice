public class SuperKey {
    // Program to illustrate super keyword
// refers super-class instance

 
	// instance variable
	int a = 10;

	// static variable
	static int b = 20;
  
}
class Base extends SuperKey {
	 void rr()
	{
		// referring parent class(i.e, class Parent)
		// instance variable(i.e, a)
        int a=100;
		System.out.println(super.a);

		// referring parent class(i.e, class Parent)
		// static variable(i.e, b)
          this.b=200;
		System.out.println(super.b);
	}

	public static void main(String[] args)
	{
		// Uncomment super and see here you get
		// Compile Time Error since cannot use 'super'
		// in static context.
		// super.a = 700;
		new Base().rr();
	}
}


