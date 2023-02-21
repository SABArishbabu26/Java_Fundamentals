public class FibonacciDoWhile {
    public void doWhileLoop(){
        int a=0, b=1, c=0,i=0;
        System.out.println(a);
        System.out.println(b);
        do {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }while (i<=10);
    }

    public static void main(String[] args) {
        FibonacciDoWhile obj = new FibonacciDoWhile();
        obj.doWhileLoop();
    }
}
