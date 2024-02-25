import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("How many numbers will you enter ? " );
       int N = input.nextInt();

       System.out.print("Enter the first number  : ");
       int num= input.nextInt();

       int max = num;
       int min = num;

       for (int i = 2 ; i <= N ; i++){
           System.out.println(i + ".enter the number : ");
           num=input.nextInt();
           if (num > max){
               max = num;
           }
           if (num < min){
               min = num;
           }
       }
        System.out.println("Biggest number : " + max);
        System.out.println("Smallest number : " + min);

    }
}