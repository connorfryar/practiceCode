import java.util.Map;

abstract class PlayersMove {
  protected String type;
  protected String beats;
  protected String losesTo;
  
  public String getType() {
    return type;
  }
  
  public String getsBeat() {
    return beats;
  }
  
  public String losesTo() {
    return losesTo;
  }
}

class Rock extends PlayersMove {
  public Rock() {
    this.type = "rock";
    this.beats = "scissors";
  }
}

class Paper extends PlayersMove {
  public Paper() {
    this.type = "paper";
    this.beats = "rock";
  }
}

class Scissors extends PlayersMove {
  public Scissors() {
    this.type = "scissors";
    this.beats = "paper";
  }
}

public class RockPaperScissors { // was kata in CW
  private static final Map<String, PlayersMove> moveMap = Map.of(
    "rock", new Rock(),
    "paper", new Paper(),
    "scissors", new Scissors()
  );
  
  public static String rps(String p1, String p2) {
    PlayersMove move1 = moveMap.get(p1.toLowerCase());
    PlayersMove move2 = moveMap.get(p2.toLowerCase());
    
    if (move1 == null || move2 == null) {
      throw new IllegalArgumentException("NOPE");
    }
    
    if (move1.getType().equals(move2.getType())) {
      return "Draw!";
    }
    
    if (move1.getsBeat().equals(move2.getType())) {
      return "Player 1 won!";
    } else {
      return "Player 2 won!";
    }

    }

    public static void main(String args[]){
    if (args.length !=2) {
        System.out.println("Usage: java RockPaperScissors <player1> <player2>");
        return;
    }

    String p1 = args[0];
    String p2 = args[1];

    try {
        String result = rps(p1, p2);
        System.out.println(result);
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid move. Use: rock, paper, or scissors.");
    }
    }
}


