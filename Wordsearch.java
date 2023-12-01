class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(find(board,word,i,j,0)) // check for every char
                    return true;
            }
        }
        return false;
    }
    private boolean find(char[][] board, String word, int i, int j, int index) {
        if(index==word.length()) // word found
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)) //outofbounds and char not matching exception
            return false;
        char temp=board[i][j];
        board[i][j]=' ';

        //check in all 4 directions
        boolean found = find(board,word,i+1,j,index+1) ||
                        find(board,word,i,j+1,index+1) ||
                        find(board,word,i-1,j,index+1) ||
                        find(board,word,i,j-1,index+1);

        board[i][j]=temp;
        return found;
    }
}
