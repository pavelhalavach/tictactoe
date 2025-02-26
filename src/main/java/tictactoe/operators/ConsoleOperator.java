package tictactoe.operators;

import tictactoe.game.TicTacToe;
import tictactoe.players.ComputerPlayer;
import tictactoe.players.HumanPlayer;
import tictactoe.players.Player;

import java.util.Scanner;

public class ConsoleOperator {
    private static final Scanner scanner = new Scanner(System.in);
    public static void introduceRules(){
        System.out.println("Welcome to the TicTacToe Game!");
        System.out.println("This is the board of the game, you can choose places to put X or O by indexes:");
        System.out.println("[" + 0 + "]" + " [" + 1 + "]" + " [" + 2 + "]");
        System.out.println("[" + 3 + "]" + " [" + 4 + "]" + " [" + 5 + "]");
        System.out.println("[" + 6 + "]" + " [" + 7 + "]" + " [" + 8 + "]");
        System.out.println("------------------------");
    }

    public static void printBoard(TicTacToe ttt){
        System.out.println("[" + ttt.getCells()[0] + "]" +
                            " [" + ttt.getCells()[1] + "]" +
                            " [" + ttt.getCells()[2] + "]");
        System.out.println("[" + ttt.getCells()[3] + "]" +
                            " [" + ttt.getCells()[4] + "]" +
                            " [" + ttt.getCells()[5] + "]");
        System.out.println("[" + ttt.getCells()[6] + "]" +
                            " [" + ttt.getCells()[7] + "]" +
                            " [" + ttt.getCells()[8] + "]");
        System.out.println("------------------------");
    }

    public static int selectGameType(){
        System.out.println("Select game type:");
        System.out.println("1 - Player vs Player");
        System.out.println("2 - Player vs Computer");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) return choice;
                System.out.print("Wrong choice, try again: ");
            } catch (NumberFormatException e) {
                System.out.print("Enter 1 or 2: ");
            }
        }
    }

    public static Player[] whoGoFirst(int choice) {
        Player playerX, playerO;
        if (choice == 1) {
            playerX = new HumanPlayer();
            playerO = new HumanPlayer();
        } else {
            System.out.println("Who will start?");
            System.out.println("1 - Human");
            System.out.println("2 - Computer");
            int firstPlayerChoice;
            while (true) {
                try {
                    firstPlayerChoice = Integer.parseInt(scanner.nextLine());
                    if (firstPlayerChoice == 1 || firstPlayerChoice == 2) break;
                    System.out.print("Wrong value, try again: ");
                } catch (NumberFormatException e) {
                    System.out.print("Enter 1 or 2: ");
                }
            }

            if (firstPlayerChoice == 1) {
                playerX = new HumanPlayer();
                playerO = new ComputerPlayer();
            } else {
                playerX = new ComputerPlayer();
                playerO = new HumanPlayer();
            }
        }
        return new Player[]{playerX, playerO};
    }
}
