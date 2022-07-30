package rocks.zipcodewilmington.tictactoe;

import java.util.Objects;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character [][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner().equalsIgnoreCase("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equalsIgnoreCase("O");
    }

    public Boolean isTie() {
        return getWinner()=="";
    }

    public String getWinner() {
        String winner="";
        if ((board[0][0] == board[1][1]) &&
                (board[0][0] == board[2][2])) {
            winner = board[0][0].toString();
        }
        else if ((board[2][0] == board[0][2]) &&
                (board[2][0] == board[1][1])) {
            winner = board[1][1].toString();
        }
        else{
            for (int i=0;i<3;i++) {
                if ((board[i][0] == board[i][1]) &&
                        (board[i][0] == board[i][2])){
                    winner = board[i][0].toString();
                    break;
                }
                else if ((board[0][i] == board[1][i]) &&
                        (board[0][i] == board[2][i])){
                    winner = board[0][i].toString();
                    break;
                }
            }
        }
        return winner;
    }
}





