public class Peak {

    private static int peak(int [] array, int first, int last){
        if(first==last){
            return array[0];
        }
        if(array[0]>array[1]){
            System.out.println("First element found ");
            return array[0];
        }
        if(array[last]>array[last-1]){
            System.out.println("Last element found ");
            return array[last-1];
        }
        return peakRec(array, first, last);
    }

    private static int peakRec(int [] array, int first, int last){
        System.out.println("Tunnel " + first + " <> "+last);
        int selected_position = first + (last-first)/2;
        System.out.println("Search position " + selected_position);
        if(array[selected_position]>=array[selected_position-1] && array[selected_position]>=array[selected_position+1]){
            System.out.println("Found position " + selected_position + ". Element is " + array[selected_position]);
            return array[selected_position];
        }

        if(array[selected_position-1]>array[selected_position]){
            System.out.println("Left is major");
            return peakRec(array, first, selected_position);
        }else{
            System.out.println("Right is major");
            return peakRec(array, selected_position, last);
        }
    }

    public static void main(String[] args)    {
        System.out.println("Init Peak");

        int [] array =  { 9, 10, 11, 12, 15, 14, 12 }; 
        peak(array, 0, 6);

        System.out.println("End");
    }
}
