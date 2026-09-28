package specifiers;

class A {
  private int a;

  void Display() {
    System.out.println("A: " + a);
  }
}

class B extends A {

  int b;

  void Display() {
    System.out.println("B: " + b);
  }

}

public class private_default {
  public static void main(String[] args) {
    B objB = new B();

    objB.Display();
  }
}
