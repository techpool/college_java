class static_block{
  static {
    int i = 0;
    System.out.println("Yeah! I am static now!");
  }

  static {
    System.out.println("I am in another static block.");
  }

  public static void main(String[] args) {

  }
}
