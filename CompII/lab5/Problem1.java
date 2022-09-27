package labs.CompII.lab5;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("input s1, s2, s3: ");

        Triangle t = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());

        System.out.printf("input color: ");

        t.setColor(input.next());

        System.out.printf("input isFilled: ");

        t.setFilled(input.nextBoolean());

        System.out.println("\n"+t.toString());

    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    protected GeometricObject() {

    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    public Triangle() {
        this.side1 = 20;
        this.side2 = 20;
        this.side3 = 20;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double semi = (side1+side2+side3)/2;
        return Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return
        "Color: "+ getColor() +
        "\nFilled: "+ isFilled() +
        "\nArea: "+ getArea() +
        "\nPermiter: "+ getPerimeter() + 
        "\nSide1: "+ this.side1 +
        "\nSide2: "+ this.side2 +
        "\nSide3: "+ this.side3 +
        "\n";
    }
}