public class String125
{
    public boolean isPalindrome(String s)
    {
        if (s.isEmpty() || s.equals(" ")) { return true; }

        char[] c = s.toCharArray();
        StringBuilder forward = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < c.length; i++)
        {
            if (Character.isLetterOrDigit(c[i]))
            {
                forward.append(Character.toLowerCase(c[i]));
            }
        }

        for (int i = c.length - 1; i >= 0; i--)
        {
            if (Character.isLetterOrDigit(c[i]))
            {
                reversed.append(Character.toLowerCase(c[i]));
            }
        }

        return forward.toString().equals(reversed.toString());
    }
}
