import java.util.ArrayList;

public class arroperations {

   public static boolean serchele(ArrayList<Integer> arr, int x)
   {
       return arr.contains(x);
   }
   public static boolean insertele(ArrayList<Integer> arr,int y,int yi)
   {
       if(yi>=0 && yi<arr.size())
       {
           arr.add(yi,y);
           return true;
       }
       return false;
   }

   public static boolean delete(ArrayList<Integer> arr,int z)
   {
       return arr.remove((Integer) z);
   }
    public static void main(String args[])
    {
        int arrValues[] = {2, 4, 1, 0, 2}; // original array
        ArrayList<Integer> arr=new ArrayList<>();
        for(int val:arrValues)
        {
            arr.add(val);
        }
        int x=1,y=2,yi=2,z=0;

        System.out.println(serchele(arr,x)+" ");
        System.out.println(insertele(arr,y,yi)+" ");
        System.out.println(delete(arr,z));
    }
}
