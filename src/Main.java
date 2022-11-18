import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    static boolean isPalidrom(int number){
        int temp=number,lastNumber,reverseNumber=0;
         while(temp!=0) {
             lastNumber = temp % 10;
             reverseNumber = (reverseNumber * 10) + lastNumber;
             temp /= 10;
         }
if (reverseNumber==number)
    return true;
else
    return false;

    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num =scanner.nextInt();
        System.out.println(isPalidrom(num));
    }
}