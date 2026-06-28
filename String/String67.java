import java.math.BigInteger;

public class String67
{
    public String addBinary(String a, String b)
    {
        BigInteger a1= new BigInteger(a,2);
        BigInteger b1= new BigInteger(b,2);
        return a1.add(b1).toString(2);
    }
}
