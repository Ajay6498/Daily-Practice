public class ThisKey {
    // Program to illustrate this keyword 
    // is used to refer current class
 
	// instance variable
	int a = 10;

	// static variable
	static int b = 20;

	void GFG()
	{
		// referring current class(i.e, class ThisKey) 
		// instance variable(i.e, a)
		this.a = 100;

		System.out.println(a);

		// referring current class(i.e, class ThisKey) 
		// static variable(i.e, b)
		 this.b = 600;

		System.out.println(b);
	}

	public static void main(String[] args)
	{
		// Uncomment this and see here you get 
		// Compile Time Error since cannot use 
		// 'this' in static context.
		// this.a = 700;
		// this.b=200;
		new ThisKey().GFG();
	}
 

}
