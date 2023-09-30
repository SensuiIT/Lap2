package Task_1_3;

import java.util.Arrays;

public class PascalTriangle {

	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		// TODO
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			int[] rowA = getPascalTriangle(i);
			for (int num : rowA) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		int[] row = new int[n];
		for (int i = 0; i < n; i++) {
			row[i] = generatePascalNumber(n - 1, i);
		}
		return row;
	}

	// Helper method to calculate the value at a specific position in Pascal's
	// Triangle
	private static int generatePascalNumber(int row, int col) {
		if (col == 0 || col == row) {
			return 1;
		}

		return generatePascalNumber(row - 1, col - 1) + generatePascalNumber(row - 1, col);
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		// TODO
		int[] nextRow = new int[prevRow.length + 1];
		nextRow[0] = 1;
		nextRow[nextRow.length - 1] = 1;
		for (int i = 1; i < nextRow.length - 1; i++) {
			nextRow[i] = prevRow[i - 1] + prevRow[i];
		}
		return nextRow;
	}

	public static void main(String[] args) {
		int row = 5;
		int n = 3;
		int[] prevRow = { 1, 1 };
		printPascalTriangle(row);
		System.out.println("-----------------");
		System.out.println(Arrays.toString(getPascalTriangle(n)));
		System.out.println("-----------------");
		System.out.println(Arrays.toString(generateNextRow(prevRow)));
	}
}
