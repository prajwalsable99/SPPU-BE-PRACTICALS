
class assign1{

    static int fib_rec(int n)
    {
        if (n ==1)
            return 0;
        else if(n==2)return 1;
        return fib_rec(n - 1) + fib_rec(n - 2);
    }
    static int fib_iter(int n)
    {
        if(n==1)return 0;
        else if(n==2)return 1;
        int f1,f2,f3=0;
        f1=0;
        f2=1;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fib_iter(i) + " " );
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(fib_rec(i) + " " );
        }

        

    }
}