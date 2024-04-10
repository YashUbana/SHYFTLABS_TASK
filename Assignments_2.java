package SHYFTLABS;

enum Color {
    WHITE,BLACK
}
enum PieceType{
    PAWN,
    ROOK,
    KNIGHT,
    BISHOP,
    QUEEN,
    KING
}


class Piece{
    private Color color;
    private PieceType type;
    private int x;
    private int y;

    public Piece(Color color, PieceType type, int x, int y){
        this.color = color;
        this.type = type;
        this.x = x;
        this.y = y;
    }
    public Color getColor() {   //This method will return the color of the piece for which x, y coordinate are given
        return color;
    }

    public PieceType getType() {    //This method will return the type of the piece for which x, y coordinate are given
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
class ChessBoard {
    private Piece[][] board;
    public ChessBoard() {

        board = new Piece[8][8];
        // Place white pieces
        placePiece(new Piece(Color.WHITE, PieceType.ROOK, 0, 0), 0, 0 );
        placePiece(new Piece(Color.WHITE, PieceType.KNIGHT, 0, 1 ), 0, 1);
        placePiece(new Piece(Color.WHITE, PieceType.BISHOP, 0, 2 ), 0, 2);
        placePiece(new Piece(Color.WHITE, PieceType.QUEEN, 0, 3), 0, 3 );
        placePiece(new Piece(Color.WHITE, PieceType.KING, 0,  4 ), 0, 4 );
        placePiece(new Piece(Color.WHITE, PieceType.BISHOP, 0,  5 ), 0,  5 );
        placePiece(new Piece(Color.WHITE, PieceType.KNIGHT, 0, 6 ), 0, 6 );
        placePiece(new Piece(Color.WHITE, PieceType.ROOK, 0,   7 ), 0, 7 );
        for (int i = 0; i < 8; i++) {
            placePiece(new Piece(Color.WHITE, PieceType.PAWN, 1, i), 1, i);
        }

        // Place black pieces
        placePiece(new Piece(Color.BLACK, PieceType.ROOK, 7, 0 ), 7, 0 );
        placePiece(new Piece(Color.BLACK, PieceType.KNIGHT, 7, 1), 7, 1) ;
        placePiece(new Piece(Color.BLACK, PieceType.BISHOP, 7, 2), 7, 2 );
        placePiece(new Piece(Color.BLACK, PieceType.QUEEN, 7, 3), 7, 3);
        placePiece(new Piece(Color.BLACK, PieceType.KING, 7, 4 ), 7, 4 );
        placePiece(new Piece(Color.BLACK, PieceType.BISHOP, 7, 5 ) , 7, 5);
        placePiece(new Piece(Color.BLACK, PieceType.KNIGHT, 7, 6) , 7, 6);
        placePiece(new Piece(Color.BLACK, PieceType.ROOK, 7, 7 ), 7, 7 );
        for (int i = 0; i < 8; i++) {
            placePiece(new Piece(Color.BLACK, PieceType.PAWN, 6, i), 6, i);
        }
    }
    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
    public void placePiece(Piece piece, int x, int y) {
        board[x][y] = piece;
    }
    public void movePiece(int curX, int curY, int newX, int newY) {
        Piece piece = board[curX][curY];
        board[curX][curY] = null;
        piece.move(newX, newY);
        board[newX][newY] = piece;
    }
}
public class Assignments_2 {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        Piece pawn = new Piece(Color.WHITE, PieceType.PAWN, 1,2); // Initialize of the piece which we can to move

        Piece x =  board.getPiece(2,3);     // Get the type of the piece on the current position

       try {
           System.out.println(pawn.getType());       //Prints the type of the piece
       }catch (NullPointerException e){
           System.out.println("No Piece is Present at the given Coordinates");
       }

        board.placePiece(pawn,1,3);

        board.movePiece(1,3,3,2);  //This will move the piece from current (curX, curY) coordinates of piece to (newX, newY) coordinates


    }
}
