package Jul22_work.program3;

public class VowelConsonantIterative {

    static boolean hasMoreVowelsIterative(String s) {
        int vowels = 0, consonants = 0;
        for (char raw : s.toCharArray()) {
            char c = Character.toLowerCase(raw);
            if (!Character.isLetter(c)) {
                continue;
            }
            if ("aeiou".indexOf(c) >= 0) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return vowels > consonants;
    }

    public static void main(String[] args) {
        String input = "education";
        System.out.println(input + " -> " + hasMoreVowelsIterative(input));
    }
}

