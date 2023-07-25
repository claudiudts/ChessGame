public class ChessBoard {
    private String[][] board;

    public ChessBoard() {
        board = new String[8][8];
        initializeBoard();
    }


    private void initializeBoard() {
        //first piece on the board
        //whitePieces
        board[0][0] = "wRook";
        board[0][1] = "wKnight";
        board[0][2] = "wBishop";
        board[0][3] = "wQueen";
        board[0][4] = "wKing";
        board[0][5] = "wBishop";
        board[0][6] = "wKnight";
        board[0][7] = "wRook";
        board[1][0] = "wPawn";
        board[1][1] = "wPawn";
        board[1][2] = "wPawn";
        board[1][3] = "wPawn";
        board[1][4] = "wPawn";
        board[1][5] = "wPawn";
        board[1][6] = "wPawn";
        board[1][7] = "wPawn";

        //BlackPieces
        board[7][0] = "wRook";
        board[7][1] = "wKnight";
        board[7][2] = "wBishop";
        board[7][3] = "wQueen";
        board[7][4] = "wKing";
        board[7][5] = "wBishop";
        board[7][6] = "wKnight";
        board[7][7] = "wRook";
        board[6][0] = "wPawn";
        board[6][1] = "wPawn";
        board[6][2] = "wPawn";
        board[6][3] = "wPawn";
        board[6][4] = "wPawn";
        board[6][5] = "wPawn";
        board[6][6] = "wPawn";
        board[6][7] = "wPawn";

        //setting some empty squares
        for (int row = 2; row < 6; row++) {
            for (int col = 0;col < 8; col++ ) {
                board[row][col] = "e";
            }
        }

        //checking the current state of the Board
    }

    public void printBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
