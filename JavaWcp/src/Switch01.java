
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		// switch文:分岐処理の開始
		switch (val) {
		case 3:
		    System.out.println("よくできました!");
		    // break:switch文を終了する
		    break;
		case 2:
			System.out.println("ふつうでした!");
			break;
		// default:全てのcaseの値に一致しない場合にブロックを実行	
		default:
			System.out.println("がんばろう!");
		}
	}
}
