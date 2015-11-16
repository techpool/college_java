class copy_constructor{

  int a, b;

  copy_constructor(){
    //do nothing
  }

  copy_constructor(copy_constructor obj){
    this.a = obj.a;
    this.b = obj.b;
  }
  public static void main(String[] args) {
    copy_constructor obj = new copy_constructor();
    obj.a = 25;
    obj.b = 67;

    System.out.println("obj.a = " + obj.a);
    System.out.println("obj.b = " + obj.b);

    copy_constructor obj1 = new copy_constructor(obj);
    System.out.println("After copying object into constructor:");
    System.out.println("obj1.a = " + obj1.a);
    System.out.println("obj1.b = " + obj1.b);

  }
}
