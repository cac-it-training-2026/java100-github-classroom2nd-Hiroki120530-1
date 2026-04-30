/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] arges) throws IOException {

		int sitoron = 30;
		int syokora = 30;
		int pisutasyu = 30;
		System.out.println("たいへんお待たせいたしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");
		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　　　￥250・・・残り" + sitoron + "個");
		System.out.println("ショコラ　　　　　￥280・・・残り" + syokora + "個");
		System.out.println("ピスターシュ　　　￥320・・・残り" + pisutasyu + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String str1 = reader.readLine();
		double strn = Double.parseDouble(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		double scr = Double.parseDouble(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		double psts = Double.parseDouble(str3);

		System.out.println("\nシトロン　　　" + str1 + "個");
		System.out.println("ショコラ　　　" + str2 + "個");
		System.out.println("ピスターシュ　" + str3 + "個");
		double totalnumber = strn + scr + psts;
		int totalmoney = (int) (strn * 250 + scr * 280 + psts * 320);

		System.out.println("\n合計個数　　　　　" + totalnumber + "個");
		System.out.println("合計金額　　　　　" + totalmoney + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		sitoron = (int) (30 - strn);
		syokora = (int) (30 - scr);
		pisutasyu = (int) (30 - psts);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　　　￥250・・・残り" + sitoron + "個");
		System.out.println("ショコラ　　　　　￥280・・・残り" + syokora + "個");
		System.out.println("ピスターシュ　　　￥320・・・残り" + pisutasyu + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + totalmoney + "円");

		int strnp = (int) ((strn * 250 / totalmoney) * 100);
		int scrp = (int) ((scr * 380 / totalmoney) * 100);
		int pstsp = (int) ((psts * 320 / totalmoney) * 100);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (strn * 250) + "・・・" + strnp + "%");
		System.out.println("ショコラ     \\" + (int) (scr * 250) + "・・・" + scrp + "%");
		System.out.println("ピスターシュ  \\" + (int) (psts * 250) + "・・・" + pstsp + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・ " + strnp + "%");
		System.out.println("ショコラの味    ・・・ " + scrp + "%");
		System.out.println("ピスターシュの味・・・ " + pstsp + "%");

		System.out.println("\nが楽しめます！\n");

		int newmakaronmoney = (int) ((totalmoney / totalnumber) / 10) * 10;
		System.out.println("値段は\\" + newmakaronmoney + "です。");

	}

}
