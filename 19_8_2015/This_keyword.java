class This_keyword{
	
	int temp;

	This_keyword(){
		System.out.println("Non-parameterized constructor");
	}

	This_keyword(int a, int b){
		this();
		System.out.println("Parameterized Contructor == ");
		System.out.println("First parameter = " + a );
		System.out.println("Second parameter = " + b);
	}
	
	void this_method(int temp){
			
		this.temp = temp;
		temp = temp + 1;
		System.out.println("Value of temp in the method = " + temp);
	}

	public static void main(String args[]){
		This_keyword obj = new This_keyword(75, 36);
		obj.this_method(45);
		System.out.println("Value of temp globally = " + obj.temp);

	}
}