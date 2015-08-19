class stat{
	
	static int a;
	int b;

	public static void main(String args[]){

		stat obj1 = new stat();
		stat obj2 = new stat();
		stat obj3 = new stat();

		obj1.a = 45;
		obj1.b = 45;

		obj2.a = 32;
		obj2.b = 32;
		
		obj3.a = 85;
		obj3.b = 85;

		System.out.println("Object 1:");
		System.out.println("a:" + obj1.a);			
		System.out.println("b:" + obj1.b);



		System.out.println("Object 2:");
		System.out.println("a:" + obj2.a);			
		System.out.println("b:" + obj2.b);



		System.out.println("Object 3:");
		System.out.println("a:" + obj3.a);			
		System.out.println("b:" + obj3.b);
	}

}