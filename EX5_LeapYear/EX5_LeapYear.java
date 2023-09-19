import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EX5_LeapYear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("西暦を入力(1～2011)>");
		int year = Integer.parseInt(br.readLine());
		if(1 <= year && year <= 2011) {
			if((year % 400) == 0) {
				System.out.println(year + "年はうるう年です。");
			} else if(((year % 4) == 0) && ((year % 100) != 0)) {
				System.out.println(year + "年はうるう年です。");
			} else {
				System.out.println(year + "年は平年です。");
			}
		} else {
			System.out.println("入力値に誤りがあります");
		}
	}
}