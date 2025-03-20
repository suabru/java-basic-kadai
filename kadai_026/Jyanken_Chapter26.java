package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.next();
			
			if (!(input.equals("r") || input.equals("s") || input.equals("p"))) {
				System.out.println("正しい手を入力してください。");
			} else {
				// scannerを開放するタイミングを考慮する必要があるため、scannerを閉じるのはメソッド外で
				return input; //メソッド外でscannerを閉じることを考慮する	
			}
		}
	}

	public String getRandom() {
	    String[] rivals = {"r", "s", "p"};
	    int randomIndex = (int) Math.floor(Math.random() * 3);
	    return rivals[randomIndex];
	}
	public void playGame() {
		HashMap<String, String> list = new HashMap<>();
		list.put("r", "グー");
		list.put("p", "パー");
		list.put("s", "チョキ");
		
		String me = getMyChoice();
		String you = getRandom();
		
		System.out.println("自分の手は" + list.get(me) + ",対戦相手の手は" + list.get(you));
		
		if (me.equals(you)) {
			System.out.println("あいこです");
		} else if((me.equals("r") && you.equals("s")) ||
				  (me.equals("s") && you.equals("p")) ||
				  (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
		System.out.println("自分の負けです");
		}
	}

	public static void main(String[] args) {
		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		game.playGame();	
	}
}