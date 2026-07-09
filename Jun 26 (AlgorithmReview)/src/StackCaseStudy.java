import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Type Data");
        stack.push("Type Structure");
        stack.push("Delete Structure");
        stack.push("Type Algorithm");
        stack.push("Type Java");

        System.out.println("คำสั่งทั้งหมด");
        System.out.println(stack);

        System.out.println();

        for (int i = 0; i < 2; i++) {
            if (!stack.isEmpty()) {
                System.out.println("Undo : " + stack.pop());
            }
        }

        System.out.println("\nStack หลัง Undo");
        System.out.println(stack);

        if (stack.isEmpty()) {
            System.out.println("Stack ว่าง");
        } else {
            System.out.println("Stack ยังมีข้อมูล");
        }

        System.out.println("\nLIFO (Last In First Out)");
        System.out.println("ข้อมูลที่เข้าล่าสุด จะถูกนำออกก่อน");
    }
}
