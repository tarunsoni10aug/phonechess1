package com.phonechess.utils;
import java.util.HashMap;
import java.util.Map;

import com.phonechess.constant.PhoneChessConstant;
import com.phonechess.inter.PhoneDialer;
import com.phonechess.service.BishopDialerService;
import com.phonechess.service.KingDialerService;
import com.phonechess.service.KnightDialerService;
import com.phonechess.service.PawnDialerService;
import com.phonechess.service.QueenDialerService;
import com.phonechess.service.RookDialerService;

public class PhoneChessUitls {
	public static void checkValidStartNumber(String startNumber) {
		if (!startNumber.matches("[0-9]") && startNumber.isEmpty()
				&& PhoneChessConstant.validStartNumbers.contains(Integer.parseInt(startNumber.trim()))) {
			throw new IllegalArgumentException("please insert valid Number between 0-9 ");
		}
	}

	public static void checkValidChessPiece(String pieceName) {
		if (!PhoneChessConstant.validString.contains(pieceName.toLowerCase())) {
			throw new IllegalArgumentException(
					"Invalid chess piece please select one of the pice [queen, knight, king,rook, bishop,pawn] ");
		}
	}
	public static int [][] getMoves(String moves)
	{
		Map<String, int [][]>map = new HashMap<String, int [][]>();
		map.put("knight", PhoneChessConstant.KINGHT_MOVES);
		map.put("king",  PhoneChessConstant.KING_MOVES);
		map.put("queen",  PhoneChessConstant.QUEEN_MOVES);
		map.put("pawn",  PhoneChessConstant.PAWN_MOVES);
		map.put("rook",  PhoneChessConstant.ROOK_MOVES);
		map.put("bishop", PhoneChessConstant.BISHOP_MOVES);
		return map.get(moves.toLowerCase());
	}
}
