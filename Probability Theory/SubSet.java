public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        subSet(arr, 5);
    }

    private static void subSet(int[] arr, int n) {
        for(int i = 0; i < 1<<n; i++   ){
            for(int j = 0; j < n; j++){
                if((i&1<<j)!=0){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
