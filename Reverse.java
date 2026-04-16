import java.util.Arrays;

class Reverse {
    public static void main(String[] args) {
        int a[] = {10, 20, 50, 80};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static int reverse(int a[]) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            a[start] = a[start] + a[end];
            a[end] = a[start] - a[end];
            a[start] = a[start] - a[end];

            start++;
            end--;
        }
        return a[0]; 
    }
}
/**import java.util.Arrays;

class Reverse {
    public static void main(String[] args) {
        int a[] = {10, 20, 50, 80};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int a[]) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            a[start] = a[start] ^ a[end];
            a[end] = a[start] ^ a[end];
            a[start] = a[start] ^ a[end];

            start++;
            end--;
        }
    }
}**/