package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What value do you want for n?");
		int n = in.nextInt();
		System.out.println("n:" + n);

		//int[][] sieve = {{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 
		//	{21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}};

		boolean[] array = new boolean[n];

		for (int sieve = 2; sieve <= n; sieve++) {
			if (array [0])
			{
				for (int i = 1; i*sieve < n; i++) {
					array[i*sieve] = true;
				}
				
			}
				

			System.out.println(array);
		}

	}
}

/*
	for (int sieve = 2; sieve <= n; sieve+=3) {
		System.out.println(sieve);
		int sieve3 = sieve;
	}
	for (int sieve = 2; sieve <= n; sieve+=5) {
		System.out.println(sieve);
		int sieve5 = sieve;
	}
	int [][] array = new int 
	System.out.println(sieve[sieve2]);

	}

}
 */