package calculator.yesi;
import java.util.Scanner;

public class Calculator {

    static double A;
    static double B;
    //declares the 2 doubles that will be used to store the inputs of the user.

    public void inputs(){
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
                "[6] quadratic\n" +
                "[7] slope\n" +
                "[8] convert imperial to metric\n" +
                "[9] convert metric to imperial");

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
            case 7:
                slope();
                    break;
            case 8:
                imperialToMetric();
                    break;
            case 9:
                metricToImperial();
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
        double IB;
        double IA;
        double IC;
        // "I" stands for initial variables. These are the float variables that the user stores.

        System.out.println("Function: Quadratic Formula.");

        System.out.println("Enter a Value for: B");
        var sB = new Scanner(System.in);
        IB = sB.nextDouble();

        System.out.println("Enter a value for: A");
        var nA = new Scanner(System.in);
        IA = nA.nextDouble();

        System.out.println("Enter a value for: C");
        var nC = new Scanner(System.in);
        IC = nC.nextDouble();

        double F = IB * IB;
        double FF = 4 * (IA * IC);
        double FFF = F - FF;
        //The "f" variables store the values when the program is simplifying the equation.
        /*
        * "F" stores the value of b when it is squared
        * "FF" stores the value when you multiply "A" by "C" and then multiply that by 4
        * "FFF" stores the value when you subtract F and FF or (B^2) - 4 * (A * C)
        * These 3 doubles only solve for part of the top equation (b^2 - 4ac)
         */

        double finalF = Math.sqrt(FFF);
        // "finalF" stores the value of "FFF" when it is square rooted

        double bottomPart = 2 * IA;
        // "bottomPart" solves for the bottom part of the equation (2a)

        double AAA = -IB + finalF;
        //"AAA" solves for the rest of the equation (-b + *the result of the 2 equations subtracted then square rooted*)

        double altAAA = -IB - finalF;
        //"altAAA" solves for the other solution which does the same thing as the line of code shown above except subtracts rather than add

        double finalAnswer = AAA/bottomPart;
        //gets the first answer of the problem

        double finalAnswer1 = altAAA/bottomPart;
        //gets the second answer of the problem

        //both of the lines shown above take "AAA" and "altAAA" and divide it by the bottom part

        System.out.println("The First answer is : X = " + finalAnswer);
        System.out.println("The Second answer is : X = " + finalAnswer1);
        //prints out the final results of the equation.
    }

    public void slope(){
        double x1;
        double x2;
        // declares the x values

        double y1;
        double y2;
        // declares the y values

        System.out.println("Enter a value for Y2");
        var scannerY2 = new Scanner(System.in);
        y2 = scannerY2.nextDouble();

        System.out.println("Enter a value for Y1");
        var scannerY1 = new Scanner(System.in);
        y1 = scannerY1.nextDouble();

        System.out.println("Enter a value for X2");
        var scannerX2 =  new Scanner(System.in);
        x2 = scannerX2.nextDouble();

        System.out.println("Enter a value for X1");
        var scannerX1 = new Scanner(System.in);
        x1 = scannerX1.nextDouble();

        /*
        * the following blocks of code allow the user to input values for x1, x2, y1 and y2.
        * Then it stores those values into doubles stated all the way on top of the method
         */

        double finalTop = y2 - y1;
        double finalBottom = x2 - x1;
        /*
         * the following lines of code take the values of y and x 2 and 1 and subtracts them
         */

        double vFinal = finalTop/finalBottom;
        //the following line divides the values stored in "finalTop" and "finalBottom"

        System.out.println("Slope = " + vFinal);
        // the following prints out the final result.
    }

    public void imperialToMetric(){
        int [] choice = new int[4];
        choice[1] = 1;
        choice[2] = 2;
        choice[3] = 3;
        // declares an array list that wil be used to choose between the menu

        System.out.println("What do you wish to convert to metric?");
        System.out.println(
                "[1] inch(es) to centimeter(s)\n" +
                "[2] foot/feet to meter(s)\n" +
                "[3] mile(s) to kilometer(s)\n");
        //provides the user a menu of choices of which the user can choose from

        var scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        // provides a scanner so the user can choose

        if (c == choice[1]){
            System.out.println("Enter value of inches you wish to convert");
            var i_scanner = new Scanner(System.in);
            double inches = i_scanner.nextDouble();
            double resultI = inches * 2.54;
            System.out.println("The conversion is: " + inches + " Inches " + "Is equal to: " + resultI + " Centimeters");
        }
        if (c == choice[2]){
            System.out.println("Enter the value of feet/foot you wish to convert");
            var f_scanner = new Scanner(System.in);
            double feet = f_scanner.nextDouble();
            double resultF = feet/3.281;
            System.out.println("The conversion is: " + feet + " feet " + "Is equal to: " + resultF + " Meters");
        }
        if (c == choice[3]){
            System.out.println("Enter the value of miles you want to convert");
            var m_scanner =  new Scanner(System.in);
            double miles = m_scanner.nextDouble();
            double resultM = miles * 1.609;
            System.out.println("The conversion is: " + miles + " miles " + "Is equal to: " + resultM + " Kilometers");
        }
        /*
        *these if statements follow the same format but with different results and attributes
        * they are activated when the user's input matches the choice options (choice[1-3])
        * the statement creates a new scanner for the user to give a value for inches, feet or miles.
        * choice 1 takes the user's input which is stored as an inch(es) value then multiplies it by 2.54 to get the metric conversion (cm)
        * choice 2 does the same but instead of multiplying it divides the input by 3.281 to get the conversion
        * choice 3 is the same but it multiplies the input by 1.609.
         */
    }

    public void metricToImperial(){
        int [] choice = new int[4];
        choice[1] = 1;
        choice[2] = 2;
        choice[3] = 3;
        // presents an array to declare the number of options available

        System.out.println("What do you wish to convert to imperial?");
        System.out.println(
                "[1] centimeter(s) to inch(es)\n" +
                "[2] meter(s) to feet/foot\n" +
                "[3] kilometer(s) to mile(s)\n");
        //outputs a menu for the user to choose from

        var scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //the scanner used to get the user's input ad the variable used to store that input

        if (i == choice[1]){
            System.out.println("Enter the value of centimeter(s) to convert");
            var c_scanner = new Scanner(System.in);
            double cm = c_scanner.nextDouble();
            double in = cm/2.54;
            System.out.println("The conversion is: " + cm + " centimeters " + "Is equal to: " + in + "Inches");
        }
        if (i == choice[2]){
            System.out.println("Enter the value of meter(s) to convert");
            var m_scanner = new Scanner(System.in);
            double mt = m_scanner.nextDouble();
            double ft = mt * 3.281;
            System.out.println("The conversion is: " + mt + " meters " + "Is equal to: " + ft + "Feet/foot");
        }
        if (i == choice[3]){
            System.out.println("Enter the value of kilometer(s) to convert");
            var k_scanner = new Scanner(System.in);
            double km = k_scanner.nextDouble();
            double ml = km/1.609;
            System.out.println("The conversion is: " + km + " meters " + "Is equal to: " + ml + "Mile(s)");
        }
        /*
        *these statements work the same way as the ones from imperialToMetric() but inverts the equation to get the measurement in imperial.
        * the statements also follow the same format
        * if you are lost...read the damn comment below the imperial to metric method regarding the if statements and stop bing too lazy to read
         */
    }
}