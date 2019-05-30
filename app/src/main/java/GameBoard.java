public class GameBoard {

    private PlayerBoard playerOneBoard;
    private PlayerBoard playerTwoBoard;
    private Player player;

    public GameBoard(Player player) {
        this.player = player;
        this.playerOneBoard = new PlayerBoard();
        this.playerTwoBoard = new PlayerBoard();
    }

    public String getPlayer(Player player) {
        StringBuilder sb = new StringBuilder();

        if (player.equals(Player.ONE)) {
            sb.append("---=== Player ");
            sb.append(" ===---\n\n");

            sb.append("BattleShips :\n\n");
            sb.append(playerOneBoard.getShipsMatrix());

            sb.append("\n");

            sb.append("Shots :\n\n");
            sb.append(playerOneBoard.getShotsMatrix());
            sb.append("\n");

        } else if (player.equals(Player.TWO)) {
            sb.append("---=== Player ");
            sb.append(player.toString());
            sb.append("===---\n\n");

            sb.append("BattleShips :\n\n");
            sb.append(playerTwoBoard.getShipsMatrix());

            sb.append("Shots :\n\n");
        }

        return sb.toString();
    }

    public char getPlayer(Main.Player two) {
        return 0;
    }

    public enum Player{One, TWO}
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}