class test{
  int a,b;
  test(int i,int j){
    a = i;
    b = j;
  }
  boolean compare(test obj){
    if(obj.a == a && obj.b == b){
      return true;
    }
    else{
      return false;
    }
  }
}

class compobj{
  public static void main(String args[]){
    test obj1 = new test(100,22);
    test obj2 = new test(100,22);
    test obj3 = new test(-1,-1);
    System.out.println("obj1==obj2:" + obj1.compare(obj2));
    System.out.println("obj1==obj3:" + obj1.compare(obj3));
  }
}
