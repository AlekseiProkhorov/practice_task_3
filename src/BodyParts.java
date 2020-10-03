public class BodyParts {
    String name;
    String color;
    int health;

    public BodyParts() {
    }

    public BodyParts(String name, String color, int health) {
        this.name = name;
        this.color = color;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "color = " + color + ", hp = " + health;
    }
}
