package com.Assignments;
public class SnakeLadder {
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int START_POSITION = 0;
    public static final int WIN = 100;

    public static void main(String[] args) {
        int playerPosition = 0;
        int dicePlayed = 0;

        System.out.println("Starting Position is " + START_POSITION);

        while (playerPosition < WIN) {
            dicePlayed++;
            int rollDice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("After Rolling Dice We Get " + rollDice);
            int playerCheckOption = (int) (Math.random() * 3) + 1;

            switch (playerCheckOption) {
                case NO_PLAY:
                    System.out.println("It's No Play, Your position is not changed, You are at :" + playerPosition);
                    break;

                case LADDER:
                    if ((playerPosition + rollDice) <= WIN) {
                        playerPosition = playerPosition + rollDice;
                        System.out.println(
                                "Congratulations !! You Got the ladder your position will be increesed by " + rollDice);
                    }
                    break;

                case SNAKE:
                    if ((playerPosition - rollDice) < START_POSITION) {
                        playerPosition = START_POSITION;
                    } else {
                        playerPosition = playerPosition - rollDice;
                        System.out.println(
                                "Oops !! You just got bitten by snake your position will be decreased by " + rollDice);
                    }
                    break;

                default:
                    System.out.println("Something went wrong!!");
            }
            System.out.println("Position  " + playerPosition);
        }
        System.out.println("We just make " + dicePlayed + " Number of dice to win the game");
    }
}
