package Jul22_work.program5;

public class PartitionRecursive {

    static void partitionRecursive(int[] a, int k, int left, int right) {
        if (left >= right) {
            return;
        }
        if (a[left] <= k) {
            partitionRecursive(a, k, left + 1, right);
        } else if (a[right] > k) {
            partitionRecursive(a, k, left, right - 1);
        } else {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            partitionRecursive(a, k, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 4, 7, 15, 3, 10, 8};
        partitionRecursive(a, 8, 0, a.length - 1);
        System.out.println(java.util.Arrays.toString(a));
    }
}

