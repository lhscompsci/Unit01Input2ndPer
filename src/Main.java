import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // time for INPUT!!!
        Scanner keyb = new Scanner(System.in);
        //prompt
        System.out.print("enter an integer: ");
        int num = keyb.nextInt();
        System.out.println(num + " is a great number!");
        //all input methods begin with next
        // keyb.nextDouble(), keyb.nextFloat(), keyb.nextShort(), etc

        System.out.print("Enter 3 numbers: ");
        int val1 = keyb.nextInt();
        int val2 = keyb.nextInt();
        int val3 = keyb.nextInt();
        System.out.println("The sum of which is "+(val3+val2+val1));

        //take out the garbage
        //  a.k.a. clear out the input buffer
        keyb.nextLine();

        //Strings
        System.out.print("Enter your name: ");
        //String name = keyb.next();
        String name = keyb.nextLine();
        System.out.println("Nice to meet you, "+name);


    }
}