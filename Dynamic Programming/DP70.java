public class DP70
{
    public int climbStairs(int n)
    {
        if (n <= 2)
        {
            return n;
        }
        int step1 =1;
        int step2 =2;
        for (int i=1; i<=n;i++)
        {
            int s = step1 + step2;
            step2 = step1;
            step1 = s;
        }
        return step1;
    }
}
