package kadai_015;
public class Car_Chapter15 {

	private int gear = 1;		// 1速から5速のギアを表す
	private int speed = 10;		// ギアチェンジ後の速度を表す
	
    // ギアチェンジメソッド
	public void gearChange(int afterGear) {
		// 不正なギア
		if(afterGear < 1 || afterGear > 5) {
			return;
		}
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました" );	
		
		// ギアのフィールドを変更させる
		this.gear = afterGear;
		
		// ギアを変更したときの時速
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};
		 }
		
		public void run() {	
			System.out.println( "速度は時速" + this.speed + "kmです" );

	}
}