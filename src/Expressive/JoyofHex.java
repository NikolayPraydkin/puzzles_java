package Expressive;

public class JoyofHex {
    public static void main(String[] args) {

        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));

        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
