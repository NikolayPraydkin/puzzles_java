package Expressive;

public class Oddarguments {


    public static void main(String[] args) {
        System.out.println(isOdd(-1024));

    }

    public static boolean isOdd(int key) {

        return (key & 1) == 0;

    }
}
