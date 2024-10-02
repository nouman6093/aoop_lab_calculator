import java.util.Scanner;

public class Main {
    public void checkInputNumber(int a, int b) throws checkForAboveThousand{
        if (a > 1000 || b > 1000) {
            throw new checkForAboveThousand("Above 1000 numbers not accepted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        Main mainInstance = new Main();

        while (true) {
            try {
                System.out.print("Enter A: ");
                a = sc.nextInt();
                System.out.print("Enter B: ");
                b = sc.nextInt();

                System.out.println("Addition: " + new Calculator().add(a, b));
                System.out.println("Subtraction: " + new Calculator().subtract(a, b));
                System.out.println("Multiplication: " + new Calculator().multiply(a, b));
                System.out.println("Division: " + new Calculator().divide(a, b));

                mainInstance.checkInputNumber(a, b);

                if (b != 0){
                    break;
                }
            } catch (checkForAboveThousand e) { //custom exception is happening here
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (b == 0) {
                    System.out.println("Please enter values again");
                }
            }
        }
    }
}