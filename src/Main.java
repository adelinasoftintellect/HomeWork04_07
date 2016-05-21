import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[] = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("[a" + i + "] = " + a[i]);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number <= 7 ");
		int num = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.println("Number" + num + ": a[" + i + "]");
			}
		}
	}
}