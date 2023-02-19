import java.util.Scanner;
public class ex4_7{
  public static void main(String[]args){
    a aver = new a();
    Scanner sn = new Scanner(System.in);
    System.out.print("input in 1.Integer 2.Double :");
    int input = sn.nextInt();
    switch (input){
      case 1:
        System.out.print("Enter five numbers:");
        int i1i = sn.nextInt();
        int i2i = sn.nextInt();
        int i3i = sn.nextInt();
        int i4i = sn.nextInt();
        int i5i = sn.nextInt();
        System.out.printf("Average value: %d",aver.average(i1i,i2i,i3i,i4i,i5i));
        break;
      case 2:
        System.out.print("Enter five numbers:");
        double i1d = sn.nextDouble();
        double i2d = sn.nextDouble();
        double i3d = sn.nextDouble();
        double i4d = sn.nextDouble();
        double i5d = sn.nextDouble();
        System.out.printf("Averrage value: %.2f",aver.average(i1d,i2d,i3d,i4d,i5d));
        break;
      default:
        System.out.print("Error");
        break;      
    } 
  }
}