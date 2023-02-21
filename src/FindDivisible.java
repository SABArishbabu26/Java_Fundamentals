import java.util.Scanner;
public class FindDivisible {
    static int num;

    public void check(){
        if(num%2 == 0){
            System.out.println("Given number is divisible by 2");
        } else if (num%3==0) {
            System.out.println("Given number is divisible by 3");
        } else if (num%5==0) {
            System.out.println("Given number is divisible by 5");
        }
        else {
            System.out.println("Given number is Prime");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        FindDivisible obj = new FindDivisible();
        obj.check();
    }
}
