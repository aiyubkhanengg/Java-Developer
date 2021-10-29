// This Is Deep Copy Program in java
// This program coded by AIYUB KHAN GIT (aiyubkhanengg-Java-Developer)
//import java.util.*;
import java.util.Arrays;
class DeepCopy{
   private int[] Data;
   public DeepCopy(int[] Vals){
      Data = new int[Vals.length];
      for (int i = 0; i < Data.length; i++){
         Data[i] = Vals[i];
      }
   }
   public void showData(){
      System.out.println(Arrays.toString(Data));
   }
}
public class Use_DeepCopy{
   public static void main(String[] args){
      int[] Vals = {30, 40, 45};
      DeepCopy dc = new DeepCopy(Vals);
      dc.showData();
      Vals[0] = 35;
      dc.showData();
   }
}