import java.util.Arrays;

public class kadaneAlgo {
    static int find(int nums[])
    {
        int sum=0;
        int max=nums[0];

        for(int num:nums)
        {
            sum+=num;
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int nums[]={3,7,-2,-3,5,-5,8};
        int res=find(nums);
        System.out.println(res);
    }
}
