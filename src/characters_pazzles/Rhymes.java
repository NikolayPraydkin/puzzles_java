package characters_pazzles;

import java.util.Random;

public class Rhymes {

//    private static Random rnd = new Random();
    public static void main(String[] args) {
        // ошибки
//        StringBuffer word = null;
//        switch(rnd.nextInt(2)) {
//            case 1: word = new StringBuffer('P');
//            case 2: word = new StringBuffer('G');
//            default: word = new StringBuffer('M');
//        }
//        word.append('a');
//        word.append('i');
//        word.append('n');
//        System.out.println(word);

        StringBuffer word = null;
        switch(rnd.nextInt(3)) {
            case 1:
                word = new StringBuffer("P");
                break;
            case 2:
                word = new StringBuffer("G");
                break;
            default:
                word = new StringBuffer("M");
                break;
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);

        // или так
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");


        // или так
        String a[] = {"Main", "Pain", "Gain"};
        System.out.println(randomElement(a));


    }

    private static Random rnd = new Random();
    private static String randomElement(String[] a) {
        return a[rnd.nextInt(a.length)];
    }
}
