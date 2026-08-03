package Jul22_work.program3;

public class VowelConsonantRecursive {

    static boolean hasMoreVowelsRecursive(String s) {
        return countRecursive(s, 0, 0, 0);
    }

    // Base Case: ตรวจครบทุกตัวอักษรแล้ว เปรียบเทียบผลรวม
    // Recursive Case: จำแนกตัวอักษรปัจจุบันแล้วส่งค่านับต่อไปยังการเรียกครั้งถัดไป
    private static boolean countRecursive(String s, int index, int vowels, int consonants) {
        if (index == s.length()) {
            return vowels > consonants;
        }
        char c = Character.toLowerCase(s.charAt(index));
        if (!Character.isLetter(c)) {
            return countRecursive(s, index + 1, vowels, consonants);
        }
        boolean isVowel = "aeiou".indexOf(c) >= 0;
        if (isVowel) {
            return countRecursive(s, index + 1, vowels + 1, consonants);
        } else {
            return countRecursive(s, index + 1, vowels, consonants + 1);
        }
    }

    public static void main(String[] args) {
        String input = "education";
        System.out.println(input + " -> " + hasMoreVowelsRecursive(input));
    }
}

