class abc {
    public boolean calabc(int a, int b,int c){
        if (a>b && a>c && c<a && c<b)
            return false;
        else if (a>b && a>c || c<a && c<b)
            return true;
        else 
        return false;
    }
}
