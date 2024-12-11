public class BubbleSortExample {

    // Bubble Sort function
    public static void bubbleSort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 9, 11, 6, 15, 2};
        int n = 6;

        System.out.print("Original array: ");
        printArray(arr);

        System.out.print("Sorted array: ");
        bubbleSort(arr, n);
        printArray(arr);
    }
}
