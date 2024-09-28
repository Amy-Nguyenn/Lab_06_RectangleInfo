import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        String trash = "";
        boolean validInput = false;

        // width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("The width must be greater than 0.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validInput);

        validInput = false; // reset for next input

        // height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();  // clear buffer
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("The height must be greater than 0.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validInput);

        // calculate area of the rectangle
        double area = width * height;

        // calculate the perimeter of the rectangle
        double perimeter = 2 * (width + height);

        // calculate the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // output
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f%n", diagonal);
    }
}