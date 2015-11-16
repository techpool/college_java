abstract class Shape{
  abstract double getArea(double a, double b);
  void method(){
    System.out.println("I am a non-abstract method");
  }
}

class rectangle extends Shape{
  double getArea(double l, double b){
    return l * b;
  }
}

class triangle extends Shape{
  double getArea(double b, double h){
    return 0.5 * b * h;
  }
}

class abstract_class{
  public static void main(String[] args) {
    Shape obj = new rectangle();
    System.out.println("Area of the rectangle is : " + obj.getArea(2, 3));
    obj.method();

    Shape obj1 = new triangle();
    System.out.println("Area of the triangle is : " + obj1.getArea(2, 3));
    obj1.method();
  }
}
