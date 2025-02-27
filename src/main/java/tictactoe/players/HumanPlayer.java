package tictactoe.players;

import tictactoe.game.TicTacToe;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public int chooseCell(TicTacToe ttt) {
        System.out.println("Please enter the number of the cell from 0 to 8: ");
        while (true){
            try {
                int index = Integer.parseInt(scanner.nextLine());;
                if (index >= 0 && index <= 8){
                    if (ttt.isCellEmpty(index)) {
                        return index;
                    } else {
                        System.out.println("The cell is already taken");
                    }
                }
                System.out.print("Something went wrong. Please enter the number of the cell from 0 to 8: ");
            } catch (NumberFormatException e){
                System.out.println("Something went wrong. Please enter the number of the cell from 0 to 8: ");
            }
        }
    }
}
