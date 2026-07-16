public class MergeSort {

    // ฟังก์ชัน sort (จากรูปโจทย์ข้อ 2)
    public static void sort(int[] values) {
        int middle = values.length / 2;
        int[] left = new int[middle];
        // ... โค้D loop ของ left ...

        int[] right = new int[values.length - middle];
        // ... โค้ด loop ของ right ...

        sort(left);
        sort(right);
        
        // เรียกใช้ฟังก์ชัน merge ตรงนี้หลังจากแยกเสร็จ
        merge(values, left, right);
    } // ปิดปีกกาของฟังก์ชัน sort ตรงนี้ก่อน!

    //   แล้วค่อยเขียนฟังก์ชัน merge ต่อท้ายแบบนี้
    public static void merge(int[] values, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                values[k] = left[i];
                i++;
            } else {
                values[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            values[k] = left[i]; i++; k++;
        }
        while (j < right.length) {
            values[k] = right[j]; j++; k++;
        }
    }
}