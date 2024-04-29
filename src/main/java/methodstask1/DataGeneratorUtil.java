package methodstask1;

import java.util.Random;

public class DataGeneratorUtil {

    public static int generateRandomInt(int limit){

        Random random = new Random();
        return random.nextInt(limit);

    }

    public static int generateRandomInt(int min, int max) {
        return generateRandomInt(min, max);

    }else {
        return 0;
    }
}
