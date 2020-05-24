package calculator.yesi;
import java.util.Scanner;

public class Calculator {

    static double A;
    static double B;
    //declares the 2 doubles that will be used to store the inputs of the user.

    public static void inputs(){
        var a = new Scanner(System.in);
        A = a.nextDouble();
        var b = new Scanner(System.in);
        B = b.nextDouble();
    }
    // this method allows the user to input digits which will be stored in the static variables above ^^^^

    public void start(){
        System.out.println("Enter what you want to do: \n" +
                "[1] add\n" +
                "[2] subtract\n" +
                "[3] divide\n" +
                "[4] multiply\n" +
                "[5] square root\n" +
                "[6] quadratic");

        var choices = new Scanner(System.in);
        int choice = choices.nextInt();

        switch (choice){
            case 1:
                add();
                    break;
            case 2:
                subtract();
                    break;
            case 3:
                divide();
                    break;
            case 4:
                multiply();
                    break;
            case 5:
                squareRoot();
                    break;
            case 6:
                quadratic();
                    break;
        }
    }
    /* the start method bring a menu of choices the user can choose from
     * it also bring the user's choice and allows the program to determine what function to run depending on the user's choice
     */


    /*
    *** FOR EVERY BASIC MATHEMATICAL FUNCTION:***
    *  the methods will call the inputs() methods and store the user's inputs into the static doubles at the very top of the class
    * then the method will take those doubles and perform the respected mathematical function that the method offers
    * in the end the system will output the result
     */

    public void add(){
        System.out.println("Function: ADD");
        System.out.println("Enter the digits: ");
        inputs();
        double sum = A + B;
        System.out.println(A + "  +  " + B + " = " + sum);
    }
    // This is the adding function.

    public void subtract(){
        System.out.println("Function: SUBTRACT");
        System.out.println("Enter the digits: ");
        inputs();
        double remainder = A - B;
        System.out.println(A + " - " + B + " = " + remainder);
    }
    //This is the subtraction function

    public void divide(){
        System.out.println("Function: DIVIDE");
        System.out.println("Enter the digits: ");
        inputs();
        double output = A/B;
        System.out.println(A + " / " + B + " = " + output);
    }
    //this is the dividing function

    public void multiply(){
        System.out.println("Function: MULTIPLY");
        System.out.println("Enter the digits: ");
        inputs();
        double output = A * B;
        System.out.println(A + " * " + B + " = " + output);
    }
    //this is the multiplying function

    public void squareRoot(){
        System.out.println("Function SQUARE ROOT");
        System.out.println("Enter The Digit");
        var squareScanner = new Scanner(System.in);
        double input =  squareScanner.nextDouble();
        System.out.println("Square root of " + input + " = " + Math.sqrt(input));
    }
    // this function is the square root method.

    /*
        **ABOUT THE METHOD**
        *  the method uses a different input source. Unlike the others that use the input function, this method only allows one input
        * the method takes the user's input and gets the square root
        * the output returns the user their input and returns the square root
     */

    public void quadratic(){
        double QB;
        double QA;
        double QC;

        System.out.println("Function: Quadratic Formula.");

        System.out.println("Enter a Value for: B");
        var nB = new Scanner(System.in);
        QB = nB.nextDouble();

        System.out.println("Enter a value for: A");
        var nA = new Scanner(System.in);
        QA = nA.nextDouble();

        System.out.println("Enter a value for: C");
        var nC = new Scanner(System.in);
        QC = nC.nextDouble();

        double F = QB * QB;
        double FF = 4 * (QA * QC);
        double FFF = F - FF;

        double finalF = Math.sqrt(FFF);

        double bottomPart = 2 * QA;

        double AAA = -QB + finalF;
        double negativeAAA = -QB - finalF;

        double finalAnswer = AAA/bottomPart;
        double finalAnswer1 = negativeAAA/bottomPart;

        System.out.println("The First answer is : X = " + finalAnswer);
        System.out.println("The Second answer is : X = " + finalAnswer1);
    }
}
