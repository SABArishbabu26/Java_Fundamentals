public class UsingContinue {
    public void printNumbers(){
        for(int i=1; i<=10;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        UsingContinue obj = new UsingContinue();
        obj.printNumbers();
    }
}
