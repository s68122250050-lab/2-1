package Jul22_work.program2;

public class PalindromeRecursive {

    static String clean(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    // Base Case: left >= right แปลว่าตรวจครบทุกคู่แล้ว
    // Recursive Case: ถ้าอักษรคู่นี้ตรงกัน ให้ตรวจคู่ถัดไป
    static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String[] tests = {"racecar", "level", "algorithm",
                           "gohangasalamiimalasagnahog",
                           "A man, a plan, a canal: Panama"};
        for (String t : tests) {
            String c = clean(t);
            System.out.println(t + " -> " + isPalindromeRecursive(c, 0, c.length() - 1));
        }
    }
}

