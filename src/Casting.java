public class Casting {
    public static void main(String[] args) {
        char c = 'z';
        int i = 250;
        double d = 301.067;
        double x = 5000.66;
        int a = 100;
        int b = 737;
        double d2 = 298.638;


        //char a int
        int convert = (int) c;

        //int a long
        long convert2 = (long) i;
        //ong a short
        short convert3 = (short) i;
        //double a long
        long convert4 = (long) d;


        System.out.println(convert);
        System.out.println(convert2);
        System.out.println(convert3);
        System.out.println(convert4);

        System.out.println((float) a + x);
        System.out.println((byte) b * a);
        System.out.println((long) d2 / 25);
    }
}