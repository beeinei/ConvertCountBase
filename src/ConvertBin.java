public class ConvertBin {

   // In hex, assuming that letters are lower-cased.

    public static char bin2OctDigit(String binTrio) {

        int sum;

        if (binTrio.charAt(0) == '1') {
            sum = 4;
        } else {
            sum = 0;
        }
        if (binTrio.charAt(1) == '1') {
            sum += 2;
        } else {
            sum += 0;
        }
        if (binTrio.charAt(2) == '1') {
            sum += 1;
        } else {
            sum += 0;
        }

        return (char)(sum+'0');
    }

    public static char bin2HexDigit(String binNibble) {

        int sum;

        if (binNibble.charAt(0) == '1') {
            sum = 8;
        } else {
            sum = 0;
        }
        if (binNibble.charAt(1) == '1') {
            sum += 4;
        } else {
            sum += 0;
        }
        if (binNibble.charAt(2) == '1') {
            sum += 2;
        } else {
            sum += 0;
        }
        if (binNibble.charAt(3) == '1') {
            sum += 1;
        } else {
            sum += 0;
        }

        if (sum <= 9) {
            return (char)(sum+'0');
        } else {
            return (char)(sum - 10 + 'a');
        }
    }

    public static String hex2BinDigit(char hexNum) {

        String s = "";
        int num;

        if ('0' <= hexNum && hexNum <= '9') {
            num = hexNum - '0';
        } else {
            num = hexNum - 'a' + 10;
        }

        for (int i = 0; i < 4; i++) {
            if (num % 2 != 0) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            num = num / 2;
        }

        return s;
    }

    public static String oct2BinDigit(char octNum) {

        String s = "";
        int num;

        if ('0' <= octNum && octNum <= '9') {
            num = octNum - '0';
        } else {
            num = octNum - 'a' + 10;
        }

        for (int i = 0; i < 3; i++) {
            if (num % 2 != 0) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            num = num / 2;
        }

        return s;
    }

    public static String convertOct2Bin(String numOct) {

        String s = "";

        for (int i = 0; i < (numOct.length()); i++) {
            s = s + oct2BinDigit(numOct.charAt(i));
        }

        return s;
    }

    public static String convertHex2Bin(String numHex) {

        String s = "";

        for (int i = 0; i < (numHex.length()); i++) {
            s = s + hex2BinDigit(numHex.charAt(i));
        }

        return s;
    }

    public static String convertBin2Oct(String numBin) {

        String s = "";

        while (numBin.length()%3!=0){
            numBin = "0" + numBin;
        }
        for (int i = 0; i < (numBin.length()-1); i=i+3) {
            s = s + bin2OctDigit(numBin.substring(i, i+3));
        }

        return s;
    }

    public static String convertBin2Hex(String numBin) {

        String s = "";

        while (numBin.length()%4!=0){
            numBin = "0" + numBin;
        }
        for (int i = 0; i < (numBin.length()); i=i+4) {
            s = s + bin2HexDigit(numBin.substring(i, i+4));
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println("Bin->Hex:" + convertBin2Hex("1001011001101"));
        System.out.println("Hex->Bin:" + convertHex2Bin("12cd"));
        System.out.println("Bin->Oct:" + convertBin2Oct("11100"));
        System.out.println("Oct->Bin:" + convertOct2Bin("34"));

        //if works, output is - 12cd 1001011001101 34 011100
    }

}
