
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

    static String getScoreOption2(int m_score1, int m_score2){
        String score = "";
        if (m_score1>=4 || m_score2>=4){
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score =ScoresEnum.ADVANTAGE_PLAYER1.getScoreValue();
            else if (minusResult ==-1) score =ScoresEnum.ADVANTAGE_PLAYER2.getScoreValue();
            else if (minusResult>=2) score = ScoresEnum.WIN_FOR_PLAYER1.getScoreValue();
            else score =ScoresEnum.WIN_FOR_PLAYER2.getScoreValue();
        }

        return score;
    }

    static String getScoreOption3(int m_score1, int m_score2){
        String score = "";
        int tempScore = 0;
        //int i=1;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score+="-"; tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score+=ScoresEnum.LOVE.getScoreValue();
                    break;
                case 1:
                    score+=ScoresEnum.FIFTEEN.getScoreValue();
                    break;
                case 2:
                    score+=ScoresEnum.THIRTY.getScoreValue();
                    break;
                case 3:
                    score+=ScoresEnum.FORTY.getScoreValue();
                    break;
            }
        }

        return score;
    }
}