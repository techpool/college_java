class function_call{

  void method()  {
    System.out.println("I am in another method");
  }


  public static void main(String[] args) {
    function_call obj = new function_call();
    obj.method();
    System.out.println("I am in the main method");
  }
}
