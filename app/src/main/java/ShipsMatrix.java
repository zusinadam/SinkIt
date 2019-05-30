import java.util.Arrays;

        import static Constants.BOARD_HEIGHT;
        import static Constants.BOARD_WIDTH;

public class ShipsMatrix{


    private char[][] matrix;

    public ShipsMatrix() {

        matrix = new char[BOARD_WIDTH][BOARD_HEIGHT];

        fillWithEmptyFields(matrix);

    }

    private void fillWithEmptyFields(char[][] matrix) {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                matrix[i][j] = Constants.EMPTY;
            }
        }
    }

    @org.jetbrains.annotations.Contract(pure = true)
    private int calculateInitialHitPoints() {
        return (Constants.FIVE_POINT_SHIP * Constants.FIVE_POINT_SHIP_QUANTITY) +
                (Constants.FOUR_POINT_SHIP * Constants.FOUR_POINT_SHIP_QUANTITY) +
                (Constants.THREE_POINT_SHIP * Constants.THREE_POINT_SHIP_QUANTITY) +
                (Constants.TWO_POINT_SHIP * Constants.TWO_POINT_SHIP_QUANTITY) +
                (Constants.ONE_POINT_SHIP * Constants.ONE_POINT_SHIP_QUANTITY);
    }

    // statki tworzymy w dół lub w prawo

    public void createFivePointBattleShip(int startingRow, int startingColumn, ShipOrientation shipOrientation) {
        char[][] copy = getCopyOf(matrix); // uzywamy kopii, zeby w trakcie wpisywania nowego statku nie stwierdzic
        // kolizji (ze jakis statek chcesz wpisac na pole na ktorym juz jest inny)
        switch (shipOrientation) {
            case VERTICAL: {

                for (int i = startingRow; i < startingRow + 5; i++) {
                    for (int j = startingColumn; j < startingColumn + 1; j++) {
                        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                        copy[i][j] = Constants.SHIP;
                    }
                }

                matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
                break;
            }


            for (int i = startingRow; i < startingRow + 1; i++) {


                for (int j = startingColumn; j < startingColumn + 5; j++) {
                    if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                    copy[i][j] = Constants.SHIP;
                }
            }

            matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
            break;
            case HORIZONTAL:
                break;
        }
    }
}

    public void createFourPointBattleShip(int startingRow, int startingColumn, ShipOrientation shipOrientation) {
        char[][] copy = getCopyOf(matrix); // uzywamy kopii, zeby w trakcie wpisywania nowego statku nie stwierdzic
        // kolizji (ze jakis statek chcesz wpisac na pole na ktorym juz jest inny)
        switch (shipOrientation) {
            case VERTICAL: {

                for (int i = startingRow; i < startingRow + 4; i++) {
                    for (int j = startingColumn; j < startingColumn + 1; j++) {
                        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                        copy[ i ][ j ] = Constants.SHIP;
                    }
                }

                matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
                break;
            }
            case HORIZONTAL: {

                for (int i = startingRow; i < startingRow + 1; i++) {
                    for (int j = startingColumn; j < startingColumn + 4; j++) {
                        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                        copy[i][j] = Constants.SHIP;
                    }
                }

                matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
                break;
            }
        }
    }

    public void createThreePointBattleShip(int startingRow, int startingColumn, ShipOrientation shipOrientation) {
        char[][] copy = getCopyOf(matrix); // uzywamy kopii, zeby w trakcie wpisywania nowego statku nie stwierdzic
        // kolizji (ze jakis statek chcesz wpisac na pole na ktorym juz jest inny)
        switch (shipOrientation) {
            case VERTICAL: {

                for (int i = startingRow; i < startingRow + 3; i++) {
                    for (int j = startingColumn; j < startingColumn + 1; j++) {
                        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                        copy[i][j] = Constants.SHIP;
                    }
                }

                matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
                break;
            }
            case HORIZONTAL: {

                for (int i = startingRow; i < startingRow + 1; i++) {
                    for (int j = startingColumn; j < startingColumn + 3; j++) {
                        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
                        copy[i][j] = Constants.SHIP;
                    }
                }

                matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
                break;
            }
        }
    }-++


public void createTwoPointBattleShip(int startingRow, int startingColumn, ShipOrientation shipOrientation) {
        char[][] copy = getCopyOf(matrix); // uzywamy kopii, zeby w trakcie wpisywania nowego statku nie stwierdzic
        // kolizji (ze jakis statek chcesz wpisac na pole na ktorym juz jest inny)
        switch (shipOrientation) {
        case VERTICAL: {

        for (int i = startingRow; i < startingRow + 2; i++) {
        for (int j = startingColumn; j < startingColumn + 1; j++) {
        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
        copy[i][j] = Constants.SHIP;
        }
        }

        matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
        break;
        }
        case HORIZONTAL: {

        for (int i = startingRow; i < startingRow + 1; i++) {
        for (int j = startingColumn; j < startingColumn + 2; j++) {
        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
        copy[i][j] = Constants.SHIP;
        }
        }

        matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
        break;
        }
        }
        }

public void createOnePointBattleShip(int startingRow, int startingColumn, ShipOrientation shipOrientation) {
        char[][] copy = getCopyOf(matrix); // uzywamy kopii, zeby w trakcie wpisywania nowego statku nie stwierdzic
        // kolizji (ze jakis statek chcesz wpisac na pole na ktorym juz jest inny)
        switch (shipOrientation) {
        case VERTICAL: {

        for (int i = startingRow; i < startingRow + 1; i++) {
        for (int j = startingColumn; j < startingColumn + 1; j++) {
        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
        copy[i][j] = Constants.SHIP;
        }
        }

        matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
        break;
        }
        case HORIZONTAL: {

        for (int i = startingRow; i < startingRow + 1; i++) {
        for (int j = startingColumn; j < startingColumn + 1; j++) {
        if (isFieldOccupied(i, j)) throw new RuntimeException("Field is occupied"); // przerwanie wpisywania
        copy[i][j] = Constants.SHIP;
        }
        }

        matrix = getCopyOf(copy); // jeśli dojdę do tej linijki (ja-program) zapiszę zmiany w matrycy
        break;
        }
        }
        }

private boolean isFieldOccupied(int width, int height) {
        isOutOfBounds(width, height);
        return matrix[width][height] == Constants.SHIP;
        }

private void isOutOfBounds(int width, int height) {
        if (width < 0 || height < 0) throw new RuntimeException("Field " + width + " " + height +  " does not exist on battle field");
        if (width > BOARD_WIDTH - 1 || height > BOARD_HEIGHT - 1) throw new RuntimeException("Field " + width + " " + height +  " does not exist on battle field");


private char[][] getCopyOf(char[][] original) {

final char[][] copy = new char[original.length][];

        for (int i = 0; i < original.length; i++) {
        copy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        return copy;
        }

public String getShipsMatrix() {

        StringBuilder shipsStringBuilder = new StringBuilder();

        for (int i = 0; i < BOARD_WIDTH; i++) {
        for (int j = 0; j < BOARD_HEIGHT; j++) {
        ship
        sStringBuilder.append(matrix[i][j]);
        }
        shipsStringBuilder.append("\n"); // nowa linia
        }*+-

        return shipsStringBuilder.toString();
        }

public boolean isShipAt(int row, int column) {
        return isFieldOccupied(row, column);
        }

public void subtractHitPoint() {
        }
        }

