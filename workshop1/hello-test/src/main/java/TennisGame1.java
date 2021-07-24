import java.util.concurrent.atomic.AtomicReference;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name = "";
    private String player2Name = "";
    private String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            m_score1 ++;
        else
            m_score2 ++;
    }

    public String getScore() {

        if (CheckScoreLessThanEqTwo()) return scoreResults[m_score1] + "-" + "All";
        if (CheckScoreMoreThanTwo()) return "Deuce";
        if (CheckScoreMoreThanFour()) return GetScoreMoreThanFour();
        return scoreResults[m_score1] + "-" + scoreResults[m_score2];
    }

    private String GetScoreMoreThanFour() {
        AtomicReference<String> score = new AtomicReference<>("");
        int minusResult = m_score1-m_score2;
        if (minusResult == 1) score.set("Advantage " + player1Name);
        else if (minusResult ==-1) score.set("Advantage " + player2Name);
        else if (minusResult>=2) score.set("Win for " + player1Name);
        else score.set("Win for " + player2Name);
        return score.toString();
    }

    private boolean CheckScoreMoreThanFour() {
        if (m_score1>=4 || m_score2>=4){
            return true;
        }
        return false;
    }

    private boolean CheckScoreMoreThanTwo() {
        if(m_score1 > 2 && m_score2 > 2 && m_score1 == m_score2){
            return true;
        }
        return false;
    }

    private boolean CheckScoreLessThanEqTwo() {
        if(m_score1 <= 2 && m_score2 <= 2 && m_score1 == m_score2){
            return true;
        }
        return false;
    }
}