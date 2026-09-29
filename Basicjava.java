import java.util.Scanner;

public class Basicjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean prime = n > 1;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                prime = false;

        System.out.println(prime ? "Prime" : "Not Prime");

    }
}
