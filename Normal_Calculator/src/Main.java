import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int a = sc.nextInt();
        System.out.print("Enter another Number : ");
        int b = sc.nextInt();
        System.out.println("Press '1' for Plus!!!!!");
        System.out.println("Press '2' for Minus !!!!!");
        System.out.println("press '3' for Multiplication!!!!!");
        System.out.println("Press '4' for Division!!!!!");
        System.out.println("Press '5' for Modulus!!!!!");
        System.out.print("Please Enter a Valid Input : ");
        int option = sc.nextInt();
        Plus sum_1 = new Plus();
        Minus sub_1 = new Minus();
        Multiplication mul_1 = new Multiplication();
        Division div_1 = new Division();
        Modulus mod_1 = new Modulus();
        switch (option){
            case 1:
                System.out.print("The Result of "+a+"+"+b+" is : ");
                sum_1.sum(a,b);
                break;
            case 2:
                System.out.print("The Result of "+a+"-"+b+" is : ");
                sub_1.minus(a,b);
                break;
            case 3:
                System.out.print("The Result of "+a+"X"+b+" is : ");
                mul_1.mul(a,b);
                break;
            case 4:
                System.out.print("The Result of "+a+"/"+b+" is : ");
                div_1.division(a,b);
                break;
            case 5:
                System.out.print("The Result of "+a+"%"+b+" is : ");
                mod_1.mod(a,b);
            default:
                System.out.println("Please Enter a valid option!!!!!");
        }
        System.out.println("Thank You!!!!!");
    }
}