public class Minesweeper {
    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int mPick = 0;
        int nPick = 0;
        int mineCount;
        char mineArr[][] = new char[m][n];
        int kCount = 0;
        while (kCount < k) {
            mPick = (int) (m * Math.random());
            nPick = (int) (n * Math.random());
            if (mineArr[mPick][nPick] != '*') {
                mineArr[mPick][nPick] = '*';
                kCount++;
            }
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mineArr[r][c] == '*') {
                    continue;
                }

                mineCount = 0;
                if (r < m - 1) {
                    if (mineArr[r + 1][c] == '*') {
                        mineCount++;
                    }
                    if (c < n - 1 && (mineArr[r + 1][c + 1] == '*')) {
                        mineCount++;
                    }
                    if (c > 0 && (mineArr[r + 1][c - 1] == '*')) {
                        mineCount++;
                    }
                }
                if (r > 0) {
                    if (mineArr[r - 1][c] == '*') {
                        mineCount++;
                    }
                    if (c < n - 1 && (mineArr[r - 1][c + 1] == '*')) {
                        mineCount++;
                    }
                    if (c > 0 && (mineArr[r - 1][c - 1] == '*')) {
                        mineCount++;
                    }
                }
                if (c < n - 1 && (mineArr[r][c + 1] == '*')) {
                    mineCount++;
                }
                if (c > 0 && (mineArr[r][c - 1] == '*')) {
                    mineCount++;
                }
                mineArr[r][c] = Integer.toString(mineCount).charAt(0);
            }
        }
        for (int rCount = 0; rCount < m; rCount++) {
            for (int cCount = 0; cCount < n; cCount++) {
                System.out.print(mineArr[rCount][cCount] + "  ");
            }
            System.out.println();
        }
    }
}
