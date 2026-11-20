
public class AppTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("Testing Java Application");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Calculated sum: " + sum);

        if (sum == 30) {
            System.out.println("Test Passed");
        } else {
            throw new RuntimeException("Test Failed");
        }
    }
}
