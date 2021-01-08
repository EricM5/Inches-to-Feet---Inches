import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true) {
      System.out.print("Enter your height in inches: ");
      Scanner in = new Scanner(System.in);
      int inches = in.nextInt();
      int feet = inches / 12;
      int inchesfinal = inches % 12;
      System.out.println("A height of: " + inches + "\"" + " = " + feet + "'" + inchesfinal + "\""); 
    }
  }
}