package com;

import com.game.TicTacToe;
import com.operators.ConsoleOperator;
import com.operators.TicTacToeOperator;
import com.players.Player;


public class App 
{
    public static void main( String[] args ) {

        TicTacToe ttt = new TicTacToe();
        int choice = ConsoleOperator.selectGameType();
        Player[] players = ConsoleOperator.whoGoFirst(choice);
        Player playerX = players[0];
        Player playerO = players[1];

        ConsoleOperator.introduceRules();

        while(!ttt.isGameFinished()){
            Player currentPlayer;
            if (ttt.getCurrentPlayer().equals("x")){
                currentPlayer = playerX;
            }
            else {
                currentPlayer = playerO;
            }

            int index = currentPlayer.chooseCell(ttt);
            TicTacToeOperator.operateTurn(ttt, index);
            ConsoleOperator.printBoard(ttt);
        }


    }
}
