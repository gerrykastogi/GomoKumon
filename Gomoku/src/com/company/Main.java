package com.company;

import Game.Game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int axis, ordinate, turn=0, numPlayer;
        boolean win = false;
        Scanner in = new Scanner(System.in);
        numPlayer = in.nextInt();
        Game playGame = new Game(numPlayer);
        while(!win){
            do{
                System.out.print("Masukkan koordinat : ");
                axis = in.nextInt();
                ordinate = in.nextInt();
            } while(!playGame.isValidMove(axis, ordinate));
            playGame.setPiece(axis, ordinate, turn);
            playGame.setPiece(axis, ordinate, turn);
            playGame.Board.printBoard();
            if(playGame.isHorizontal(axis, ordinate)){
                win = true;
            } else if(playGame.isVertical(axis, ordinate)){
                win = true;
            } else if(playGame.isDiagonalLeft(axis, ordinate)){
                win = true;
            } else if(playGame.isDiagonalRight(axis, ordinate)){
                win = true;
            }
            if(turn<numPlayer-1)
                turn++;
            else
                turn=0;
        }
        turn--;
        System.out.println("Player " + turn + " win");
    }
}