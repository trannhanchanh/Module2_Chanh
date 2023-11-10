package demo;

  class A {
      int a = 40;

    public A() {
    }

    /*non static*/
    public static void main(String args[]) {
        A a1 = new A();
        System.out.println(a1.a);
    }
}