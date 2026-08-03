package Jul22_work.program4;

public class GroupEvenOddIterative {

    static void rearrangeTwoPointer(int[] a) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            if (a[left] % 2 == 0) {
                left++;
            } else if (a[right] % 2 != 0) {
                right--;
            } else {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 4, 1, 6, 3, 8};
        rearrangeTwoPointer(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}

