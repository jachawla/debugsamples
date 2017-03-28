package fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciTest {
	public static long fibonacci(int n) {
		if (n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		String input=new String();
		Integer n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("How far should the series extend:");
			input=br.readLine();
			n=Integer.parseInt(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i=1; i<=n; i++)
			System.out.println(i+": "+fibonacci(i));
	}

}
