package com.zipcodewilmington.assessment1.part1;

import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";
    protected static final HashMap<String, String> losingMoves = new HashMap<>();
    protected static final HashMap<String, String> winningMoves = new HashMap<>();

    public RockPaperSissorsEvaluator() {
        String[][] losingMovesArr = new String[][] {{ ROCK, SCISSOR }, { PAPER, ROCK }, { SCISSOR, PAPER }};
        String[][] winningMovesArr = new String[][] { { ROCK, PAPER }, { PAPER, SCISSOR }, { SCISSOR, ROCK }};
        for (int i = 0; i < losingMovesArr.length; i++) {
            String[] losingMove = losingMovesArr[i];
            String[] winningMove = winningMovesArr[i];
            losingMoves.put(losingMove[0], losingMove[1]);
            winningMoves.put(winningMove[0], winningMove[1]);
        }
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        return winningMoves.get(handSign);
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        return losingMoves.get(handSign);
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        boolean didPlayer2Lose = losingMoves.get(handSignOfPlayer1).equals(handSignOfPlayer2);
        boolean didPlayer1Lose = losingMoves.get(handSignOfPlayer2).equals(handSignOfPlayer1);

        return didPlayer2Lose ? handSignOfPlayer1 : didPlayer1Lose ? handSignOfPlayer2 : "tie";
    }
}
