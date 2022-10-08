package Arrays;

import java.util.HashMap;

public class TaregtSum {
    public static void main(String[] args) {
        String s="my name is bhsuhanbbbbbbbbb";
        HashMap<Character,Integer> map=new HashMap<>();
        String[] a = s.split(" ");
        for (int i=0;i<a.length;i++){
            char[] z=a[i].toCharArray();
            for(char q: z){
                if(map.containsKey(q)){
                    map.put(q,map.get(q)+1);
                }
                else{
                    map.put(q,1);
                }
            }
        }
        System.out.println(map);}
}