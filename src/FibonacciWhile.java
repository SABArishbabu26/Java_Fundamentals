public class FibonacciWhile {
    public void calculate(){
        int a=0, b=1, c=0;
        System.out.println(a);
        System.out.println(b);
        int i=0;
        while(i<=10){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }

    public static void main(String[] args) {
        FibonacciWhile obj = new FibonacciWhile();
        obj.calculate();
    }
}
