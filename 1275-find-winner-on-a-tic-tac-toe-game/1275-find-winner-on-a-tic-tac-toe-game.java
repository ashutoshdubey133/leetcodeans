class Solution {
    public String tictactoe(int[][] moves) {
        Integer[][]board = new Integer[3][3];
        
        for(int i=0;i<moves.length;i+=2){
            board[moves[i][0]][moves[i][1]] = 1;
        }
        
        for(int i=1;i<moves.length;i+=2){
            board[moves[i][0]][moves[i][1]] = 0;
        }
        
        for(int i=0;i<board.length;i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != null)
                if(board[i][0] == 1)
                    return "A";
                else
                    return "B";
        }
        
        for(int i=0;i<board[0].length;i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[2][i] != null)
                if(board[0][i] == 1)
                    return "A";
                else
                    return "B";
        }
        
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != null)
            if(board[0][0] == 1)
                return "A";
            else
                return "B";
        
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != null)
            if(board[0][2] == 1)
                return "A";
            else
                return "B";
        
        for(int i=0;i<board.length;i++){
            if(board[i][0] == null || board[i][1] == null || board[i][2] == null)
                return "Pending";
        }
        
        return "Draw";
        
        
    }
}