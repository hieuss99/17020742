package Week5.Task3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Rectangle(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return width;
    }

    public void setSide(double width) {
        this.width = width;
    }



    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "[
                "side=" + side +
                ']';
    }
}