class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result=new ArrayList<>();
        int sr=0,sc=0,er=matrix.length-1,ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                result.add(matrix[sr][j]);
            }
            for(int i=sr+1;i<=er;i++){
                result.add(matrix[i][ec]);
            }
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                result.add(matrix[er][j]);
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                result.add(matrix[i][sc]);
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        return result;
    }
}