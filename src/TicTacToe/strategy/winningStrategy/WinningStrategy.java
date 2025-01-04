package TicTacToe.strategy.winningStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Player;

public interface WinningStrategy {

    boolean checkWinner(Board board, Player player, Cell cell);
}
