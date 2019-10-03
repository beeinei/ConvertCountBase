public class Convert10toX {

    public static String convert10toX(int num, int x) {
        int div = num;
        int mod;
        String s = "";

        while (div > x) {
            mod = div % x;
            s = convertIntToChar(mod) + s;
            div = div / x;
        }
        mod = div % x;
        s = convertIntToChar(mod) + s;

        return s;
    }

    public static char convertIntToChar(int i){
        if (i<10) {
            return (char)(i+48);
        }else if(i<36){
            return (char)((i-10)+'a');
        }else{
            System.out.println("ERROR");
            return 'X';
        }
    }

    public static void main(String[] args) {
        System.out.println(convert10toX(1234, 16));
    }

}



