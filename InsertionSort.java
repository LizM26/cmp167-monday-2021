
public class InsertionSort {
	  public static void insertionSort(int [] array) {
	      int i;
	      int a;
	      int temp;      

	      for (i = 1; i < array.length; ++i) {
	         a = i;
	         while (a > 0 && array[a] < array[a - 1]) {
	            temp = array[a];
	            array[a] = array[a - 1];
	            array[a - 1] = temp;
	            --a;
	         }
	      }
	   }
	  
	  public static void main(String[] args) {
		  int [] nums = {20, 37, 31, 22, 3, 6, 90, 85};
		  int i;
		  
		  //array before insertion sort
		  for (i = 0; i < nums.length; ++i) {
			  System.out.print(nums[i] + " "); 
		      }
		  
		  System.out.println();

		  insertionSort(nums);
		  
		  //array after insertion sort
		  for (i = 0; i < nums.length; ++i) {
			  System.out.print(nums[i] + " ");
		  }

	  }

}
