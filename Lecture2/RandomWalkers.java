public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);
        double total_steps = 0;
        double p;
        for (int i = 0; i <= trails; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                p = Math.random();
                if (p <= 0.25) {
                    x = x + 1;
                } else {
                    if (p <= 0.50) {
                        y = y + 1;
                    } else {
                        if (p <= 0.75) {
                            x = x - 1;
                        } else {
                            y = y - 1;
                        }
                    }
                }
                steps += 1;
            }
            total_steps += steps;
        }
        System.out.println("average number of steps = " + total_steps / trails);


    }
}
