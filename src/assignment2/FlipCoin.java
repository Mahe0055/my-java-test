package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        int[] coin = {0, 1};
        int randomNumber = new Random().nextInt(coin.length);
        return randomNumber;
    }
}
