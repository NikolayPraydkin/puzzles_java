package Expressive;

public class LongDivision {

    public static void main(String[] args) {
        // будет переполнение, деление как long, а результат запишется в int
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
        //правильное решение
        final long MICROS_PER_DAY1 = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY1 = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY1 / MILLIS_PER_DAY1);

    }
}
