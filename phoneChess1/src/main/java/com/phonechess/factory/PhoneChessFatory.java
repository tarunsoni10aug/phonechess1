package com.phonechess.factory;

import java.util.HashMap;
import java.util.Map;

import com.phonechess.inter.PhoneDialer;
import com.phonechess.service.BishopDialerService;
import com.phonechess.service.KingDialerService;
import com.phonechess.service.KnightDialerService;
import com.phonechess.service.PawnDialerService;
import com.phonechess.service.QueenDialerService;
import com.phonechess.service.RookDialerService;



public class PhoneChessFatory {
	public static PhoneDialer getPiece(String piece) {
		Map<String, PhoneDialer>map = new HashMap<String, PhoneDialer>();
		map.put("knight", new KnightDialerService());
		map.put("king", new KingDialerService());
		map.put("queen", new QueenDialerService());
		map.put("pawn", new PawnDialerService());
		map.put("rook", new RookDialerService());
		map.put("bishop", new BishopDialerService());
		return map.get(piece.toLowerCase());
	}
	
}
