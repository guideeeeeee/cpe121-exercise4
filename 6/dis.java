class dis{
  public static int distance(int x1, int y1,int x2,int y2){
    int result;
    result = (int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    return result;
  }
  public static double distance(double x1, double y1,double x2,double y2){
    double result;
    result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    return result;
  }
}