package 所得税計算機;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("このプログラムは所得税の計算、所得税の税率の表示を行うためのプログラムです、:の隣から数値を入力してください。");
		   System.out.println("(表示される所得税は所得控除額、税額控除額を除いた額なので所得税の目安としてご利用ください)");
		   System.out.println("");
		   System.out.print("収入を入力してください:");
		   int syunyu = scanner.nextInt();
		   System.out.print("経費を入力してください:");
		   int keihi = scanner.nextInt();
		   Process.outputtest(syunyu,keihi);
		   scanner.close();
	}

}
