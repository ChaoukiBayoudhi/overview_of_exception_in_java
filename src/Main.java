import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            int x = sc.nextInt();
            System.out.println("x= " + x);
            System.out.println("Enter another one: ");
            int y = sc.nextInt();
            System.out.println("y= " + y);

            System.out.println("The quotient is: " + (x / y));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//        } catch (InputMismatchException e) {
//            System.out.println("Exception !! You must enter an integer.");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Exception !! You can't divide by zero.");
//        }

        System.out.println("The program continues...");

try {
    Student s1 = new Student();
    s1.getAverageMark();
    s1.setId(1L);
    s1.setName("Mohamed Bayoudhi");
    System.out.println(s1);
}catch(StudentException e){
    System.out.println(e.getMessage());
}

    }
}