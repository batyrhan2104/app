public class Main2 {
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Айырбастау
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 4, 9, 7, 15, 3};
        
        // Массивті кему ретімен сұрыптаймыз
        selectionSortDescending(arr);
        
        System.out.println("Кему ретімен сұрыпталған массив:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}