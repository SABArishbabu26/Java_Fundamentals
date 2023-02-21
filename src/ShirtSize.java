import java.util.*;
public class ShirtSize {
    static int size;

    public void checkSize(){
        switch (size){
            case 29:
                System.out.println("Give size is small");
                break;
            case 32:
                System.out.println("Give size is medium");
                break;
            case 36:
                System.out.println("Give size is large");
                break;
            case 42:
                System.out.println("Give size is extra-large");
                break;
            default:
                System.out.println("Give size is not described");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size(29,32,36,42): ");
        size = scanner.nextInt();

        ShirtSize obj1 = new ShirtSize();
        obj1.checkSize();
    }
}
