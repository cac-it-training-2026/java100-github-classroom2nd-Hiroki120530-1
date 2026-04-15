/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
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
 */

package lesson01.challenge08;

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

	}

}
