class Const{

	Const(){

		System.out.println("This is just a simple constructor with no parameter.");	

	}

	Const(int a, int b){

		int result;
		System.out.println("This constructor takes two parameters: " + a + " and " + b);
		result = a + b;
		System.out.println("Sum of " + a + " and " + b + " is: " + result);	

	}

	Const(float a, float b){
		
		float result;
		System.out.println("This constructor multiplies two floating point numbers: " + a + " and " + b);
		result = a * b;
		System.out.println("Multiplying " + a + " * " + b + " = " + result);
	
	}
	
	public static void main(String args[]){
	
		float c = Float.parseFloat(args[0]);
		float d = Float.parseFloat(args[1]);
		
		int a = (int) c;
		int b = (int) d;
		
		Const simple = new Const();
		Const sum = new Const(a, b);
		Const mult = new Const(c, d);
					

	}
}