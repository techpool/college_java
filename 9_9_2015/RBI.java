abstract class RBI{

	abstract double simpleInterest(double principle, int time);
	
	double compundInterest(double principle, int time){
		
		double rate = 15;
		double ci;
		ci = (principle * Math.pow((1 + (rate/100)), time)) - principle;
		return ci;
	}
	

}

class SBI extends RBI{
	double simpleInterest(double principle, int time){
		double rate = 12;
		double si;
		si = principle * time * rate/100;
		return si;
	}
}

class BOB extends RBI{
	double simpleInterest(double principle, int time){
		double rate = 11;
		double si;
		si = principle * time * rate/100;
		return si;
	}
}

class bank{
	
	public static void main(String args[]){
		RBI sbiAccount = new SBI();
		System.out.println(sbiAccount.simpleInterest(1000, 4));
		System.out.println(sbiAccount.compundInterest(1000, 4));
		RBI bobAccount = new BOB();
		System.out.println(bobAccount.simpleInterest(1000, 4));
		System.out.println(bobAccount.compundInterest(1000, 4));

	}	

}