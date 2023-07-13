import java.util.Scanner;


public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number = sc.nextInt();
        while(number>0){
            System.out.print(number+" ");
            if(number == 1){
                break;
            }
            else {
                if (number % 2 == 0) {
                    number = number/2;

                }
                else{
                    number = (3*number)+1;
                }
            }
        }

    }
}
