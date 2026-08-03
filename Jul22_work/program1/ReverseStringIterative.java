package Jul22_work.program1;

public class ReverseStringIterative {

    static String reverseIterative(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "pots&pans";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + reverseIterative(input));
    }
}

