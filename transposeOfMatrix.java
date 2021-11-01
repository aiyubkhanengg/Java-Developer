//Java Program to Find the Transpose Matrix
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor MOHD AIYUB KHAN

public class transposeOfMatrix {

public static void main(String args[]){  
//creating a matrix  
int matrix[][]={{3,6,9},{4,8,6},{6,8,10}};    
  
System.out.println(" Without Transpose Matrix:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(matrix[i][j]+" ");    
}
//for new line
System.out.println();    
}    
System.out.println("After Transpose Matrix :");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(matrix[j][i]+" ");    
}  
//for new line   
System.out.println();   
}    
}
}  
