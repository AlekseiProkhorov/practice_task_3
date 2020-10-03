public class Human {
    Head head;
    Leg leg;
    Hand hand;

    public Human() {
    }

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public int getHealth() {
        return head.getHealth() + leg.getHealth() + hand.getHealth();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String toString() {
        return "This is human with health = " + (head.getHealth() + leg.getHealth() + hand.getHealth()) +
                "\nHis head: " + head.toString() +
                "\nHis hand: " + hand.toString() +
                "\nHis leg: " + leg.toString();
    }
}
