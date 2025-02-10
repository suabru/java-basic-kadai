package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	private Scanner scanner = new Scanner(System.in);

	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		// 入力した内容を取得する
		String choice = scanner.nextLine();

		// 正しいじゃんけんの手であるかを判定する
		while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
			System.out.println("正しく入力してください");
			choice = scanner.nextLine();
		}
		return choice;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] opponentChoice = {"r", "s", "p"};
		int i = (int)(Math.random() * 3);
		return opponentChoice[i];
	}
	
	// じゃんけんを行う
	public void playGame() {
		
		HashMap<String, String> result = new HashMap<>();
			
		result.put("r", "グー");
		result.put("s", "チョキ");
		result.put("p", "パー");

		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		
		// 自分と対戦相手のじゃんけんの手を出力する
		System.out.println("自分の手は" + result.get(myChoice) + "、対戦相手の手は" + result.get(opponentChoice));

		// 自分と対戦相手のじゃんけんの手を比較する
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
				   (myChoice.equals("s") && opponentChoice.equals("p")) ||
				   (myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}