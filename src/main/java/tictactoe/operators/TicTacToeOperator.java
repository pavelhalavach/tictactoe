package tictactoe.operators;

import tictactoe.game.TicTacToe;

import java.util.*;

public class TicTacToeOperator {

    public static void operateTurn(TicTacToe ttt, int index){
        ttt.fillCell(index);
        if (isPlayerWins(ttt.getCells(), ttt.getCurrentPlayer())){
            System.out.println("Player " + ttt.getCurrentPlayer() + " wins!");
            ttt.setGameFinished(true);
        }
        else if (isDraw(ttt.getCells())) {
            System.out.println("It's a draw. Friendship wins!");
            ttt.setGameFinished(true);
        } else {
            ttt.switchPlayer();
        }
    }

    private static boolean isPlayerWins(String[] cells, String currentPlayer){
        Map<Integer, List<Integer>> winConditions = new HashMap<>();
        winConditions.put(1, Arrays.asList(0, 1, 2));
        winConditions.put(2, Arrays.asList(3, 4, 5));
        winConditions.put(3, Arrays.asList(6, 7, 8));
        winConditions.put(4, Arrays.asList(0, 3, 6));
        winConditions.put(5, Arrays.asList(1, 4, 7));
        winConditions.put(6, Arrays.asList(2, 5, 8));
        winConditions.put(7, Arrays.asList(0, 4, 8));
        winConditions.put(8, Arrays.asList(2, 4, 6));

        for (List<Integer> value : winConditions.values()){
            if (cells[value.get(0)].equals(currentPlayer) &&
                    cells[value.get(1)].equals(currentPlayer) &&
                    cells[value.get(2)].equals(currentPlayer)){
                return true;
            }
        }
        return false;
    }

    private static boolean isDraw(String[] cells){
        return !Arrays.asList(cells).contains(" ");
    }
}
