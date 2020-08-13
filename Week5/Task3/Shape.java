package Week5.Task3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filed;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getParameter();

    public String toString() {
        return "Shape[" +
                "color=" + color +
                ", filled=" + filled +
                ']';
    }
}