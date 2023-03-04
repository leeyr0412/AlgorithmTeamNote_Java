import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; ++i) {
            input[i] = sc.nextInt();
        }
        // 전처리 : 오름차순정렬
        Arrays.sort(input);
        do {
            System.out.println(Arrays.toString(input));
        } while (nextPermutation(input));
    }
    
    private static boolean nextPermutation(int[] arr) {
        int n = arr.length;
        // step1. 
        // arr[i-1]<arr[i]인 i를 찾기
        // i-1이 교환할 지점
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) --i;
        if (i == 0) return false;

        // step2. 
        // 제일 뒤부터 arr[i-1] < arr[j] 인 j를 찾기
        // j위치에 값을 i-1 과 바꿀거임
        int j = n - 1;
        while (arr[i - 1] >= arr[j]) --j;

        // step3. i-1 과 j 위치 교환
        swap(arr, i - 1, j);

        // step4. i 부터 맨 뒤까지 오름차순 정렬
        int k = n - 1;
        while (i < k) {
            swap(arr, i++, k--);
        }
        return true;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
