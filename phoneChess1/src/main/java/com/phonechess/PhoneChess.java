package com.phonechess;

import com.phonechess.factory.PhoneChessFatory;
import com.phonechess.inter.PhoneDialer;
import com.phonechess.utils.PhoneChessUitls;

public class PhoneChess {

	private PhoneDialer  dialer;
	
	public int calculateNumberOfPossibleCombinations(String startNumber,String pieceName)
	{
		PhoneChessUitls.checkValidChessPiece(pieceName);
		PhoneChessUitls.checkValidStartNumber(startNumber);
		PhoneDialer phoneDialer = getdialer(pieceName);
		int result = phoneDialer.calculateNumberOfPossibleCombinations(Integer.parseInt(startNumber), PhoneChessUitls.getMoves(pieceName));
		return result;
	}
	
	private PhoneDialer getdialer(String pieceName)
	{
		dialer=PhoneChessFatory.getPiece(pieceName);
		return dialer;
	}
}
