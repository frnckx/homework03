package hu.homework03.jf;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println(passwordGenerator.generatePassword(8));
        Game Game = new Game();
        Game.playBarkochbaWithNumbers();
        //System.out.println(User.setPassword());
    }
}
