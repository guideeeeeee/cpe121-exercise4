class D{
  public static int sumDigits(int n){
    int i =1;
    int sum = 0;
    do{
    sum+=(n/i)%10;
    i*=10;
    } while(n%i!=n);
    return sum;
  }
}