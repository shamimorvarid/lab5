import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;
    public Paint(){
        shapes = new ArrayList<>();
    }
    public void addShape(Shape sh){
        shapes.add(sh);
    }
    public void drawAll(){
        for(Shape sha : shapes)
            sha.draw();
    }
    public void printAll(){
        for (Shape shap : shapes)
            System.out.println(shap.toString());
    }
    public void describeEqualsides(){
        for (Shape sh : shapes){
            if(sh instanceof Triangle) {
                if(((Triangle) sh).isEquilateral())
                    System.out.println(sh.toString() + "*** yes it is equilateral");
            }
            else if(sh instanceof Rectangle) {
               if(((Rectangle) sh).isSquare())
                   System.out.println(sh.toString() + "*** yes it is square");
            }
        }
    }

}
