package com.company;

public class TokenPass {
    public TokenPass(int playerCount){
        int[]board = new int[playerCount];
        for (int i=0; i<board.length(); i++){
            board[i]=Math.random()*10;
        }
    }
    public distributeCurrentPlayerTokens(){}
}
