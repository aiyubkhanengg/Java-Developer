//JAVA PROGRAM TO DISPLAY THE TRANSPOSE OF A INPUT GIVEN MATRIX
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor MOHD AIYUB KHAN
import java.util.Scanner;

public class transposeOfInputMatrix
{
     public static void main(String []args)
     {
         ///Take Matrix input from the user
         Scanner sc=new Scanner(System.in);

         //Matrix Size Declaration
         int m,n;                 
         
         System.out.println("Enter the number of rows:");
	//Matrix Size Initialization
         m=sc.nextInt();  
         
         System.out.println("Enter the number of column:");
	//Matrix Size Initialization
         n=sc.nextInt(); 
 
         //Matrix Size Declaration
         int arr[][]=new int[10][10];        
         System.out.println("Enter the elements of the matrix: ");

	//Matrix Initialization
         for(int i=0;i<m;i++)    
         {
            for(int j=0;j<n;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
         }
         
         //Print the original Matrix
         System.out.println("The elements in the original matrix are: ");

	//Print the matrix
         for(int i=0;i<m;i++)     
         {
             for(int j=0;j<n;j++)
             {
                  System.out.print(arr[i][j]+" ");
             }

	    //For new line
            System.out.println("");
        }
        //Transpose Matrix Declaration
        int brr[][]=new int[10][10];

	//Transpose Matrix initialization        
        for(int i=0;i<m;i++)     
        {
	//Store elements in the transpose matrix
             for(int j=0;j<n;j++)
             {
                 brr[j][i]=arr[i][j];     
             }
        }

        //Print the transpose matrix
        System.out.println("After transposing the elements are...");
        for(int i=0;i<m;i++)      
        {
             for(int j=0;j<n;j++)
             {
                 System.out.print(brr[i][j]+" ");
             }
            System.out.println("");
        }
         
     }
}
