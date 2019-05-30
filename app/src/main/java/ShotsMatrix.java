import static Constants.BOARD_HEIGHT;
import static Constants.BOARD_WIDTH;

public class ShotsMatrix {

    private char[][] matrix;
    private int width;
    private int height;
    private int row;
    private int column;

    public ShotsMatrix() {

        matrix = new char[BOARD_WIDTH][BOARD_HEIGHT];

        fillWithEmptyFields(matrix);

        markShot(4, 4);
        markEmpty(5, 0);
        markEmpty(5, 1);
        markEmpty(5, 2);
        markEmpty(5, 3);
    }

    private void fillWithEmptyFields(char[][] matrix) {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                matrix[i][j] = Constants.UNKNOWN;
            }
        }
    }

    public String getShotsMatrix() {

        StringBuilder shotsStringBuilder = new StringBuilder();

        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                shotsStringBuilder.append(matrix[i][j]);
            }
            shotsStringBuilder.append("\n"); // nowa linia
        }

        return shotsStringBuilder.toString();
    }

    private boolean isOutOfBounds(int width, int height, int row, int column) {
        this.width = width;
        this.height = height;
        this.row = row;
        this.column = column;
        if (width < 0 || height < 0) throw new RuntimeException("Field " + width + " " + height +  " does not exist on battle field");
        if (width > BOARD_WIDTH - 1 || height > BOARD_HEIGHT - 1) throw new RuntimeException("Field " + width + " " + height +  " does not exist on battle field");



    isOutOfBounds(width, height, row, column);
        return matrix[row][column] == Constants.HIT || matrix[row][column] == Constants.EMPTY;
    }

    private void fireAt(int row, int column, ShipsMatrix shipsMatrix) {
        if (hasFieldBeenFiredAt(row, column)) throw new RuntimeException("Field " + row + " " + column +  " has been shot already");
        if (shipsMatrix.isShipAt(row, column)) {
            shipsMatrix.subtractHitPoint();
            markShot(row, column);
        } else {
            markEmpty(row, column);
        }
    }

    private boolean hasFieldBeenFiredAt(int row, int column) {
        matrix[row][column] = Constants.UNKNOWN;
        return false;
    }

    private void markShot(int row, int column) {
        matrix[row][column] = Constants.HIT;
    }

    private void markEmpty(int row, int column) {
        matrix[row][column] = Constants.EMPTY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}