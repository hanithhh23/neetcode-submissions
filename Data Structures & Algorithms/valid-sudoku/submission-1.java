class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    for(int k=0;k<9;k++){
                        if(board[i][k]==board[i][j] && k!=j ){
                            return false;
                        }
                        if(board[k][j]==board[i][j] && k!=i ){
                            return false;
                        }
                    }

                    int row=(i/3)*3, col=(j/3)*3;

                    for(int a=row;a<row+3;a++){
                        for(int b=col;b<col+3;b++){
                            if(a==i && b==j){
                                continue;
                            }
                            else if(board[a][b]==board[i][j]){
                                return false;

                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}


