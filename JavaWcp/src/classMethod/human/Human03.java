package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}
	
	//String型の戻り値を返す引数なしのgetProfileメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}
	
	//戻り値を返さない、String型の引数を1つとるgreetメソッドを定義
	public void greet(String friend) {
		//String型の値はnullの可能性があるのでチェック
		//nullをそのまま扱うとエラーの元となるなるのでチェックする癖をつける
		if (friend == null) {  
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
