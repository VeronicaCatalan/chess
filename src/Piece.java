enum TypeOfPiece {
    PAWN, TOWER, KNIGHT, BISHOP, QUEEN, KING
}
enum Color {
    BLACK, WHITE
}

public class Piece {
    //A   Tipo de pieza y el color
    private TypeOfPiece typeOfPiece;
    private Color color;

    //A    constrUctor
    public Piece(TypeOfPiece typeOfPiece, Color color) {
        this.typeOfPiece = typeOfPiece;
        this.color = color;
    }
    //A   recibe estos calores
    public TypeOfPiece getTypeOfPiece() {
        return typeOfPiece;
    }
    public Color getColor() {
        return color;
    }
//B    Crear metodo tostring
    public String toString() {
        String s = "";
        switch (color) {
            case BLACK:
                s = "BLACK ";
                break;
            case WHITE:
                s = "WHITE ";
                break;
        }
        switch (typeOfPiece) {
            case PAWN:
                s = s + "PAWN";
                break;
            case TOWER:
                s = s + "TOWER";
                break;
            case KNIGHT:
                s = s + "KNIGHT";
                break;
            case BISHOP:
                s = s + "BISHOP";
                break;
            case QUEEN:
                s = s + "QUEEN";
                break;
            case KING:
                s = s + "KING";
                break;
        }
        return s;
    }
}
