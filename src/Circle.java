import java.util.Objects;

public class Circle extends Shape  {
    private int radius;
    public  Circle(int radius){
        super();
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
    @Override
    public String toString() {
        return "shape is " + this.getClass().getName()+ "," + "radius: " + radius + ", "+ "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea() ;
    }

}
