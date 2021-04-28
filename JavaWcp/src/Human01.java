// アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義
public class Human01 {
	public String name;  // メンバー変数nameを定義
	public int age;  // メンバー変数ageを定義
	
	// 引数なしのコンストラクタを定義
	public Human01() {
		name = "山田";
		age = 20;
	}
	// 引数2つ(String型とint型)のコンストラクタを定義
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
