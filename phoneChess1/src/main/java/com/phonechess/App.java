package com.phonechess;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in); 
        System.out.println("please Enter start number between 0-9 \n");
		String startNumber = sc.nextLine();
		System.out.println("please Enter chess Piece [queen, knight, king,rook, bishop,pawn] \n");
		String pieceName=sc.nextLine();
		PhoneChess chess = new PhoneChess();
		int result = chess.calculateNumberOfPossibleCombinations(startNumber, pieceName);
		System.out.println("possible Number is ::: "+result);
    }
}
