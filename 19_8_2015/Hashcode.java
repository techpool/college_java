class Hashcode
{
	void m(Hashcode s){
		System.out.println(s);
	}

	Hashcode(){
		m(this);
	}

	public static void main(String args[]){
		Hashcode obj=new Hashcode();

	} 
}