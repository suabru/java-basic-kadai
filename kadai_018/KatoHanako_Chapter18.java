package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// メソッドの変更
	public void setGivenName() {
		this.givenName = "花子"; // 花子を割り当てる
	}
	
	// コンストラクタ
	public KatoHanako_Chapter18() {
		setGivenName(); // ここで名前をセット
	}
	
	// 抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() { // 正しいメソッド名に変更
		System.out.println("趣味は読書です");
	}
}