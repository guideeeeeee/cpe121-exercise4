public class ex4_3 {
    public static void main(String[] args) {
        mi mIn = new mi();
        double total = 0;
        System.out.println("i\t\t\tm(i)");
        for (int j =1;j<=901;j++){
            total+=mIn.m(j);
            if(j%100==1)
              System.out.printf("%d\t\t\t %.4f\n",j,(total*4));
        }
    }
}
