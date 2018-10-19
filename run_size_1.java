import java.util.HashMap; 
import java.util.Map; 

public class run_size_1
{
	public static void main(String[] args) 
	{
		HashMap <Integer, Integer> runs = new HashMap<>(); //creating a hashmap that will store the starting and ending indices of each "run"
                int[] arr = {1, 2, 2, 4, 6, 8, 5, 6, 7, 8, 6, 7, 8, 9, 11, 3, 4, 5, 6, 7, 8};
		int n = arr.length;
		int startIndex = 0;
		int endIndex = 0;
                int len = 1; 
                int run_size = 4;

                for (int i = 0; i<arr.length-1; i++)
                {

        	       if (arr[i+1] > arr[i] || arr[i+1] == arr[i])
        	        {
        		      len++;
        		      endIndex++;
                        }
        	
        	       else
        	       {
                                if (len >= run_size)
                		{
                		      System.out.println(startIndex + " " + endIndex);
                                      runs.put(startIndex, endIndex);
                		} 
                		
                                len = 1;
                		startIndex = endIndex+1;
                		endIndex = startIndex;
        	       }
                }
        
        if (len >= run_size)
        {
        	System.out.println(startIndex + " " + endIndex);
                runs.put(startIndex, endIndex);
        }

        System.out.println(runs);


        int startIndex1 = 0;
        int endIndex1 = 0;
        int len1 = 1;
        for (int x = 0; x < arr.length; x++) //iterate through the array and sort every section other than the runs       
        {
                if (runs.containsKey(x)) //if the index maps to a value, its a run
                {
                        //do insertion sort for startindex1 - endindex1
                        //update your startindex1 and endindex1 to x
                        insertionSort(startIndex, endIndex);

                        runs.put(startIndex, endIndex); //

                        startIndex1 = endIndex1+1;
                        endIndex1= startIndex1;


                }

                else
                {
                        len++;
                        endIndex1++;

                }


        }
       
}

        public class insertionSort
        {

        }
}

