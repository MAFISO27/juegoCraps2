package juegoCraps;

import java.util.Random;

/**
 * This class generates a Random value between (1, 6)
 * @author Miguel Angel Figueroa Solarte - miguel.figueroa@correounivalle.edu.co
 * @version @version v.1.0.0 date:7/12/2021
 */
public class Dado {
    private int cara;

    /**
     * This Method generates a Random value to cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
