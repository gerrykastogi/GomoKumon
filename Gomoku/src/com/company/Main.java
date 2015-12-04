package com.company;

import Game.Game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int axis, ordinate, playerID, numPlayer, playerWin=0;
        Scanner in = new Scanner(System.in);
        numPlayer = in.nextInt();
        Game playGame = new Game(numPlayer);
        while(playerWin==0 && !playGame.isFull()){
            do{
                System.out.print("Masukkan player ID anda : ");
                playerID = in.nextInt();
                System.out.print("Masukkan koordinat : ");
                axis = in.nextInt();
                ordinate = in.nextInt();
            } while(!playGame.isValidMove(axis, ordinate));
            playerWin = playGame.setPiece(axis, ordinate, playerID);
            playGame.Board.printBoard();
        }
        System.out.println("Player "+ playerWin + " win the game");
    }
}