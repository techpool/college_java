class constructor_chaining{
  constructor_chaining(){
    System.out.println("I am a non-parameterized constructor");
  }

  constructor_chaining(int a){
    this();
    System.out.println("Parameterized constructor:");
    System.out.println("a: " + a);
  }

  constructor_chaining(int a, int b){
    this(a);
    System.out.println("Two Parameterized constructor:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }

  public static void main(String[] args) {
    constructor_chaining obj = new constructor_chaining(45, 76);
  }
}
