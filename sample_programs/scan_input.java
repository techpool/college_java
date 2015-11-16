class scan_input{
  public static void main(String[] args) {
    try {
      int a = 0;
      while(true){
        System.out.println("Number " + a + " : " + args[a]);
        a = a + 1;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Thats all you have entered");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
