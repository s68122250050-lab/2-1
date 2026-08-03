package Jul22_work.program2;

public class PalindromeReverse {

    // ทำความสะอาดสตริง: เก็บเฉพาะตัวอักษร/ตัวเลข และแปลงเป็นตัวพิมพ์เล็ก
    static String clean(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    static boolean isPalindromeByReverse(String s) {
        String cleaned = clean(s);
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String[] tests = {"racecar", "level", "algorithm",
                           "gohangasalamiimalasagnahog",
                           "A man, a plan, a canal: Panama"};
        for (String t : tests) {
            System.out.println(t + " -> " + isPalindromeByReverse(t));
        }
    }
}

