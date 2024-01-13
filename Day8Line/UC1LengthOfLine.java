import java.util.Scanner;

public class UC1LengthOfLine {

    private double x1, y1, x2, y2;

    // this is import Constructor;
    public UC1LengthOfLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // this is method
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        UC1LengthOfLine line = new UC1LengthOfLine(x1, y1, x2, y2);
        double length = line.calculateLength();

        System.out.println("Length of the line: " + length);
    }
}
