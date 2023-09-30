package Task_1_2;

public class Fibonacci {

	// get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		// TODO
		int f1 = 0;
		int f2 = 1;
		int fn = 1;
		if(n<0) {
			return -1;
		}else if(n==0 || n==1){
			return 1;
		}else {
			for (int i = 2; i <= n; i++) {
				f1=f2;
				f2=fn;
				fn=f1+f2;
			}
		}
		
		return fn;
	}

	// This method is used to display a Fibonaccci series based on 
	//the parameter n.Ex.n=10==>0 1 1 2 3 5 8 13 21 34
		public static void printFibonacci(int n) {
		    int a = 0; 
		    int b = 1;

		    System.out.print("Fibonacci Series up to n = " + n + ": ");
		    
		    if (n >= 1) {
		        System.out.print(a + " ");
		    }
		    if (n >= 2) {
		        System.out.print(b + " ");
		    }

		    for (int i = 2; i < n; i++) {
		        int next = a + b; 
		        System.out.print(next + " ");
		        a = b;
		        b = next; 
		    }
		    
		    System.out.println(); 
	}
		public static void main(String[] args) {
			printFibonacci(11);
		}
}
