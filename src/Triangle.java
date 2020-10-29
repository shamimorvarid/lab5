 public class Triangle extends Polygon {
    public Triangle(int a,int b,int c){
        super();
        getSides().add(a);
        getSides().add(b);
        getSides().add(c);
    }
    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        p = p * (p-getSides().get(0)) * (p-getSides().get(1)) * (p-getSides().get(2));
        return Math.sqrt(p);
    }

    @Override
    public double calculatePerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    public boolean isEquilateral(){
        if(getSides().get(0).equals(getSides().get(1))){
            if(getSides().get(0).equals(getSides().get(2)))
                return true;
            else
                return false;
        }
        else
            return false;

    }


     @Override
     public String toString() {
         return "shape is: " + this.getClass().getName() + "," + "sides: " + "["+ getSides().get(0)+ "," + getSides().get(1) + "," + getSides().get(2)+ "] " + "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea();
     }
 }
