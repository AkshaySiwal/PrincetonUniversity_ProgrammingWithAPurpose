public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] seq = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            seq[i] = seq[i - 1] + Integer.parseInt(args[i]);
        }
        int sum = seq[args.length - 1];
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * sum);
            for (int j = 1; j < seq.length; j++) {
                if (r >= seq[j - 1] && r < seq[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
        System.out.println("");
    }
}
