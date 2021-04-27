
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		// number = 100であれば、ブロックが１回実行され、number = 200が出力される
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}
}
