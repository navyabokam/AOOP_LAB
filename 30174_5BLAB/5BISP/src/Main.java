public class Main {
    public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work();  // Robot is working

        Human human = new Human();
        human.work();  // Human is working
        human.eat();   // Human is eating
    }
}
