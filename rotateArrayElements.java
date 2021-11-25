/*Rotate elements in array list by a specified value
Ex
Input : arr(10, 20, 30, 40, 50,. 60) rotate by 2
Output : arr(50, 60, 10, 20, 30, 40)
*/
//This Program Coded By AIYUB KHAN GIT(aiyubkhanengg/Java-Developer)
//@uthor MOHD AIYUB KHAN.

class rotateArrayElements {  
    
    public static void main(String[] args) {  
      
        //Initialize array   
        int [] arr = new int [] {10, 20, 30, 40, 50,60};   
        //n determine the number of times an array should be rotated  
        int n = 4;  
          
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
          
        System.out.println();  
          
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  