public class AppTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;

        if (sum == 30) {
            System.out.println("Test Passed");
        } else {
            throw new RuntimeException("Test Failed");
        }
    }
}
