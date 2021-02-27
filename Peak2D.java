public class Peak2D {

    private static int maxElementAtColumn(int [][] array, int rows, int columns , int selected_column ){
        int max = -1;
        int max_index=-1;
        for (int i = 0; i < rows; i++) {
            if(array[i][selected_column]>max){
                max = array[i][selected_column];
                max_index=i;
            }
        }
        return max_index;
    }

    private static int findPeak(int [][] array, int rows, int columns , int selected_column ){
        System.out.println("Selected column " + selected_column);
        int max_index=maxElementAtColumn(array, rows, columns, selected_column);
        System.out.println("Current Max element index " + max_index + " value " + array[max_index][selected_column]);
        if(selected_column==0 || selected_column==columns-1){
            return array[max_index][selected_column];
        }
        int max =  array[max_index][selected_column];
        
        if(max >= array[max_index][selected_column-1] && max >= array[max_index][selected_column+1]){
            System.out.println("Max element find " + max);
            return max;
        }

        if( array[max_index][selected_column-1] > max){
            int new_selected_column = (int)(selected_column - Math.ceil((double)selected_column/2));
            System.out.println("Left is major");
            return findPeak(array, rows, columns, new_selected_column);
        }else{
            System.out.println("Right is major");
            int new_selected_column = (int)(selected_column + Math.ceil((double)selected_column/2));
            return findPeak(array, rows, columns, new_selected_column);
        }
    }

    public static void main(String[] args) {
        System.out.println("Init");

        int [][] array =  { { 10, 24, 10, 10 }, 
                            { 14, 13, 12, 11 }, 
                            { 15, 9, 11, 21 }, 
                            { 16, 22, 19, 20 } }; 

        int rows = 4, columns = 4; 

        findPeak(array, rows, columns, columns/2);

        System.out.println("End");
    }
}