package Jul22_work.program5;

public class PartitionIterative {

    static void partitionIterative(int[] a, int k) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            if (a[left] <= k) {
                left++;
            } else if (a[right] > k) {
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
        int[] a = {12, 4, 7, 15, 3, 10, 8};
        partitionIterative(a, 8);
        System.out.println(java.util.Arrays.toString(a));
    }
}

