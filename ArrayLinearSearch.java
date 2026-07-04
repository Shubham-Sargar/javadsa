public class ArrayLinearSearch {
    public static int Search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int x = 30;
        int result = Search(arr, arr.length, x);
        if (result == -1) {
            System.out.println(" array element is  not found:-");
        } else {
            System.out.println("Array element is found");
        }


    }
}


