import java.util.*;
public class ArrayCheck {
    static int[] array;
    static int n;
    public static void checkDivisible(){

        // accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            if(array[i]%3==0){
                System.out.println("first number divisible by 3 is " + array[i]);
                System.out.println("Position of the number divisible by 3 is "+i);
                break;
                }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to store: ");
        n=sc.nextInt();

        array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }

        ArrayCheck obj = new ArrayCheck();
        obj.checkDivisible();
    }
}
