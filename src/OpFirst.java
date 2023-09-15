import java.util.Random;

public class OpFirst {
    String name = "Fighter - 1";
    int health = 100;
    int strength = 100;
    boolean state = true;

    public int setHit() {
        Random random = new Random();
        return random.nextInt(strength) + 1;
    }

    public void getHit(int hit) {
        health -= hit;
        if (health <= 0) {
            state = false;
        }
    }
}
