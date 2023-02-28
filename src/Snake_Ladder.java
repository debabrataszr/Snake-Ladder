public class Snake_Ladder {
    static int winposition = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator Program");
        int Player1Pos = 0;
        int Player2Pos = 0;
        System.out.println("Player is at start Position " + Player1Pos);
        int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Player rolls the die and gets " + randomCheck);

        //player1
        int Option = (int) Math.floor(Math.random() * 10) % 3;
        switch (Option) {
            case 0:
                System.out.println("Ladder \nPlayer moves forward by " + randomCheck);
                Player1Pos += randomCheck;
                break;
            case 1:
                System.out.println("Snake \nPlayer moves behind by " + randomCheck);
                Player1Pos -= randomCheck;
                break;
            default:
                System.out.println("NO PLAY \nPlayer remains in the same position " + randomCheck);
                Player1Pos += 0;
                break;
        }

        //player2
        int Option1 = (int) Math.floor(Math.random() * 10) % 3;
        switch (Option1) {
            case 0:
                System.out.println("Ladder \nPlayer moves forward by " + randomCheck);
                Player2Pos += randomCheck;
                break;
            case 1:
                System.out.println("Snake \nPlayer moves behind by " + randomCheck);
                Player2Pos -= randomCheck;
                break;
            default:
                System.out.println("NO PLAY \nPlayer remains in the same position " + randomCheck);
                Player2Pos += 0;
                break;
        }
        if (winposition > Player1Pos) {
            winposition = 0;
        }
        if (winposition > 100) {
            winposition -= randomCheck;
        }
        System.out.println(winposition);
        randomCheck++;

        System.out.println("Total Number Of Times Die Rolled Are : " + randomCheck);

        if (Player2Pos == 100) {
            System.out.println("winner player 1 !! " + Player1Pos + "/100");
        } else System.out.println("winner player 2 !! " + Player2Pos + "/100");
    }
}
