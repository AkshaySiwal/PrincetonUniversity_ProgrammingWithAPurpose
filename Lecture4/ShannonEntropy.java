public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[m];
        int count = 0;
        double proportion;
        double entropy = 0.0;
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            arr[i - 1] += 1;
            count += 1;
        }
        for (int i = 0; i < m; i++) {
            if (arr[i] == 0) continue;
            proportion = ((double) arr[i]) / count;
            entropy -= (proportion * (Math.log(proportion) / Math.log(2)));
        }
        StdOut.printf("%.4f\n", entropy);
    }
}
