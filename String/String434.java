public class String434
{
    public int countSegments(String s)
    {
        if (s.equals(" ") || s.isEmpty()){return  0;}
        String[] string = s.trim().split("\\s+");
        return string.length;
    }
}
