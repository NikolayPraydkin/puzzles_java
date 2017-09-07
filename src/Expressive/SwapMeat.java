package Expressive;

public class SwapMeat {
    public static void main(String[] args) {
        // не делаем так
        int x = 1984; // (0x7c0)
        int y = 2001; // (0x7d1)
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);

        //лучше так
        int x2 = 10;
        int y2 = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x2);
        System.out.println("y value: "+y2);
        x2 = x2+y2;
        y2=x2-y2;
        x2=x2-y2;
        System.out.println("After swap:");
        System.out.println("x value: "+x2);
        System.out.println("y value: "+y2);

    }
}
