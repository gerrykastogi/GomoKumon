package Game;

import Player.Player;
import java.util.*;

/**
 * Created by Gerry on 11/28/2015.
 */
public class Game {
    //attribute
    public Board Board;
    private int numPlayer;
    public Player[] arrOfPlayer;

    // ctor
    public Game(int _numPlayer){
        Board = new Board();
        numPlayer = _numPlayer;
        arrOfPlayer = new Player[numPlayer];
    }

    // method
    public void setNumPLayer(int _numPlayer){
        numPlayer = _numPlayer;
    }

    public int getNumPlayer(){
        return numPlayer;
    }

    public boolean isValidMove(int x, int y){
        boolean success = false;
        if((x<0||x>19) || (y<0||y>19)){
            return success;
        } else{
            if(Board.gameBoard[x][y] == -1){
                success = true;
                return success;
            } else{
                return success;
            }
        }
    }

    public void setPiece(int axis, int ordinate, int piece){
            Board.gameBoard[axis][ordinate] = piece;
    }

    public boolean isHorizontal(int row, int column){
        boolean same=true, horizontal=true;
        int count=1, tempRow=row, tempColumn=column;
        while(!same){
            if(column!=19){
                if (Board.gameBoard[row][column] == Board.gameBoard[row][column + 1]) {
                    column++;
                    count++;
                    tempColumn++;
                } else {
                    same=false;
                }
            } else{
                same=false;
            }
        }
        same=true;
        if (count >= 5) {
            return horizontal;
        } else {
            count = 1;
            while(same) {
                if(tempColumn!=0){
                    if (Board.gameBoard[tempRow][tempColumn] == Board.gameBoard[tempRow][tempColumn - 1]) {
                        tempColumn--;
                        count++;
                    } else {
                        same = false;
                    }
                } else{
                    same=false;
                }

            }
        }
        if (count>=5)
            horizontal = true;
        else
            horizontal = false;
        return horizontal;
    }

    public boolean isVertical(int row, int column){
        boolean same=true, vertical=true;
        int count=1, tempRow=row, tempColumn=column;
        while(!same){
            if(row!=19){
                if (Board.gameBoard[row][column] == Board.gameBoard[row+1][column]) {
                    row++;
                    count++;
                    tempRow++;
                } else {
                    same = false;
                }
            } else{
                same=false;
            }

        }
        same = true;
        if (count>=5){
            return vertical;
        } else{
            count = 1;
            while(same){
                if(tempRow!=0){
                    if (Board.gameBoard[tempRow][tempColumn] == Board.gameBoard[tempRow-1][tempColumn]) {
                        tempRow--;
                        count++;
                    } else{
                        same=false;
                    }
                } else{
                    same=false;
                }
            }
        }
        if(count>=5)
            vertical = true;
        else
            vertical = false;

        return vertical;
    }

    public boolean isDiagonalLeft(int row, int column){
        boolean same=true, diagonalLeft=true;
        int count=1, tempRow=row, tempColumn=column;
        while(!same){
            if(row!=19 && column!=0){
                if (Board.gameBoard[row][column] == Board.gameBoard[row+1][column-1]) {
                    row++;
                    column--;
                    count++;
                    tempRow++;
                    tempColumn--;
                } else {
                    same = false;
                }
            } else{
                same = false;
            }
        }
        same = true;
        if (count>=5){
            return diagonalLeft;
        } else{
            count = 1;
            while(same){
                if(tempRow!=0 && tempColumn!=19){
                    if (Board.gameBoard[tempRow][tempColumn] == Board.gameBoard[tempRow-1][tempColumn+1]) {
                        tempRow--;
                        tempColumn++;
                        count++;
                    } else{
                        same=false;
                    }
                } else{
                    same = false;
                }
            }
        }
        if(count>=5)
            diagonalLeft = true;
        else
            diagonalLeft = false;

        return diagonalLeft;
    }

    public boolean isDiagonalRight(int row, int column) {
        boolean same=true, diagonalRight=true;
        int count=1, tempRow=row, tempColumn=column;
        while(!same){
            if(row!=19 && column!=19){
                if (Board.gameBoard[row][column] == Board.gameBoard[row+1][column+1]) {
                    row++;
                    column++;
                    count++;
                    tempRow++;
                    tempColumn++;
                } else {
                    same = false;
                }
            } else{
                same=false;
            }
        }
        same = true;
        if (count>=5){
            return diagonalRight;
        } else{
            count = 1;
            while(same){
                if(tempRow!=0 && tempColumn!=0){
                    if (Board.gameBoard[tempRow][tempColumn] == Board.gameBoard[tempRow-1][tempColumn-1]) {
                        tempRow--;
                        tempColumn--;
                        count++;
                    } else{
                        same=false;
                    }
                } else{
                    same = false;
                }
            }
        }
        if(count>=5)
            diagonalRight = true;
        else
            diagonalRight = false;

        return diagonalRight;
    }

    public boolean isFull(Board B){
        boolean full = true;
        for(int i=0; i<B.getDimension(); i++){
            for(int j=0; j<B.getDimension(); j++){
                if(B.gameBoard[i][j] == -1)
                    full = false;
            }
        }
        return full;
    }
}
