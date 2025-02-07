import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 11, 0};
        
        // Массив элементтерін өсу ретімен сұрыптаймыз
        Arrays.sort(arr);
        
        System.out.println("Өсу ретімен сұрыпталған массив:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}