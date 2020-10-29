abstract public class Shape  {
    abstract public double calculatePerimeter();
    abstract public double calculateArea();
    public void draw(){
        System.out.println("shape is: " + this.getClass().getName() +"\n" + "perimeter: " + calculatePerimeter() + " Area:" + calculateArea());
    }
    abstract  public String toString();
    abstract public boolean equals(Object o);
    abstract public int hashCode();
}
