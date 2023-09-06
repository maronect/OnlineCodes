public class ReverseInteger {
    public static int reverse(int val){
        
        String num = val + "";

        int list [] = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            list[i] = val % 10;
            val /= 10;
        }

        double newNum = 0;

        for (int i = 0; i < list.length; i++) {
            newNum += (list[i] * Math.pow(10, (list.length - i) - 1) );
        }

        if(newNum > Integer.MAX_VALUE || newNum / 10< Integer.MIN_VALUE){
            return 0;
        }
        if(newNum < 0){
            return (int)(newNum / 10);
        }
        return (int)newNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1744));
    }
}
