//I
public class Game {
  //I  que incluirá un tablero y una variedad de movimientos.
    private Board board;
    private Movement[] movements;
    private int numMovements;

   //I  Crear constructor
    public Game() {
        board = new Board();
        movements = new Movement[1000];
        for (int i = 0; i < movements.length; i++) {
            movements[i] = null;
        }
        numMovements = 0;
    }
//J   que recibe un movimiento, lo almacena en el arreglo y modifica el Tablero en consecuencia.
    public void movePiece(Movement movement) {
        movements[numMovements] = movement;
        numMovements++;
        board.movePiece(movement);
    }

}
