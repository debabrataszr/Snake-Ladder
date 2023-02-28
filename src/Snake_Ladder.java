public class Snake_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator Program" );
        int PlayerPos = 0;
        System.out.println("Player is at start Position " + PlayerPos);
        int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Player rolls the die and gets " + randomCheck);
    }
}