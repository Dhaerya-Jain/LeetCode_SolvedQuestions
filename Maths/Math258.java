public class Math258
{
    public int addDigits(int num)
    {
        int sum = 0;
        if (Integer.toString(num).length() == 1){return num;}
        int temp = num;
        while (temp!=0)
        {
            sum += temp%10;
            temp/=10;
        }
        if (Integer.toString(sum).length() > 1){return addDigits(sum);}
        else {return sum;}
    }
}
