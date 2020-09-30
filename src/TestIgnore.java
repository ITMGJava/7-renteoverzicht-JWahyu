import java.util.Scanner;

public class TestIgnore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int minimum = 5;
        int maximum = 15;

        do{
            System.out.print("Enter a number between" + " " + minimum + " " + "and" + " " + maximum + ":" );
            number = input.nextInt();
            if (number < minimum || number > maximum)
                System.out.print("Sorry, invalid");
        } while (number < minimum || number > maximum);

    }
}
