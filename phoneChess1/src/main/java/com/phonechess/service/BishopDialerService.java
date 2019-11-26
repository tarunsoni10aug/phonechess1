package com.phonechess.service;

import java.util.Arrays;

import com.phonechess.inter.PhoneDialer;

public class BishopDialerService implements PhoneDialer {

	public int calculateNumberOfPossibleCombinations(int startNumber, int[][] moves) {
		int[][] result = new int[2][10];
		int old = 0;
		int now = 0;
		Arrays.fill(result[now], 1);

		for (int i = 0; i < startNumber; ++i) {
			old = now;
			now = 1 - now;
			Arrays.fill(result[now], 0);
			for (int j = 0; j <= 9; ++j) {
				for (int k : moves[j]) {
					result[now][k] = (result[now][k] + result[old][j]);
				}
			}
		}
		int sum = 0;
		for (int i = 0; i <= 9; ++i) {
			sum = (sum + result[now][i]);
		}
		
		return sum;
	}

}
