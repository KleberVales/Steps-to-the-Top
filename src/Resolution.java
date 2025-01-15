import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	public static void staircase(int n) {
		// Iterate through rows
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			// Print '#' symbols
			for (int k = 0; k < i; k++) {
				System.out.print("#");
			}
			// Move to the next line
			System.out.println();
		}

	}

}

public class Resolution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.staircase(n);

		bufferedReader.close();
	}
}
