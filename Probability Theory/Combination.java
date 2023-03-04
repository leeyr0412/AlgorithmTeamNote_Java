public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        combination(arr, 0, r,0);
    }

    static int n = 5, r = 3;
    static int[] numbers = new int[r];
    
    //n개중 r개를 뽑는 
    static void combination(int[] arr, int start, int r, int cnt) {
        if (cnt == r) {
            for(int i = 0; i < r; i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            numbers[cnt] = arr[i];
            combination(arr, i + 1, r,cnt+1);
        }
    }
}
