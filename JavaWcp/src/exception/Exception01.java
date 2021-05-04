// 例外処理を記述していないプログラム
package exception;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("100 ÷ 0 は？");
		// 0で割り算するので例外(エラー)が発生
		int result = 100 / 0;
		// 例外が発生した以降の処理は実行されない
		System.out.println("計算結果" + result);
		System.out.println("プログラム終了");
	}
}


/* 
 実行結果
Exception in thread "main" 100 ÷ 0 は？
java.lang.ArithmeticException: / by zero
	at exception.Exception01.main(Exception01.java:6)
*/