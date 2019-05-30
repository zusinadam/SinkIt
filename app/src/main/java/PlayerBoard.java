public class PlayerBoard {
    private PlayerBoard playerOneBoard;
    private PlayerBoard playerTwoBoard;
    public enum Player{ONE, TWO}

    public PlayerBoard() {
        this.playerOneBoard = new PlayerBoard();
        this.playerTwoBoard = new PlayerBoard();
    }

    public String getPlayer(Player player) {
        StringBuilder sb = new StringBuilder();

        if (player.equals(Player.ONE)) {
            sb.append("---=== Player ");
            sb.append(player.toString());
            sb.append(" ===---\n\n");

            sb.append("BattleShips :\n\n");
            sb.append(playerOneBoard.getShipsMatrix());

            sb.append("\n");
            sb.append("Shots :\n\n");
            sb.append(playerOneBoard.getShotsMatrix());
        } else if (player.equals(Player.TWO)) {
            sb.append("---=== Player ");
            sb.append(player.toString());
            sb.append("===---\n\n");

            sb.append("BattleShips :\n\n");
            sb.append(playerTwoBoard.getShipsMatrix());

            sb.append("\n");

            sb.append("Shots :\n\n");
            sb.append(playerTwoBoard.getShotsMatrix());
        }

        return sb.toString();
    }

    int getShotsMatrix() {
        return 0;
    }

    public int getShipsMatrix() {
        return 0;
    }
}
