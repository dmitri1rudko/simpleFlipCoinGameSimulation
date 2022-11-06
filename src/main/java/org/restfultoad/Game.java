package org.restfultoad;

import java.util.Random;

public class Game {
    private Player player1;
    private Player player2;
    private boolean isInitiated = true;


    private Random random = new Random();


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }


    public void StartGame() {
        System.out.println(getHeaderText());

        while (isInitiated) {
            if (flipCoin()) {
                player1.addCoin();
                player2.removeCoin();
            } else {
                player2.addCoin();
                player1.removeCoin();
            }

            if (player1.getCoins() == 0 || player2.getCoins() == 0) {
                gameEnd();
            }
        }
    }


    private boolean flipCoin() {
        int rnd = random.nextInt(0,2);

        if (rnd == 1)
            return true;
        else
            return false;
    }


    private String getHeaderText() {
        return "The game is about flip a coin.\n" +
                "If the coin flips heads, a player gets 1 coin from another\n" +
                "If it tails - he gives 1.\n" +
                "The winner is who gets all coins from another\n";
    }


    private void printWinner(Player player) {
        System.out.printf("The winner is: %s", player.getName());
    }


    private void printLooser(Player player) {
        System.out.printf("\nAlso the looser is: %s", player.getName());
    }


    private void gameEnd() {
        isInitiated = false;

        if (player1.getCoins() == 0) {
            printWinner(player2);
            printLooser(player1);
        } else {
            printWinner(player1);
            printLooser(player2);
        }

    }
}
