package objects;

class Super {
  int age = 109;

  void show() {
    System.out.println("age " + age);
  }
}

class sub_class extends Super {
  int Roll_no = 10;

  void display() {
    System.out.println("roll no " + Roll_no);
  }
}

class sub_class2 extends sub_class {

  void display() {
    System.out.println("Roll no 2: " + age);
  }
}

public class inheritance {
  public static void main(String[] args) {
    sub_class2 A = new sub_class2();

    A.age = 10;
    A.show();

    A.age = 123;
    A.display();

    int a = 2, b = 4;
    int res = a++ * --b + ++a * b++ - --a;

    System.out.println(res);
  }
}
