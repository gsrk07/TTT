package TicTacToe.models;

public class Player {

    public Player(Symbol symbol, String playername, PlayerType playerType) {
        this.symbol = symbol;
        this.playername = playername;
        this.playerType = playerType;
    }

    private Symbol symbol;
    private String playername;

    private PlayerType playerType;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
