package characters_pazzles;

import java.io.UnsupportedEncodingException;

public class StringCheese {

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[256];
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        // плохо, не указана кодировка
//        String str = new String(bytes);
        // лучше так
        String str = new String(bytes, "ISO-8859-1");
        for(int i = 0, n = str.length(); i < n; i++)
            System.out.print((int)str.charAt(i) + " ");
    }
}
