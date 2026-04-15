/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int strn = Integer.parseInt(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		int scr = Integer.parseInt(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		int psts = Integer.parseInt(str3);

		System.out.println("\nシトロン　　　" + str1 + "個");
		System.out.println("ショコラ　　　" + str2 + "個");
		System.out.println("ピスターシュ　" + str3 + "個");
		int totalnumber = strn + scr + psts;
		int totalmoney = strn * 250 + scr * 280 + psts * 320;

		System.out.println("\n合計個数　　　　　" + totalnumber + "個");
		System.out.println("合計金額　　　　　" + totalmoney + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		int strn2 = 30 - strn;
		int scr2 = 30 - scr;
		int psts2 = 30 - psts;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　　　￥250・・・残り" + strn2 + "個");
		System.out.println("ショコラ　　　　　￥280・・・残り" + scr2 + "個");
		System.out.println("ピスターシュ　　　￥320・・・残り" + psts2 + "個");

	}

}
