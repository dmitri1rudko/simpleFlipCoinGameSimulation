package org.restfultoad;

public class Main {
    public static void main(String[] args) {

        Player joePlayer = new Player("Joe", 100);
        Player janePlayer = new Player("Jane", 100);

        Game game = new Game(joePlayer, janePlayer);
        game.StartGame();
    }
}