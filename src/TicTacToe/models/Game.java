package TicTacToe.models;

import TicTacToe.strategy.winningStrategy.WinningStrategy;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> playerList;
    private List<Move> moves;
    private GameStatus gameStatus;
    private Player winner;
    private int nextPlayerMoveIndex;

    private List<WinningStrategy> winningStrategies;
}
