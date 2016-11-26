package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import board.Board;
import general.Colour;
import player.Player;

public class KnightTest {

	@Test
	public void test() {
		Player p1 = new Player(Colour.WHITE);
		Player p2 = new Player(Colour.BLACK);
		Board b = new Board(p1, p2);
		b.test_knight(p1);
		b.read_pieces();
		System.out.println("koniec");
	}
}