/**
 * Created by ouss on 28/10/16.
 */
public class Joueur {
    De de=new De();

    private int score;

    public Joueur(int score) {

        this.score = score;

    }



    public int getScore() {
        return score;
    }



    public void setScore(int score) {
        this.score = score;
    }
    public void scorjoueur(){
        setScore(score+de.lance());

    }
}
