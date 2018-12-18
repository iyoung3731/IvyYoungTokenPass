package com.company;

public class TokenPassRunner {

    public static void main(String[] args) {
	// write your code here
        TokenPass testGame = new TokenPass(10);
        int [] testBoard = testGame.getBoard();
        System.out.println("Created a testBoard:");
        for(int i=0; i< testBoard.length; i++){
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing the tokens from player " +testGame.getCurrentPlayer()+": ");
        for(int i =0;i<testBoard.length; i++){
            System.out.print(testBoard[i]+" ");
        }
    }
}
