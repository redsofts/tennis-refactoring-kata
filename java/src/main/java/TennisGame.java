
public interface TennisGame {
    void wonPoint(String playerName);
    String getScore();

    static String getScoreOption1(int m_score1, int m_score2) {

        String score = "";
        //int tempScore = 0;

        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    score = ScoresEnum.LOVE_ALL.getScoreValue();
                    break;
                case 1:
                    score = ScoresEnum.FIFTEEN_ALL.getScoreValue();
                    break;
                case 2:
                    score = ScoresEnum.THIRTY_ALL.getScoreValue();
                    break;
                default:
                    score = ScoresEnum.DEUCE.getScoreValue();
                    break;
            }

        }
        return score;
    }
}