import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/*
 * テストのコードを通常のコードに置き換えました。
 */
public class Mayoiroad {
	public static void main(String[] args) {
		// int n に試行回数を設定する
		int n = 100000;
		//int n = Short.MAX_VALUE;
		//int n = Integer.MAX_VALUE; => OutOfMemoryError

		if (n <= 0) {
            //return "0";
			System.out.println(0);
        }

		// 偶数が出たら奇数として処理する。
		if (n % 2 == 0) {
			n--;
		}
		
		// Bから出る経路パターンの数を保持するリスト
		List<BigInteger> list = new ArrayList<>();

        if (n == 2) {
            //return "2";
        	System.out.println(2);
        } else if (n == 4) {
        	//return "7";
        	System.out.println(7);
        }

        list.add(new BigInteger("2"));
    	list.add(new BigInteger("7"));
        BigInteger diffNum, lastNum;
        
        // 指定回数(n回)ループを回してリストに追加していく。
        for (int i = 5; i <= n; i+=2) {
        	lastNum = list.get(list.size() -1);
        	// リスト内の最後の数字から、その前の数字を引き算する。
        	diffNum = (lastNum.subtract(list.get(list.size() -2)));
        	// 最後の数字を2倍して、それに求めた差と1を加えた数字をリストの最後に格納する。
        	list.add((lastNum.multiply(new BigInteger("2")).add(diffNum).add(new BigInteger("1"))));
        }
	    System.out.println(list.get(list.size()-1).toString());
	}
}