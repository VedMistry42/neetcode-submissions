class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            Map<Character,Boolean> row = new HashMap<>();
            Map<Character,Boolean> col = new HashMap<>();
            for(int j=0;j<board[i].length;j++){
                char rowItem = board[i][j];
                char colItem = board[j][i];
                if(row.containsKey(rowItem) || col.containsKey(colItem)){
                    return false;
                }
                if(rowItem!='.'){
                    row.put(rowItem,true);
                }
                if(colItem!='.'){
                    col.put(colItem,true);
                }
            }
        }
        for(int i=0; i<board.length; i+=3){
            for(int j=0; j<board.length; j+=3){
                Map<Character, Boolean> grid = new HashMap<>();
                for(int k = i;k<i+3;k++){
                    for(int l = j;l<j+3;l++){
                        char gridItem = board[k][l];
                        if(grid.containsKey(gridItem)){
                            return false;
                        }
                        if(gridItem!='.'){
                            grid.put(gridItem,true);
                        }
                    }
                }
            }
        }
        return true;
    }
}
