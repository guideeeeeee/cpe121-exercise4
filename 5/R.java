class R{
  public static int reverse(int number){
    int i =1;
    String word="";
    do{
      word = word +Integer.toString(((number/i)%10));
      i*=10;
    }while(number%i !=number);
    return Integer.parseInt(word);
  }
}