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
		
		String[] arr = new String[N];
		
		// 문자열 입력 후 배열에 저장
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		// 비교 과정 수행
		Arrays.sort(arr, new Comparator<String>() {
			// 람다식
			public int compare(String s1, String s2) {
				// 단어 길이가 같으면
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2); // 사전순 정렬
				}
				// 그외에는
				else {
					return s1.length() - s2.length(); // 길이에 따라 정렬
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]).append("\n"); // 0번인덱스 값을 StringBuilder에 저장
		
		// 1번 인덱스 부터 끝까지 저장된 0번 인덱스와비교하면서 중복값 제거
		for(int i=1; i<N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		

	}

}
