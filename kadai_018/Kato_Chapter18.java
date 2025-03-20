package kadai_018;

// 親を抽象クラスとして宣言
abstract public class Kato_Chapter18 {
	
	// 各種フィールド
	public String familyName = "加藤"; // 姓 を表す
	public String givenName  = ""; // 名 を表す
	public String address    = "住所は東京都中野区〇×です"; // 住所を表す
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address);
	}
	
	// 個別の紹介を出力する抽象メソッド
	abstract public void eachIntroduce();
	
	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce(); // 共通の紹介
		eachIntroduce();   // 個別の紹介
		System.out.println(); // 情報ブロックを区切るための空行を出力
	}

}
