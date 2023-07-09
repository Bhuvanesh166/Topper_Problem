import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int registerNumber= scanner.nextInt();
        int odd=0,even=0;
        while(registerNumber>0){
            int remainder=registerNumber%10;
            if(remainder%2==0){
                even+=remainder;
            }
            else{
                odd+=remainder;
            }
            registerNumber/=10;
        }
        System.out.println((even==odd)?"true":"false");

    }
}