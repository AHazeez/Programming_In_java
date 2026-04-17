import java.util.Arrays;

class moving_elements {
    public static void main(String[] args) {
        int a[] = {10, 0, 20, 0, 50, 80};
            move(a);
        for (int i : a) {
            System.out.print(Arrays.toString(a));
        }
    }

    public static void move(int[] arr) {
        // Implementation to move elements
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Move non-zero element to the front
            }
        }
        // Fill the remaining positions with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }


    }

}