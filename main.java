/**
 * Created by ouss on 28/10/16.
 */

public class main {
    public static void main(String[] args) {
        Joueur tab[] = new Joueur[3];
        for (int i = 0; i < 3; i++) {
            tab[i] = new Joueur(0);

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("le tour num " + (i + 1));
            for (int j = 0; j < 3; j++) {
                tab[j].scorjoueur();
                System.out.println("joueur " + (j + 1) + " a " + tab[j].getScore());
            }

        }

        if ((tab[0].getScore() == tab[1].getScore()) && (tab[1].getScore() == tab[2].getScore()))
            System.out.println("partie nul");


        if (tab[0].getScore() == tab[1].getScore()){
            if (tab[0].getScore() < tab[2].getScore())
                System.out.println("joueur3");

            else
                System.out.println("joueur1et2");}

else
            if (tab[0].getScore() == tab[2].getScore()){
                if (tab[1].getScore() < tab[2].getScore())
                    System.out.println("joueur1et3");


                else
                    System.out.println("joueur2");
        }
        else
        {
        if (tab[1].getScore() == tab[2].getScore())
            if (tab[1].getScore() < tab[0].getScore())
                System.out.println("joueur1");

            else
                System.out.println("joueur2et3");}


    }




}
