
class reverse_a_no
{
    public static int helper(int n)
    {
        if(n<10)
            return 1;
        else
            return (int) Math.log10(n) +1;
    }

    public static int num(int n,int i)
    {
        if(n<10)
            return n;
        return n%10 * (int)Math.pow(10,i) + num(n/10,i-1);
    }

    public static void main(String[] args) {
        int n=4321;
        int dig=helper(n);
        System.out.println(num(n,dig-1));
    }

    }
