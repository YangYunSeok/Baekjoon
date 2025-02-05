import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder(); // 문자열 합차기 위해 StringBuilder 추가
		
		int N = Integer.parseInt(br.readLine());	// 수의 개수 입력
		int nums[] = new int[N];
		
		// 수 입력 후 배열에 저장
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 정렬
		Arrays.sort(nums);
		
		// StringBuilder에 저장
		for(int i=0; i<N; i++) {
			sb.append(nums[i]).append("\n");
		}
		
		System.out.println(sb); // 출력

	}

}
