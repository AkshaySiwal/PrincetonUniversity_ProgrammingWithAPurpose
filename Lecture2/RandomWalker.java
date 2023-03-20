public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double p;
        int steps = 0;
        System.out.println("(" + x + "," + y + ")");
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
            System.out.println("(" + x + "," + y + ")");
            steps += 1;
        }
        System.out.println("steps = " + steps);

    }
}
