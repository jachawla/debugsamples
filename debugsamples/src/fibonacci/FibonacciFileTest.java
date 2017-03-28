package fibonacci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFileTest {
	public static long fibonacci(int n) {
		if (n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		Integer input;
		Integer n=0;
		final String fileName="src\\fibonacci\\input.txt";
		BufferedReader br=null;
		FileReader fr=null;
		String number=new String();

		try {
			System.out.println("Working Directory = " +
		              System.getProperty("user.dir"));
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);

			String sCurrentLine;

			br=new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine=br.readLine())!=null) {
				number=sCurrentLine;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br!=null)
					br.close();

				if (fr!=null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		input=Integer.parseInt(number);
		for (int i=1; i<=input; i++)
			// comments
			System.out.println(i+": "+fibonacci(i));
	}
}
