//I    instancia Game, realizar los movimientos llamando al método del punto j)moverPieza para configurar el
// tablero como la imagen e imprimir el juego.
public class Main {
    public static void main(String[] argv) {
        Game game = new Game();// nuevo juego

        game.movePiece(new Movement(new Piece(TypeOfPiece.PAWN,
                Color.WHITE), 'D', 2, 'D', 3));
        game.movePiece(new Movement(new Piece(TypeOfPiece.PAWN,
                Color.BLACK), 'E', 7, 'E', 5));
        game.movePiece(new Movement(new Piece(TypeOfPiece.PAWN,
                Color.WHITE), 'E', 2, 'E', 4));
        game.movePiece(new Movement(new Piece(TypeOfPiece.BISHOP,
                Color.BLACK), 'F', 8, 'B', 4));

        System.out.println(game);
    }
}
