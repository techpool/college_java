class statMethod{

	static void circumfurence(int rad){
	
		float circum = (2 * 22 * rad )/ 7;
		System.out.println("Circumfurence of the circle is = " + circum);	
	
	}
	
	public static void main(String []args){
	
		int r = Integer.parseInt(args[0]);
		circumfurence(r);	

	}

}