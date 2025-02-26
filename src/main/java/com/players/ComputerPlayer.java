package com.players;

import com.game.TicTacToe;

import java.util.Random;

public class ComputerPlayer implements Player{
    private final Random random = new Random();
    @Override
    public int chooseCell(TicTacToe ttt) {
        while (true){
            int index = random.nextInt(9);
            if (ttt.isCellEmpty(index)){
                return index;
            }
        }
    }
}
