public class ArrayCaseStudy {
    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int pass = 0;

        System.out.println("นักศึกษาที่ควรทบทวน (คะแนน < 5)");

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > max)
                max = scores[i];

            if (scores[i] < min)
                min = scores[i];

            if (scores[i] >= 7)
                pass++;

            if (scores[i] < 5)
                System.out.println("Student " + (i + 1) + " : " + scores[i]);
        }

        double average = (double) sum / scores.length;

        System.out.println("\nคะแนนรวม = " + sum);
        System.out.println("คะแนนเฉลี่ย = " + average);
        System.out.println("คะแนนสูงสุด = " + max);
        System.out.println("คะแนนต่ำสุด = " + min);
        System.out.println("จำนวนคนที่ได้ตั้งแต่ 7 คะแนนขึ้นไป = " + pass);
    }
}

