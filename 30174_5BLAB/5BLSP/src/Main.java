public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();  // Bird is flying

        Bird ostrich = new Ostrich();
        try {
            ostrich.fly();  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}