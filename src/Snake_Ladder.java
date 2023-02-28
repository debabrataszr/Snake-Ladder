public class Snake_Ladder {
    static int winposition = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator Program");
        int PlayerPos = 0;
        System.out.println("Player is at start Position " + PlayerPos);
        int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Player rolls the die and gets " + randomCheck);
        int Option = (int) Math.floor(Math.random() * 10) % 3;
        switch (Option) {
            case 0:
                System.out.println("Ladder \nPlayer moves forward by " + randomCheck);
                PlayerPos += randomCheck;
                break;
            case 1:
                System.out.println("Snake \nPlayer moves behind by " + randomCheck);
                PlayerPos -= randomCheck;
                break;
            default:
                System.out.println("NO PLAY \nPlayer remains in the same position " + randomCheck);
                PlayerPos += 0;
                break;
        }
        if (winposition > PlayerPos) {
            System.out.println(winposition);
        }
    }
}
