// Kept values in 1st row and 1st column as 1. Then added each n-1 row and n-1 column to the current column. In the end returned the last column which returns all the ways
class Solution {
    public int uniquePaths(int m, int n) {

        int[][] ways = new int[m][n];

        for (int i = 0; i < m; i++) {
            ways[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            ways[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ways[i][j] = ways[i - 1][j] + ways[i][j - 1];
            }
        }

        return ways[m - 1][n - 1];
    }
}