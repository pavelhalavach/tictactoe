package com.game;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class TicTacToe {
    private String[] cells;
    private boolean isGameFinished;
    private String currentPlayer;

    public TicTacToe() {
        this.cells = new String[9];
        Arrays.fill(this.cells, " ");
        this.isGameFinished = false;
        this.currentPlayer = "x";
    }

    public void fillCell(int index){
        this.cells[index] = currentPlayer;
    }

    public void switchPlayer(){
        if (this.currentPlayer.equals("x")){
            this.currentPlayer = "o";
        }
        else {
            this.currentPlayer = "x";
        }
    }

    public boolean isCellEmpty(int index){
        return this.cells[index].equals(" ");
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        isGameFinished = gameFinished;
    }
}
