package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	// メソッドの変更
	public void setGivenName() {
		this.givenName = "太郎"; // 太郎を割り当てる
	}
	
	// コンストラクタ
	public KatoTaro_Chapter18() {
		setGivenName(); // ここで名前をセット
	}
	
	// 抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() { // 正しいメソッド名に変更
		System.out.println("私はJavaが得意です");
	}
}