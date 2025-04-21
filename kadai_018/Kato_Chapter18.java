package kadai_018;

//親クラスは、抽象メソッドを持つので抽象クラスとする
public abstract class Kato_Chapter18 {
	
//	姓を表すフィールド
	public String familyName = "加藤";
//	名を表すフィールド
	public String givenName;
//	住所を表すフィールド
	public String address = "東京都中野区〇×";
	
//	共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です" );
		System.out.println("住所は" + address + "です");
	}
//	個別の紹介を出力する
	public abstract void eachIntroduce();
	
//	紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
	

}
