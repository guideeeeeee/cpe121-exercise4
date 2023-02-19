import java.util.Scanner;
public class ex4_1 {
  public static void main (String[]args){
    Scanner sn = new Scanner(System.in);
    abc abcin = new abc();
    System.out.print("Enter 3 numbers:");
    int ina = sn.nextInt();
    int inb = sn.nextInt();
    int inc = sn.nextInt();
    boolean test = abcin.calabc(ina,inb,inc);
    System.out.println(test);
  }
}