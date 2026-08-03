package Jul22_work.Performance_Test;

import java.util.Random;

public class PalindromeBenchmark {

    // Reverse & Compare
    public static boolean reverseCompare(String text){

        StringBuilder sb = new StringBuilder(text);

        return text.equals(sb.reverse().toString());

    }

    // Recursive Two Pointer
    public static boolean recursivePalindrome(String text,int left,int right){

        if(left>=right)
            return true;

        if(text.charAt(left)!=text.charAt(right))
            return false;

        return recursivePalindrome(text,left+1,right-1);

    }

    // สร้าง Palindrome
    public static String createPalindrome(int size){

        Random random = new Random();

        char[] arr = new char[size];

        for(int i=0;i<size/2;i++){

            char c=(char)('a'+random.nextInt(26));

            arr[i]=c;
            arr[size-1-i]=c;

        }

        if(size%2==1)
            arr[size/2]=(char)('a'+random.nextInt(26));

        return new String(arr);

    }

    public static void main(String[] args){

        int[] sizes={100,1000,5000,10000};

        System.out.printf("%-10s %-20s %-20s%n",
                "Size",
                "ReverseCompare(ns)",
                "Recursive(ns)");

        for(int size:sizes){

            String text=createPalindrome(size);

            long reverseTime=0;
            long recursiveTime=0;

            for(int i=0;i<5;i++){

                long start=System.nanoTime();
                reverseCompare(text);
                long end=System.nanoTime();
                reverseTime+=(end-start);

                start=System.nanoTime();
                recursivePalindrome(text,0,text.length()-1);
                end=System.nanoTime();
                recursiveTime+=(end-start);

            }

            System.out.printf("%-10d %-20d %-20d%n",
                    size,
                    reverseTime/5,
                    recursiveTime/5);

        }

    }

}
