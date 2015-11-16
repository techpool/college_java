class static_method{
  static void method(){
    System.out.println("I am a static method.");
  }

  static void method2(){
    method();
    System.out.println("I am the second static method.");
  }

  public static void main(String[] args) {
    method2();
  }
}
