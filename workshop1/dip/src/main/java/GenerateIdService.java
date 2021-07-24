import java.util.Random;

public class GenerateIdService {
    private Random random;
    public String getId() {
        Random random = new Random();
        int number = random.nextInt(10);
        return  "XYZ" + number;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}