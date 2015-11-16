class parent{
  void method(){
    System.out.println("I am in the parent class");
  }
}

class super_keyword extends parent{
  void method() {
    super.method();
    System.out.println("I am in the child class");
  }

  public static void main(String[] args) {
    super_keyword obj = new super_keyword();
    obj.method();
  }
}
