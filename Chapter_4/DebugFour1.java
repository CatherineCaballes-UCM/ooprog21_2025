import java.util.Scanner;

// Circle interface
interface Circle {
    double getArea();
}

// DebugCircle class implementing Circle
class DebugCircle implements Circle {
    private double radius;

    public DebugCircle(double r) {
        radius = r;
    }

    public double getRad() {
        return radius;
    }

    public double getDiam() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class with main method
public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextDouble();

        DebugCircle c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}
