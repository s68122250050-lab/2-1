package Jul22_work.program5;

public class PartitionBySorting {

    static void partitionBySorting(int[] a, int k) {
        java.util.Arrays.sort(a);
        // หลังเรียงลำดับแล้ว สมาชิกที่ <= k จะอยู่ตำแหน่งหน้าสุดโดยอัตโนมัติ
    }

    public static void main(String[] args) {
        int[] a = {12, 4, 7, 15, 3, 10, 8};
        partitionBySorting(a, 8);
        System.out.println(java.util.Arrays.toString(a));
    }
}

