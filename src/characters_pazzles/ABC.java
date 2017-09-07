package characters_pazzles;

public class ABC {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        // выведеться ерунда
        System.out.println(letters + " easy as " + numbers);
        //норм
        System.out.println(letters + " easy as " + String.valueOf(numbers));
        // или так
        System.out.print(letters + " easy as ");
        System.out.println(numbers);
    }
}
