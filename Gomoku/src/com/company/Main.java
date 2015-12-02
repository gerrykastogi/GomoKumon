package com.company;

import Game.Game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int axis, ordinate, turn=0, numPlayer, playerWin=-99;
        Scanner in = new Scanner(System.in);
        numPlayer = in.nextInt();
        Game playGame = new Game(numPlayer);
        while(playerWin==-99){
            do{
                System.out.print("Masukkan koordinat : ");
                axis = in.nextInt();
                ordinate = in.nextInt();
            } while(!playGame.isValidMove(axis, ordinate));
            playerWin = playGame.setPiece(axis, ordinate, turn);
            playGame.Board.printBoard();
            if(turn<numPlayer-1)
                turn++;
            else
                turn=0;
        }
        System.out.println("Player "+ playerWin + " win the game");
    }
}