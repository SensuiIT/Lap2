package Task_1_1;

public class Task_1_1 {

	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		// TODO
		if (n == 1) {
			return 1;
		}
		return (int) (Math.pow(-1, n+1) * n + getSn1(n - 1));
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		// TODO
		int temp = 1;
		if (n == 0 || n == 1) {
			return temp;
		} else {
			for (int i = 1; i <= n; i++) {
				temp *= i;
			}
			return temp + getSn2(n - 1);
		}

	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		// TODO
		int sum = 0;
		if (n < 1) {
			return (Integer) null;
		}
		for (int i = 0; i <= n; i++) {
			sum = sum + i * i;
		}
		return sum;
	}
	// 	S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
	// TODO
		double sum = 1.0;
		double mau = 1.0;
		for (int i = 1; i <= n; i++) {
			mau *= 2 *i *(2*i -1);
			sum += 1.0/mau;
		}
	return sum;
	}
	public static void main(String[] args) {
		System.out.println("Get Sn1 = " + getSn1(4));
		System.out.println("Get Sn2 = " + getSn2(4));
		System.out.println("Get Sn3 = " + getSn3(5));
		System.out.println("Get Sn4 = " + getSn4(3));
	}
}
