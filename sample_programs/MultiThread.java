class MultiThread extends Thread{

  public void run(){
    System.out.println("Thread is running now");
    for (int i = 0; i < 5; i++) {
      try {
          this.sleep(500);
      } catch (Exception e) {
          System.out.println("Exception in sleeping thread");
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    MultiThread t1 = new MultiThread();
    MultiThread t2 = new MultiThread();
    t1.start();
    try {
      t1.join(1000);
    } catch (Exception e) {
      System.out.println("Cannot join");
    }
    t2.start();
  }
}
