public class Circle {
    int radius, diameter;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public String toString() {
        return "Circle radius = " + radius + ", diameter = " + diameter;
    }
}
