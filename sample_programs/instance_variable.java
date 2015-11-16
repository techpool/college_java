class instance_variable{
  int a = 40;
  void method(int a) {
    System.out.println("Local variable: " + a);
    System.out.println("Instance variable:" + this.a);
  }

  public static void main(String[] args) {
    instance_variable obj = new instance_variable();
    obj.method(24);
  }
}
