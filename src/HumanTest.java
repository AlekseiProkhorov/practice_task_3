public class HumanTest {
    public static void run() {
        Head head = new Head("black", 100);
        Leg leg = new Leg("gray", 123);
        Hand hand = new Hand("white", 2131);

        Human human = new Human();
        human.setHand(hand);
        human.setHead(head);
        human.setLeg(leg);

        System.out.println(human.toString());

    }
}
