package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[0][j] == 1 || board[i][0] == 1) {
                    rsl = board[i][j] == 1;
                }
            }
        }
        return rsl;
    }
}
