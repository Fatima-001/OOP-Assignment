import java.util.*;
class Op{
    public static void main (String[] arg){
        System.out.println("Different Operators:");
        Scanner op = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter the two numbers to perform different Arthemathics Operations:");
        number1 = op.nextInt();
        number2 = op.nextInt();
        System.out.println("The Addition of two numbers is:");
        System.out.println(number1 + number2 );
        System.out.println("The subtraction of two numbers is:");
        System.out.println(number1 - number2 );
        System.out.println("The multiplication of two numbers is:");
        System.out.println(number1 * number2 );
        System.out.println("The Division of two numbers is:");
        System.out.println(number1 / number2 );
    }
}