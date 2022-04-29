import java.util.HashMap;

public class romanToInt {
    public int romanToInt(String s) {

        HashMap<String, Integer> roman = new HashMap<String, Integer>();

        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        // dummy variable to store value of Roman integers as we iterate backwards
        int dumRes = roman.get(s.charAt(s.length()-1));

        for(int i = s.length()-1; i>=0; i--)    {
            /*
                e.g.
                XII
                since X >= I, we add I to X [10+1]
            */
            if(roman.get(s.charAt(i)) >= roman.get(s.charAt(i+1)))    {
                dumRes = dumRes + roman.get(s.charAt(i));
            }
            else{
                dumRes = dumRes - roman.get(s.charAt(i));
            }
        }
        return dumRes;
    }
}
