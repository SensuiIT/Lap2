package Task_1_4;

public class TowersOfHanoi {

	public static void towerOfHanoi(int n, char bd, char giua, char cuoi) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + bd + " to " + cuoi);
			return;
		}

		// Move n-1 disks from bd to cuoi peg
		towerOfHanoi(n - 1, bd, cuoi, giua);

		// Move the nth disk from bd to cuoi peg
		System.out.println("Move disk " + n + " from " + bd + " to " + cuoi);

		// Move the n-1 disks from giua to cuoi peg
		towerOfHanoi(n - 1, giua, bd, cuoi);
	}

	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n, 'A', 'B', 'C');
	}
}
