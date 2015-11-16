class swapping_numbers {
  public static void main(String[] args) {

    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("A : " + a);
    System.out.println("B : " + b);

    int c;

    c = b;
    b = a;
    a = c;

    System.out.println("A : " + a);
    System.out.println("B : " + b);
  }
}
