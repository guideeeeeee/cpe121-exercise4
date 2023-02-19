import java.util.Scanner;
public class ex4_5{
  public static void main (String[]args){
    
    Scanner sn = new Scanner(System.in);
    R re = new R();
    System.out.print("Enter an integer:");
    int n = sn.nextInt();
    System.out.println(re.reverse(n));
  }

}