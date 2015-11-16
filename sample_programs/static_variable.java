class static_variable{
  static int a = 40;
  void method1()  {
    a = 50;
  }

  void method2() {
    a = 60;
  }

  public static void main(String[] args) {
    static_variable obj = new static_variable();
    System.out.println("a : " + a);
    obj.method1();
    System.out.println("a : " + a);
    obj.method2();
    System.out.println("a : " + a);
  }
}
