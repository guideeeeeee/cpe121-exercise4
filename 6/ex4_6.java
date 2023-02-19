import java.util.Scanner;
public class ex4_6{
  public static void main(String[]args){
    dis d = new dis();
    Scanner sn = new Scanner(System.in);
    System.out.print("input in 1.Integer 2.Double :");
    int input = sn.nextInt();
    switch (input){
      case 1:
        System.out.print("Enter distance x1 y1 x2 y2:");
        int xi1 = sn.nextInt();
        int yi1 = sn.nextInt();
        int xi2 = sn.nextInt();
        int yi2 = sn.nextInt();
        System.out.printf("The distance value of point (%d,%d) and point (%d,%d) is %d",xi1,yi1,xi2,yi2,d.distance(xi1,yi1,xi2,yi2));
        break;
      case 2:
        System.out.print("Enter distance x1 y1 x2 y2:");
        double xd1 = sn.nextDouble();
        double yd1 = sn.nextDouble();
        double xd2 = sn.nextDouble();
        double yd2 = sn.nextDouble();
        System.out.printf("The distance value of point (%.1f,%.1f) and point (%.1f,%.1f) is %f",xd1,yd1,xd2,yd2,d.distance(xd1,yd1,xd2,yd2));
        break;
      default:
        System.out.print("Error");
        break;      
    } 
  }
}