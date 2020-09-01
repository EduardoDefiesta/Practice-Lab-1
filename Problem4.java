import java.util.Scanner;

public class Problem4 {
	static void tableofsquares(int n, int num) {
        if (num > n)
            return;
                System.out.println(num + "\u00b2" + "\t=\t" + (int) (Math.pow(num, 2)));

            tableofsquares(n, ++num);
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();



        tableofsquares(n,0);

        }
}
