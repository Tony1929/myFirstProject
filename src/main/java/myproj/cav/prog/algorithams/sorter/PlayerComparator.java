package myproj.cav.prog.algorithams.sorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import myproj.cav.prog.models.Player;

public class PlayerComparator implements Comparator<Player>{
	
	List <Comparator<Player>>compartorList;

	public PlayerComparator() {
		super();
	}

	public PlayerComparator(Comparator<Player>... comparators) {
		super();
		this.compartorList = Arrays.asList(comparators);
	}

	@Override
	public int compare(Player player1, Player player2) {
		for(Comparator <Player> comparator : compartorList){
			int result = comparator.compare(player1, player2);
			if (result != 0) {
                return result;
            }

		}
		return 0;
	}

}
