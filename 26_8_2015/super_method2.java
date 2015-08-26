class parent{
	void print(){
		System.out.println("I am in the parent class");
	}
}

class super_method2 extends parent{
	
	void print(){
		super.print();
		System.out.println("I am in the child class");
	}

	public static void main(String args[]){
		super_method2 obj = new super_method2();
		obj.print();
		
	}
}