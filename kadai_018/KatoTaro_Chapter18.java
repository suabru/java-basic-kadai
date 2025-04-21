package kadai_018;

//加藤太郎を表すクラス

public class KatoTaro_Chapter18 extends Kato_Chapter18  {
	
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
}