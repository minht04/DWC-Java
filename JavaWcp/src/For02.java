// 拡張for文
public class For02 {
	public static void main(String[] args) {
		/*
		for (型 変数名：配列やコレクションの変数) {
		    ブロック(繰り返し処理)
		}
		配列やコレクションの変数の要素を順番に取得し、
		指定した型の変数に代入しながらブロック内の処理を行う
		 */
		int[] array = { 1, 2, 3, 4, 5 };
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
	}
}
