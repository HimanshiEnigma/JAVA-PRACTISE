import java.util.ArrayList;
import java.util.Collections;

public class untitled11 {
  public static void swap(ArrayList<Integer>List,int idx1,int idx2){
      int temp=List.get(idx1);
      List.set(idx1,List.get(idx2));
      List.set(idx2,temp);
  }
  public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<> ();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        int idx=1,idx2=3;
      System.out.println(List);

     Collections.sort(List,Collections.reverseOrder());
      System.out.println(List);

    }
}
