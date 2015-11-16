interface area{
  double getArea(double a, double b);
}

interface perimeter{
  double getPerimeter(double a, double b);
}

class interface_implementation implements perimeter, area{

  public double getPerimeter(double a, double b){
    return 2 * (a + b);
  }

  public double getArea(double a, double b){
    return a * b;
  }

  public static void main(String[] args) {
    interface_implementation obj = new interface_implementation();
    System.out.println("Area : " + obj.getArea(2, 3));
    System.out.println("Perimeter : " + obj.getPerimeter(2, 3));
  }
}
