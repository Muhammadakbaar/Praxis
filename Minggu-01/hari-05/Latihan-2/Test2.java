import java.util.*;

class Test2
{
    public static void main(String [] args)
    {
        ArrayList al = new ArrayList();

        al.add ("Akbar");
        al.add ("Hakim");
        al.add (10);

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        String s3 = (String)al.get(2);
    }
}