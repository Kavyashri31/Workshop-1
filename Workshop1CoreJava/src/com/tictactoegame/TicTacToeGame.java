package com.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {

	static final String X = "X";
	static final String O = "O";

	public TicTacToeGame() {
		System.out.println("Game Begins");
	}

	public static void main(String[] args) {
		Character[] characters = new Character[10];
		for (int n = 1; n < 10; n++) {
			// charcter[n]= '';
		}

		String player, computer;

		String input = getUserInput();

		System.out.println(input);

		if (input.equalsIgnoreCase(X)) {
			player = X;
			computer = O;
		} else {
			player = O;
			computer = X;
		}

		System.out.println("Player chose: " + player);
		System.out.println("Computer is assigned: " + computer);

	}

	private static String getUserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter either X or O:");
		return scan.next();

	}
}
