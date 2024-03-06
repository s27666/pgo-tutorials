import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.print("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0){
            System.out.println("The value equals 0.");
        }
    }

}