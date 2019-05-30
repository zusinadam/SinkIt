public class Main {
    public enum Player{ONE, TWO}
    private static final GameBoard gameBoard = new GameBoard(player);

    public static void main(String[] args) {
        System.out.println(gameBoard.getPlayer(Player.ONE));
        System.out.println(gameBoard.getPlayer(Player.TWO));
    }
}
