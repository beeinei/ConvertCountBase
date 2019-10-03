public class ConvertXto10 {

    public static int convertXto10(String num, int X) {

        int sum = 0;
        int i = 0;
        int pow = num.length()-1;

        while(pow>=0){
            sum += (int)(Integer.valueOf(num.charAt(i)+"",X)*Math.pow(X,pow));
            i++;
            pow--;
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(convertXto10("4d2", 16));
        System.out.println(convertXto10("1010101010", 2));

        //if works, output is - 1234 682
    }
}
