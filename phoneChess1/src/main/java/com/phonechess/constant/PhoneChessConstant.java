package com.phonechess.constant;

import java.util.Arrays;
import java.util.List;

public class PhoneChessConstant {

	public static int[][] KINGHT_MOVES = new int[][] { { 4, 6 }, { 6, 8 }, { 7, 9 }, { 4, 8 }, { 3, 9, 0 }, {},
			{ 1, 7, 0 }, { 2, 6 }, { 1, 3 }, { 2, 4 } };

	public static int[][] KING_MOVES = { { 7, 8, 9 }, { 2, 6, 4 }, { 1, 3, 4, 5, 6 }, { 2, 5, 6 }, { 1, 2, 5, 8, 7 },
			{ 1, 2, 3, 4, 6, 7, 8, 9 }, { 9, 8, 5, 2, 3 }, { 4, 5, 8 }, { 7, 4, 5, 6, 9, 0 }, { 6, 5, 8, 0 } };

	public static int[][] QUEEN_MOVES = new int[][] { { 8, 5, 2, 7, 9 }, { 4, 7, 5, 3, 2, 9 }, { 1, 3, 4, 5, 6, 8, 0 },
			{ 1, 2, 6, 9, 5, 7 }, { 1, 7, 2, 8, 5, 6 }, { 1, 2, 3, 4, 6, 7, 8, 9, 0 }, { 2, 8, 4, 5, 3, 9 },
			{ 1, 4, 8, 9, 5, 3 }, { 7, 4, 9, 0, 5, 6, 2 }, { 1, 5, 7, 8, 6, 3 } };

	public static int[][] ROOK_MOVES = new int[][] { { 8, 5, 2 }, { 2, 3, 4, 7 }, { 5, 8, 0, 1, 3 }, { 1, 3, 6, 9 },
			{ 1, 7, 5, 6 }, { 0, 8, 2, 4, 6 }, { 4, 5, 3, 9 }, { 1, 4, 8, 9 }, { 5, 2, 0, 7, 9 }, { 3, 6, 7, 8 } };
	public static int[][] BISHOP_MOVES = new int[][] { { 7, 9 }, { 5, 9 }, { 6, 4 }, { 5, 7 }, { 2, 8 }, { 1, 3, 7, 9 },
			{ 8, 2 }, { 5, 3, 0 }, { 6, 4 }, { 0, 1, 5 } };
	public static int[][] PAWN_MOVES = new int[][] { { 8, 5 }, {}, {}, {}, {}, {}, { 1, 4 }, { 5, 2 }, { 6, 3 } };

	public static List<Integer> validStartNumbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 9);
	
	public static List<String> validString = Arrays.asList("queen", "knight", "king", "rook", "bishop","pawn");
}
