import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 단어 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		// 문자열 입력 후 배열에 저장
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
