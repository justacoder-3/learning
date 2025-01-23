public class CalculateArea{
    double rectangleArea(double length, double breadth){
        return length * breadth;
    }
    double squareArea(double side){
        return side * side;
    }
    double circleArea(double radius){
        return Math.PI * radius * radius;
    }
    double triangleArea(double base, double height, boolean isTriangle){
        return 0.5 * base * height;
    }

    public static void main(String[] args){
        CalculateArea area = new CalculateArea();
        double areaOfRectangle = area.rectangleArea(5.0, 6.0);
        System.out.println("Area of rectangle is "+areaOfRectangle);
        double areaOfSquare = area.squareArea(5.0);
        System.out.println("Area of square is "+areaOfSquare);
        double areaOfCircle = area.circleArea(6.0);
        System.out.println("Area of circle is "+areaOfCircle);
        double areaOfTriangle = area.triangleArea(5.0, 6.0,true);
        System.out.println("Area of triangle is "+areaOfTriangle);
    }
}