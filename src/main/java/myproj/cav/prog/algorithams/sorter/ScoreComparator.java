package myproj.cav.prog.algorithams.sorter;

import java.util.Comparator;

import myproj.cav.prog.models.Player;

public class ScoreComparator implements Comparator<Player>{

	@Override
	public int compare(Player player1, Player player2) {
		return player2.getScore().compareTo(player1.getScore());
	}
}
