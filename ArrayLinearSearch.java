public class ArrayLinearSearch {
    public static int Search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) { // moving the loop
            if (arr[i] == x) { // finding the target element.
                return i;  // return the index
            }

        }
        return -1; // not fin to return the -1.
    }
//linear search int the array to finding the array element.

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50}; // crating the array
        int x = 30; // set the target element.
        int result = Search(arr, arr.length, x); //  store the function int result.
        if (result == -1) { // if result is -1 then print
            System.out.println(" array element is  not found:-" );
        } else {
            System.out.println("Array element is found :==="+result);
        }


    }
}


