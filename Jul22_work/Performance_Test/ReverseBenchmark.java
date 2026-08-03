package Jul22_work.Performance_Test;

import java.util.Random;

public class ReverseBenchmark {

    // Recursive
    public static String reverseRecursive(String str) {
        if (str.length() <= 1)
            return str;
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    // Iterative (StringBuilder)
    public static String reverseIterative(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    // สร้างข้อความสุ่ม
    public static String randomString(int size) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        int[] sizes = {100,1000,5000,10000};

        System.out.printf("%-10s %-20s %-20s%n",
                "Size","Recursive(ns)","Iterative(ns)");

        for(int size : sizes){

            String text = randomString(size);

            long recursiveTime = 0;
            long iterativeTime = 0;

            for(int i=0;i<5;i++){

                long start = System.nanoTime();
                reverseRecursive(text);
                long end = System.nanoTime();
                recursiveTime += (end-start);

                start = System.nanoTime();
                reverseIterative(text);
                end = System.nanoTime();
                iterativeTime += (end-start);
            }

            System.out.printf("%-10d %-20d %-20d%n",
                    size,
                    recursiveTime/5,
                    iterativeTime/5);
        }
    }
}
