
public class SelectionSort {

	public static int[] sort(int[] keys) {
		
		if(keys.length<=1) {
			return keys;
		}
		
		for(int i = 0; i < keys.length; i++) {
			int min = keys[i];
			int imin = i;
			for(int j = i + 1; j < keys.length; j++) {
				if(keys[j]<min) {
					min = keys[j];
					imin = j;
				}				
			}	
			if(keys[i] > min) {
				keys[imin] = keys[i];
				keys[i] = min;
			}								
		}
		return keys;		
	}
	
	public static void show(int[] keys) {
                 for(int i = 0; i < keys.length; i++) {
                         System.out.println(keys[i]);
                 }
        }

	public static void main(String[] args){
		int[] keys = {8, 4, 2, 9, 5, 0, 1, 3};
		int[] result = SelectionSort.sort(keys);
		SelectionSort.show(result);
	}
	
}
