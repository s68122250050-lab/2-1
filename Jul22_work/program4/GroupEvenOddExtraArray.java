package Jul22_work.program4;

public class GroupEvenOddExtraArray {

    static int[] rearrangeExtraArray(int[] a) {
        int[] result = new int[a.length];
        int idx = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                result[idx++] = x;
            }
        }
        for (int x : a) {
            if (x % 2 != 0) {
                result[idx++] = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 7, 4, 9, 6};
        System.out.println(java.util.Arrays.toString(rearrangeExtraArray(a)));
        // ผลลัพธ์: [2, 4, 6, 5, 7, 9]  -> รักษาลำดับเดิมของแต่ละกลุ่มไว้ได้ (Stable)
    }
}

