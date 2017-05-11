package myproj.cav.prog.models;

public class Player {
	
	String name;
	Integer score;
	
	public Player() {
		super();
	}

	public Player(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public Integer getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}
}
