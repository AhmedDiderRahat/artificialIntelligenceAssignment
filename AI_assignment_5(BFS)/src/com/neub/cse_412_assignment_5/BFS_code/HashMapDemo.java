
package com.neub.cse_412_assignment_5.BFS_code;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HP-Stream
 */

public class HashMapDemo 
{
    public static void main(String args[])
    {
        /*
        HashMap<String, Double> hm = new HashMap<String, Double>();
        
        hm.put("Rahat", new Double(3.14));
        hm.put("Ahmed", new Double(3.1416));
        hm.put("Dider", new Double(3.141528));
        
        Set<Map.Entry<String,Double>> set = hm.entrySet();
        
        for(Map.Entry<String, Double> me : set)
        {
            System.out.println(me.getKey() + " " + me.getValue());
        }
        
        */
        HashMap<String, Boolean> hm1 = new HashMap<String, Boolean>();
        
        hm1.put("Rahat", false);
        hm1.put("Ahmed", false);
        hm1.put("Dider", false);
        hm1.put("Ahmed", false);
        hm1.put("Ahmed", false);
        hm1.put("Dider", false);
        hm1.put("Ahmed", false);
        hm1.put("Rahim", false);

        
        
        Set<Map.Entry<String,Boolean>> set = hm1.entrySet();
        
        for(Map.Entry<String, Boolean> me : set)
        {
            if(me.getValue() == false)
                System.out.println(me.getKey() + " " + me.getValue());
            hm1.put(me.getKey(), true);
        }
        
        
        
        //hm.put
    }
    
}
