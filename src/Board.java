public class Board {
// C    almacenará las piezas de un ajedrez durante un juego
    private Piece[][] pieces; //crar array 2 dimensiones

    //  D    constructor que colocará las piezas en la posición inicial de un juego de ajedrez.
    //Establezca los elementos en nulo para las casillas de ajedrez vacías. (Utilice bucles for cuando sea posible)
    public Board() {
        pieces = new Piece[8][8];//tamaño de tablaero

        for (int i = 0; i < 8; i++) {
            pieces[1][i] = new Piece(TypeOfPiece.PAWN, Color.WHITE);
            pieces[6][i] = new Piece(TypeOfPiece.PAWN, Color.BLACK);
        }
        for (int i = 2; i <= 5; i++) {
            for(int j = 0; j < 8; j++) {
                pieces[i][j] = null;
            }
        }
        //rellenar el tablero
        pieces[0][0] = new Piece(TypeOfPiece.TOWER, Color.WHITE);
        pieces[0][1] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
        pieces[0][2] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
        pieces[0][3] = new Piece(TypeOfPiece.QUEEN, Color.WHITE);
        pieces[0][4] = new Piece(TypeOfPiece.KING, Color.WHITE);
        pieces[0][5] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
        pieces[0][6] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
        pieces[0][7] = new Piece(TypeOfPiece.TOWER, Color.WHITE);
        pieces[7][0] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
        pieces[7][1] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
        pieces[7][2] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
        pieces[7][3] = new Piece(TypeOfPiece.QUEEN, Color.BLACK);
        pieces[7][4] = new Piece(TypeOfPiece.KING, Color.BLACK);
        pieces[7][5] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
        pieces[7][6] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
        pieces[7][7] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
    }
    // G    acepte un movimiento y modifique el tablero en
    //consecuencia y devuelva verdadero si el movimiento fue válido o falso si el movimiento no fue válido (solo
    //verifique si la Pieza no estaba en la posición original o el la fila y la columna no son válidas).
    public boolean movePiece(Movement movement) {
        if (movement.originalRow < 1 || movement.originalRow > 8 ||
                movement.destinationRow < 1 || movement.destinationRow > 8 ||
                movement.originalCol < 'A' || movement.originalCol > 'H' ||
        movement.destinationCol < 'A' || movement.destinationCol > 'H')
        {

            return false;
        }
        int origCol = movement.originalCol - 'A';
        int destCol = movement.destinationCol - 'A';
        pieces[movement.destinationRow-1][destCol] = movement.piece;
        pieces[movement.originalRow-1][origCol] = null;

        return true;
    }

 // H   Devuelve la posición de las piezas así:  Observe que las piezas blancas se muestran con una letra minúscula y las piezas negras con una letra mayúscula.
 // K    devolverá el Tablero y la lista con todos los movimientos.
    public String toString() {
        String s="";
        String letterStr="";
/*

 */
        for(int i = 7; i >= 0; i--) {
            s = s + (i + 1) + " ";
            for(int j = 0; j < 8; j++) {
                if (pieces[i][j] == null) {
                    letterStr = ".";
                } else {
                    switch(pieces[i][j].getTypeOfPiece()) {
                        case TOWER: letterStr = "t";
                            break;
                        case KNIGHT: letterStr = "k";
                            break;
                        case BISHOP: letterStr = "b";
                            break;
                        case QUEEN: letterStr = "q";
                            break;
                        case KING: letterStr = "x";
                            break;
                        case PAWN: letterStr = "p";
                            break;
                    }
                    if (pieces[i][j].getColor() == Color.BLACK) {
                        letterStr = letterStr.toUpperCase(); // poner las letras en mayusculas
                    }
                }
                s = s + letterStr + " ";
            }
            s = s + "\n";// \n salto en memoria
        }
        s = s + " ";
        for(int i = 0; i < 8; i++) {
            char c = (char)('A' + i);
            s = s + c + " ";
        }
        return s;
    }
}
