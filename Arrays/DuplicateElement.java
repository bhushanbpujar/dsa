package Arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement
{
    public static void main(String[] args) {
        int[] input={3,3,4,9,1,9,8};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(m.containsKey(input[i])){
                m.put(input[i],m.get(input[i])+1);
            }
            else{
                m.put(input[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }
    }
}
