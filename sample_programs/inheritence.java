class addition{
  addition(){
    System.out.println("Permitted Operations:");
    System.out.println("\tAddition");
  }

  double add(double a, double b) {
    return a + b;
  }

}

class subtraction extends addition{
  subtraction(){
    System.out.println("\tSubtraction");
  }

  double subtract(double a, double b){
    return a - b;
  }
}

class division extends subtraction{
  division(){
    System.out.println("\tDivision");
  }

  double divide(double a, double b){
    return a / b;
  }
}

class multiplication extends division{
  multiplication(){
    System.out.println("\tMultiplication");
  }

  double multiply(double a, double b){
    return a * b;
  }
}

class inheritence{
  public static void main(String[] args) {
    multiplication obj = new multiplication();
    double result = obj.multiply(4, 5);
    System.out.println("Result of a x b : " + result);

    addition obj1 = new addition();
    result = obj1.add(45, 76);
    System.out.println("Result of a + b : " + result);

    addition obj2 = new multiplication();
    result = obj2.add(4, 5);
    System.out.println("Result of a x b : " + result);
  }
}
