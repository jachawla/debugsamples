package fibonacci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FibonacciFileTest {
	public static long fibonacci(int n) {
		if (n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	private static String readFileAndReturnFirstLine(String fileName) {
		BufferedReader br=null;
		FileReader fr=null;
		String sCurrentLine=new String();
		try {
			System.out.println("Working Directory = "+System.getProperty("user.dir"));
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);

			br=new BufferedReader(new FileReader(fileName));

			sCurrentLine=br.readLine();

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
		return sCurrentLine;
	}

	public static void main(String[] args) {
		Integer extent;
		final String fileName="src\\fibonacci\\input.txt";
		String number=new String();
		number=readFileAndReturnFirstLine(fileName); // file contains extent of execution
		extent=Integer.parseInt(number);
		for (int i=1; i<=extent; i++)
			// comments
			System.out.println(i+": "+fibonacci(i));
	}
}
