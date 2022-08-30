Head rec:                                                               


int fact(int n)
{
if(n==0 || n==1)
return 1;

return n*fact(n-1);
}




// better than head rec in terms of time and space optimization
Tail rec equivalent:

 1)  static int prod=1;                                // prod is static or global then prod will have same value for all recursive calls
    public static int fact(int n)
    {
        if(n==1 || n==0)
            return 1;
        prod*=n;
        fact(n-1);
        return prod;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    
    2)  int fact(int n,int k)
    {
    if(n==0 || n==1)
    {
    return k;
    }
    
    return fact(n-1,k*n);
    }

