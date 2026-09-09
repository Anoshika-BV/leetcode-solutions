class Solution {
    public List<List<String>> solveNQueens(int n) {
        //test
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        solve(0, board, ans);
        return ans;
    }

    void solve(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (char[] r : board)
                list.add(new String(r));
            ans.add(list);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (safe(board, row, col)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }

    boolean safe(char[][] b, int r, int c) {
        for (int i = 0; i < r; i++)
            if (b[i][c] == 'Q') return false;

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
            if (b[i][j] == 'Q') return false;

        for (int i = r - 1, j = c + 1; i >= 0 && j < b.length; i--, j++)
            if (b[i][j] == 'Q') return false;

        return true;
    }
}