package Task_2_2;

public class drawPyramid_3 {
	public static void drawPyramid_3(int n) {
		drawPyramidRecursive(n, 1);
	}

	private static void drawPyramidRecursive(int n, int row) {
		if (n == 0) {
			return;
		}

		printSpaces(n - 1);

		printX(row);

		System.out.println();

		drawPyramidRecursive(n - 1, row + 2);
	}

	private static void printSpaces(int count) {
		if (count > 0) {
			System.out.print(" ");
			printSpaces(count - 1);
		}
	}

	private static void printX(int count) {
		if (count > 0) {
			System.out.print("*");
			printX(count - 1);
		}
	}

	public static void main(String[] args) {
		int n = 9;
		drawPyramid_3(n);
	}
	}
