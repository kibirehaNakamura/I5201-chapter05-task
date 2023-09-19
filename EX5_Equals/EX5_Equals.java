import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX5_Equals {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("文字列1を入力>");
		String str1 = br.readLine();
		System.out.print("文字列2を入力>");
		String str2 = br.readLine();
		
		System.out.print("大文字と小文字を区別して比較 : ");
		if(str1.equals(str2)) {
			System.out.println("文字列1と文字列2は同じ文字列です");
		} else {
			System.out.println("文字列1と文字列2は違う文字列です");
		}
		
		System.out.print("大文字と小文字を区別しないで比較 : ");
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("文字列1と文字列2は同じ文字列です");
		} else {
			System.out.println("文字列1と文字列2は違う文字列です");
		}
	}
}