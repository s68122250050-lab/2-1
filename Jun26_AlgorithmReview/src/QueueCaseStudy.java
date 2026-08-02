import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("P001");
        queue.add("P002");
        queue.add("P003");
        queue.add("P004");
        queue.add("P005");

        if (!queue.isEmpty())
            System.out.println("ให้บริการ " + queue.remove());

        if (!queue.isEmpty())
            System.out.println("ให้บริการ " + queue.remove());

        queue.add("P006");
        queue.add("P007");

        System.out.println("ผู้ป่วยคนถัดไป = " + queue.peek());

        System.out.println("จำนวนผู้ป่วยที่รอ = " + queue.size());

        System.out.println("สถานะ Queue");
        System.out.println(queue);

        if (queue.isEmpty()) {
            System.out.println("Queue ว่าง");
        } else {
            System.out.println("Queue ยังมีผู้ป่วยรอ");
        }

        System.out.println("\nFIFO (First In First Out)");
        System.out.println("ผู้ที่มาก่อน จะได้รับบริการก่อน");
    }
}
