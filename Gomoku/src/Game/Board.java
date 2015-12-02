package Game;

/**
 * Created by Gerry on 11/28/2015.
 */
public class Board {
    //attribute
    protected int[][] gameBoard;
    private static int dimension = 20;

    // ctor
    public Board(){
        gameBoard = new int[dimension][dimension];
        for(int i=0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                gameBoard[i][j] = -1;
            }
        }
    }

    // method
    public int getDimension(){
        return dimension;
    }

    public void printBoard(){
        for(int i=0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
