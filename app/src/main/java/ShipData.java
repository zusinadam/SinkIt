public class ShipData {

    private int row;
    private int column;
    private ShipOrientation orientation;

    public ShipData(int row, int column, ShipOrientation orientation) {
        this.row = row;
        this.column = column;
        this.orientation = orientation;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public ShipOrientation getOrientation() {
        return orientation;
    }
}
