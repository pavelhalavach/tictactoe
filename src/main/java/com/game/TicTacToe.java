package com.game;

import java.util.Arrays;

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

    public String[] getCells() {
        return cells;
    }

    public void setCells(String[] cells) {
        this.cells = cells;
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        isGameFinished = gameFinished;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
