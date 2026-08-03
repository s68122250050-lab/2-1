package Jul22_work.program6;

public class PairSumRecursive {

    static boolean findPairRecursive(int[] a, int k, int left, int right) {
        if (left >= right) {
            return false;
        }
        int sum = a[left] + a[right];
        if (sum == k) {
            System.out.println("Pair found: " + a[left] + " and " + a[right]);
            return true;
        } else if (sum < k) {
            return findPairRecursive(a, k, left + 1, right);
        } else {
            return findPairRecursive(a, k, left, right - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 11, 15, 20};
        System.out.println(findPairRecursive(a, 18, 0, a.length - 1));
    }
}

