package Jul22_work.program4;

public class GroupEvenOddRecursive {

    // Base Case: left ไม่น้อยกว่า right แปลว่าตรวจครบทุกตำแหน่งแล้ว
    // Recursive Case: เลื่อนตัวชี้ตามเงื่อนไข หรือสลับค่าแล้วขยับตัวชี้ทั้งสอง
    static void rearrangeRecursive(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        if (a[left] % 2 == 0) {
            rearrangeRecursive(a, left + 1, right);
        } else if (a[right] % 2 != 0) {
            rearrangeRecursive(a, left, right - 1);
        } else {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            rearrangeRecursive(a, left + 1, right - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 4, 1, 6, 3, 8};
        rearrangeRecursive(a, 0, a.length - 1);
        System.out.println(java.util.Arrays.toString(a));
    }
}

