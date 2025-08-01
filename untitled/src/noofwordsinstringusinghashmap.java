import java.util.HashMap;

public class noofwordsinstringusinghashmap {
    public static void main(String args[])
    {
        String str="i i am Vaishnavi Vaishnavi from this this";
        String token[]=str.split(" ");
       HashMap<String,Integer> we=new HashMap<>();
        for(int i=0;i<token.length;i++)
        {
            if(we.containsKey(token[i]))
            {
                int count=we.get(token[i]);
                we.put(token[i],count+1);
            }
            else {
                we.put(token[i],1);
            }
        }
        System.out.println(we);
    }
}

// Write a Java Program to count the number of words in a string using HashMap.
