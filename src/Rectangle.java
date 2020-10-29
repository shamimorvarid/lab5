public class Rectangle extends Polygon {
    public Rectangle(int a,int b){
        super();
        getSides().add(a);
        getSides().add(b);
    }
    public boolean isSquare(){
        if(getSides().get(0).equals(getSides().get(1)))
            return true;
        else
            return false;
    }

    @Override
    public double calculateArea() {
        double s = 1;
        for(Integer side : getSides()){
            s *= side;
        }
        return s;
    }

    @Override
    public double calculatePerimeter() {
        double p = 0;
        for(Integer side : getSides()){
            p += 2*(side);
        }
        return p;
    }

    @Override
    public String toString() {
        return "shape is: " + this.getClass().getName() + "," + "sides: " +"["+ getSides().get(0)+ "," + getSides().get(1) + "] "+ "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea();
    }

}
