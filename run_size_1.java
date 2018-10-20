import java.util.HashMap; 
import java.util.Map; 

public class run_size_1
{
	public static void main(String[] args) 
	
        {
		
                HashMap <Integer, Integer> runs = new HashMap<>(); //creating a hashmap that will store the starting and ending indices of each "run"
                int[] arr = {1, 2, 5, 7, 5, 4, 3, 2, 4, 6, 8};
		        //int n = arr.length;
		        int startIndex = 0;
		        int endIndex = 0;
                int len = 1; 
                int run_size = 4;

                //print original array
                // for (int r = 0; r < arr.length; r++)
                // {
                //         System.out.print(arr[r] + ", ");
                // }
                
                // System.out.println();

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
                		      //System.out.println(startIndex + " " + endIndex);
                            runs.put(startIndex, endIndex);
                		} 
                		
                        len = 1;
                		startIndex = endIndex+1;
                		endIndex = startIndex;
        	       }
                }
        
        if (len >= run_size)
        {
        	//System.out.println(startIndex + " " + endIndex);
                runs.put(startIndex, endIndex);
        }


        //System.out.println(runs);

        int startIndex1 = 0;
        int endIndex1 = 0;
        int len1 = 1;

        for (int r = 0; r < arr.length; r++)
        {
            System.out.print(arr[r] + ", ");
        }
                
        System.out.println();

        for (int i = 0; i<arr.length-1; i++)
        {
                if (!runs.containsKey(i)) //if the 
                {
                    //System.out.println(endIndex1);
                    endIndex1++; //
                }
                
                else if (runs.containsKey(i) && startIndex1 !=0 && endIndex1 != 0)
                {
                    System.out.println(startIndex1 + " " + endIndex1);
                    insertionSort(startIndex1, endIndex1, arr);
                        
                    runs.put(startIndex1, endIndex1);
                        
                    startIndex1 = runs.get(i) + 1;
                    endIndex1 = startIndex1 + 1;
                }
       
        }
        
        System.out.println(runs);

        //insertionSort(0, 5, arr);
        // for (int s = 0; s < arr.length; s++)
        // {
        //         System.out.print(arr[s] + ", ");
        // }

        //System.out.println();
       
    }

        public static void insertionSort(int startIndex, int endIndex, int [] arr) //insertion sort is considered half more efficient that bubble sort or selection sort
        {
                int n = endIndex-startIndex;
                int i = startIndex; 
                
                for (i = startIndex; i<=n; ++i) 
                { 
                    int key = arr[i]; 
                    int j = i-1; 
  
                    while (j>=startIndex && arr[j] > key) 
                    {    
                        arr[j+1] = arr[j]; 
                        j = j-1; 
                    } 
                    
                    arr[j+1] = key; 
                } 
        }

        //after insertion sort is performed on the everything (other than the runs), we perform merge sort on all the
        //subarrays.....create and array of arrays? store everything in a 2D array?...then perform merge sort on the array 
        //of arrays? 

        public void merge(int[][] a, int k) //manipulate the merge algorithm so that it takes in 'k' subarrays
        {
            int topIndex = 0;
            int botIndex = 0;
            int aIndex = 0;

            while(topIndex<top.length && botIndex<bot.length) 
            {
                //If the top array's element is smaller
                if(top[topIndex] <= bot[botIndex]) 
                {
                    a[aIndex++] = top[topIndex++];
                //If the bottom array's element is smaller
                }
                else 
                {
                    a[aIndex++] = bot[botIndex++];
                }
            }

            //If the bottom array is out of elements
            while(topIndex<top.length) 
            {
                a[aIndex++] = top[topIndex++];
            }

            //If the top array is out of elements
            while(botIndex < bot.length) 
            {
                a[aIndex++] = bot[botIndex++];
            }

    }

