
public enum ScoresEnum {
    LOVE_ALL("Love-All"), FIFTEEN_ALL("Fifteen-All"), C("C"), DEUCE("Deuce"),
    ADVANTAGE_PLAYER1("Advantage player1"), ADVANTAGE_PLAYER2("Advantage player2"), WIN_FOR_PLAYER1("Win for player1"), WIN_FOR_PLAYER2("Win for player2"),
    LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty"), THIRTY_ALL("Thirty-All");

    private final String score;

    ScoresEnum(String score) {
        this.score = score;
    }

    String getScoreValue(){
      return score;
    }
}
