import java.util.Scanner;

class Cylinder {
    double radius, height, area;

    // To get input from user
    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // To compute the area of the cylinder
    void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    // To display the area
    void displayArea() {
        System.out.println("The area of the cylinder is: " + area);
    }
}

class CylinderVol extends Cylinder {
    double volume;

    // To compute the volume of the cylinder
    void volume() {
        volume = Math.PI * radius * radius * height;
    }

    // To display the volume
    void displayVolume() {
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of CylinderVol
        CylinderVol cylinder = new CylinderVol();

        // Get input from the user
        cylinder.getInput();

        // Compute and display the area
        cylinder.area();
        cylinder.displayArea();

        // Compute and display the volume
        cylinder.volume();
        cylinder.displayVolume();
    }
}