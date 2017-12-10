package hu.homework03.jf;

import java.util.Random;

public class PasswordGenerator {


    public String generatePassword(int length) {

        // Egy stringbe felveszem az összes lehetséges karaktert, a jelszónak pedig létrehozok egy üres stringet
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!%?";
        String password = "";
        Random random = new Random();
        //a megadott hosszon egy for ciklussal random karaktereket választok ki és hozzáfűzöm őket a password-höz
        for (int i = 0; i < length; i++) {
            int randomChar = random.nextInt(characters.length());
            password += characters.charAt(randomChar);

        }
        return password;


    }
}
