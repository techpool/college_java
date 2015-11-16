class addition {
  public static void main(String[] args) {
    try {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);

      System.out.println("You entered :");
      System.out.println("A : " + a);
      System.out.println("B : " + b);
      System.out.println("A + B : " + (a / b));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Please give all the required arguments.");
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
