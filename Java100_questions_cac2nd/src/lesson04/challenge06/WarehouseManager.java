/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];
		int five = 0;

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < 5; i++) {
			five = (int) (Math.random() * 10 % 5) + 1;
			ABKosanArray[i] = five;
			for (int j = 0; j < i; j++) {
				if (ABKosanArray[i] == ABKosanArray[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		int no4 = 0;
		//ここに値の入れ替え処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {
			if (ABKosanArray[i] == 1) {
				no1 = i;
			}
		}
		for (int a = 0; a < ABKosanArray.length; a++) {
			if (ABKosanArray[a] == 2) {
				no2 = a;
			}
		}
		for (int b = 0; b < ABKosanArray.length; b++) {
			if (ABKosanArray[b] == 3) {
				no3 = b;
			}
		}
		for (int c = 0; c < ABKosanArray.length; c++) {
			if (ABKosanArray[c] == 4) {
				no4 = c;
			}
		}

		int num = ABKosanArray[no1];
		ABKosanArray[no1] = ABKosanArray[no3];
		ABKosanArray[no3] = num;

		int num2 = ABKosanArray[no2];
		ABKosanArray[no2] = ABKosanArray[no4];
		ABKosanArray[no4] = num2;

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}