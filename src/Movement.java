public class Movement {
    // E     Almacenará la pieza, la columna original (char) y la fila (int) y la column de destino (char) y la fila (int). (Declarar los campos como públicos)

    public Piece piece;
    public int originalRow;
    public char originalCol;
    public int destinationRow;
    public char destinationCol;

    // constructor
    public Movement(Piece piece, char originalCol, int originalRow,
                    char destinationCol, int destinationRow ) {
        this.piece = piece;
        this.originalRow = originalRow;
        this.originalCol = originalCol;
        this.destinationRow = destinationRow;
        this.destinationCol = destinationCol;
    }
    // F Cree el método toString en la clase Movimiento que imprimirá:  BLACK KNIGHT from B8 to C6
    public String toString() {
        String s = piece.toString() + " from ";
        s = s + originalCol + originalRow + " to " + destinationCol + destinationRow;

        return s;
    }
}
