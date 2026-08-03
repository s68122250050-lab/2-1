package Jul22_work.program6;

public class PairSumBruteForce {

    static boolean findPairBruteForce(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("Pair found: " + a[i] + " and " + a[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 11, 15, 20};
        System.out.println(findPairBruteForce(a, 18));
    }
}

