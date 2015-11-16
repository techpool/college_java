class hashcode_print{
  static void printHash(hashcode_print obj){
    System.out.println("Hashcode : " + obj);
  }

  public static void main(String[] args) {
    hashcode_print obj1 = new hashcode_print();
    hashcode_print obj2 = new hashcode_print();
    printHash(obj1);
    printHash(obj2);
  }
}
