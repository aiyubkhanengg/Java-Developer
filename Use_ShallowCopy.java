// This Is Shallow Copy Program in java
// This program coded by AIYUB KHAN GIT (aiyubkhanengg-Java-Developer)

//import java.util.* ;
import java.util.Arrays;
class ShallowCopy{
   private int[] Data;
   public ShallowCopy(int[] Vals){
      Data = Vals;
   }
   public void showData(){
      System.out.println(Arrays.toString(Data) );
   }
}
public class Use_ShallowCopy{
   public static void main(String[] args){
      int[] Vals = {10, 20, 25};
      ShallowCopy sc = new ShallowCopy(Vals);
      sc.showData();
      Vals[0] = 15;
      sc.showData();
   }
}