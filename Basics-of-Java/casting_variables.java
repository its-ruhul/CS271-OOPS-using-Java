public class casting_variables {
  public static void main(String[] args){

    //Implicit casting
    float x = 3;
    int y = 2;
    long z = y;

    //Explicit casting
    int a = (int)x;
    
    int b = 'A';
    char c = 66;

    System.out.println(x + " " + y + " " + z + " " + a);
    System.out.println(b + " " + c);
    
    System.exit(0);
  }
}
