public class ShortRockPaperScissors {
  public static String rps(String p1, String p2) {
    if(p1 == p2) return "Draw!";
    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
    return "Player " + p + " won!";
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
