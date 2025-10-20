public class CodingBat {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};

        Boolean one = sleepIn(false, false);
        String two = endUp("Hello World!");
        int three = countEvens(nums);
        String four = makeAbba("Hello", "Jello");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public static String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        String strLow = str.substring(0, str.length()-3);
        String strUp = str.substring(str.length()-3);
        return strLow + strUp.toUpperCase();
    }

    public static int countEvens(int[] nums) {
        int n=0;
        int count=0;
        for (int num : nums) {
            n = num % 2;
            if (n == 0) count += 1;
        }
        return count;
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

}