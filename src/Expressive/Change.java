package Expressive;

import java.math.BigDecimal;

public class Change {
    public static void main(String[] args) {
        //wrong
        System.out.println(2.00 - 1.10);
        //bad
        System.out.printf("%.2f%n", 2.00 - 1.10);
        // для денежный типов
        System.out.println((200 - 110) + " cents");

        // используем конструктор со String
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.10")));
    }

}
