public class Birthday {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);
        int[] results = new int[days];
        for (int t = 0; t < trails; t++) {
            boolean[] duplicate_bday = new boolean[days];
            for (int i = 0; i < days; i++) {
                int bday = (int) (days * Math.random());
                if (duplicate_bday[bday]) {
                    results[i]++;
                    break;
                } else {
                    duplicate_bday[bday] = true;
                }
            }
        }
        double frac = 0.0;
        for (int i = 0; i < results.length; i++) {
            frac += ((double) results[i]) / trails;
            if (frac < 0.5) {
                System.out.println(i + 1 + "\t" + results[i] + "\t" + frac);
            } else {
                break;
            }

        }


    }
}
