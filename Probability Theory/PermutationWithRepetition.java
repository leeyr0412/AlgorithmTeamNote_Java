public class PermutationWithRepetition {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3};
        permutation(arr, n, r, 0);
    }

    static int n = 5, r = 3;
    /**
     * 배열 arr의 길이 n 중 r개를 중복해서 뽑는 순열
     *
     * @param arr
     * @param n
     * @param r
     * @param depth 깊이
     */
    static int[] numbers = new int[r];
    private static void permutation(int[] arr, int n, int r, int depth) {
        if (depth == r) {//r개를 모두 고른 상황
            for (int i = 0; i < r; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            numbers[depth] = arr[i];
            permutation(arr, n, r, depth + 1);
        }
    }
}
