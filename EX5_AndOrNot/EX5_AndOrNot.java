import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX5_AndOrNot {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String p_str;
		while(true) {
			System.out.print("pの真偽値を入力(true/false)>");
			p_str = br.readLine();
			if(p_str.equals("true") || p_str.equals("false")) {
				break;
			}
			System.out.println("trueかfalseを入力してください");
		}
		
		String q_str;
		while(true) {
			System.out.print("qの真偽値を入力(true/false)>");
			q_str = br.readLine();
			if(q_str.equals("true") || q_str.equals("false")) {
				break;
			}
			System.out.println("trueかfalseを入力してください");
		}
		
		boolean p = p_str.equals("true");
		boolean q = q_str.equals("true");
		
		System.out.println("p = " + p + ", q = " + q + "のとき");
		System.out.println(" p & q = " + (p & q));
		System.out.println(" p | q = " + (p | q));
		System.out.println(" p ^ q = " + (p ^ q));
		System.out.println("    !p = " + (!p));
		System.out.println("p && q = " + (p && q));
		System.out.println("p || q = " + (p || q));
		System.out.println("p == q = " + (p == q));
		System.out.println("p != q = " + (p != q));
	}
}

// 表の右下、p = true, q = true, (p != q) = trueになってますけどこれfalseじゃないですか？