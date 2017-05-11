package myproj.cav.prog.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import myproj.cav.prog.algorithams.sorter.NameComparator;
import myproj.cav.prog.algorithams.sorter.PlayerComparator;
import myproj.cav.prog.algorithams.sorter.ScoreComparator;
import myproj.cav.prog.models.Player;

public class ComparatorMain {

	public static void main(String[] args) {
	
		List <Player>list = new ArrayList<Player>();
		list.add(new Player("Tony",96));
		list.add(new Player("Paul",86));
		list.add(new Player("Andrew",89));
		list.add(new Player("Peter",89));
		list.add(new Player("Andrew",89));
		list.add(new Player("Paul",90));
		
		Player [] array = list.toArray(new Player[list.size()]);
		
		PlayerComparator playerComparator = new PlayerComparator(new NameComparator(), new ScoreComparator());
		Collections.sort(list, playerComparator);
		
		for(Player player : list){
			System.out.println(player.toString());
		}
		
		Arrays.sort(array, playerComparator);
		for(Player player : list){
			System.out.println(player.toString());
		}
		

	}

}
