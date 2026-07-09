public class ZeroFinder {
    public static int findZeroIndex(int[] a1, int[] a2) {
        int low = 0;
        int high = a2.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // ถ้าเจอเลข 0 ให้คืนค่าตำแหน่ง (index) ทันที
            if (a2[mid] == 0) {
                return mid;
            }

            // หมายเหตุ: ตัวอย่างโจทย์ใช้ Index เริ่มจาก 1 แต่โค้ดคอมพิวเตอร์เริ่มจาก 0
            // หาก mid เกินขอบเขตของ a1 แสดงว่า 0 อยู่ก่อนหน้านั้นแน่นอน
            if (mid >= a1.length) {
                high = mid - 1;
                continue;
            }

            // ถ้าค่าใน a1 และ a2 ตรงกัน แปลว่าเลข 0 อยู่ในครึ่งหลัง
            if (a1[mid] == a2[mid]) {
                low = mid + 1;
            } else {
                // ถ้าค่าไม่ตรงกัน แปลว่าโดนเลข 0 แทรกไปแล้วในฝั่งซ้าย (ครึ่งแรก)
                high = mid - 1;
            }
        }
        return -1; // กรณีไม่พบเลข 0
    }

    public static void main(String[] args) {
        // ตัวอย่างจากโจทย์ (ปรับเป็น 0-indexed สำหรับ Java)
        int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
        int[] a2 = {1, 3, 4, 0, 6, 7, 8, 9, 20};

        int index = findZeroIndex(a1, a2);
        System.out.println("ตำแหน่งของ 0 ใน Java array คือ: " + index);
        // จะได้ผลลัพธ์เป็น 2 (ถ้านับเริ่มจาก 1 แบบโจทย์จะได้ตำแหน่งที่ 3)
    }
}

