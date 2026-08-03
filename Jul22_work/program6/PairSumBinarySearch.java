package Jul22_work.program6;

public class PairSumBinarySearch {

    static boolean findPairBinarySearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            int target = k - a[i];
            if (binarySearch(a, target, i + 1, a.length - 1)) {
                System.out.println("Pair found: " + a[i] + " and " + target);
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] a, int target, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 11, 15, 20};
        System.out.println(findPairBinarySearch(a, 18));
    }
}

