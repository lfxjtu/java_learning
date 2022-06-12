public class FourDistinctDigits {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1000; i < 10000; i++) {
            int digit, tenDigit, hundredDigit, thousandDigit;
            digit = i % 10;
            tenDigit = (i - digit) / 10 % 10;
            hundredDigit = (i - digit - tenDigit * 10) / 100 % 10;
            thousandDigit = (i - digit - tenDigit * 10 - hundredDigit * 100)/1000;
            if (thousandDigit != hundredDigit && thousandDigit != tenDigit
                    && thousandDigit != digit && hundredDigit != tenDigit
                    && hundredDigit != digit && tenDigit != digit) {
                System.out.println(i);
                num++;
            }
        }
        System.out.println("Final number of four distinct digit between 1000 and 9999 is: " + num);
    }
}
