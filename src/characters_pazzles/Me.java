package characters_pazzles;

import java.util.regex.Pattern;

public class Me {

    public static void main(String[] args) {
//        System.out.println(
                // неправильно
//                Me.class.getName().replaceAll(".", "/") + ".class");
                // правильно так
//                Me.class.getName().replaceAll("\\.", "/") + ".class");
                // или так
                 System.out.println(Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
    }
}
