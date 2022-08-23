public class Main {
    private static final BigO_Framework bigO = new BigO_Framework();

    public static void main(String[] args) {
        bigO.stopWatch().start();

        System.out.println("test");

        System.out.println(bigO.stopWatch().stop());
    }
}