
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		// number = 100であればブロックは実行されず、何も表示されない
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
	}
}
