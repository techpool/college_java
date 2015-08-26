class parent{

	parent(){
		System.out.print("Hello ");
	}
}

class super_method extends parent{
	super_method(){
		super();
		System.out.println("Child");
	}

	public static void main(String args[]){
		super_method obj = new super_method();
	}
}