import java.util.Scanner;
public class ex4_4{
  public static void main (String[]args){
    D digit = new D();
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a number :");
    int come = sn.nextInt();
    System.out.printf("The sum of digits for %d is %d",come,digit.sumDigits(come));
  }
}