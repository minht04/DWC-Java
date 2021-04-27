// 通常for文
public class For01 {
	public static void main(String[] args) {
		/*
		for (初期化式; 条件式; 変化式) {
		    ブロック(繰り返し処理)
		}		 
		 */
		// 変化式:ブロックの処理後にnumberをインクリメント(1増加)
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
	}
}
