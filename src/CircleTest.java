public class CircleTest {
    public static void run() {
        Circle circle = new Circle();
        circle.setDiameter(10);
        System.out.println(circle.toString());
        circle.setRadius(30);
        System.out.println(circle.toString());
        circle = new Circle(2);
        System.out.println("radius = " + circle.getRadius());
        System.out.println("diameter = " + circle.getDiameter());
    }
}
