import java.util.ArrayList;
import java.util.Objects;

abstract public class Polygon extends Shape {
    private ArrayList<Integer> sides;
    public Polygon(Integer... args){
        sides = new ArrayList<>();
        for(Integer side : args)
            sides.add(side);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Objects.equals(sides, polygon.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
