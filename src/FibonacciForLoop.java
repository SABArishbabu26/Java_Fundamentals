public class FibonacciForLoop {
    public void fibonacci(){
        int a=0, b=1; int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=10;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        FibonacciForLoop obj = new FibonacciForLoop();
        obj.fibonacci();
    }
}
