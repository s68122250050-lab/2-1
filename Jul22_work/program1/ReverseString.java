package Jul22_work.program1;

public class ReverseString {

    // Base Case: สตริงว่าง คืนค่าสตริงว่างกลับไป
    // Recursive Case: นำตัวอักษรตัวแรกไปต่อท้ายผลลัพธ์ของส่วนที่เหลือ
    static String reverseRecursive(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseRecursive(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "pots&pans";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + reverseRecursive(input));
    }
}
