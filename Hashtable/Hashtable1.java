package Hashtable;

import java.util.*;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<>();
        table.put(101, "Rajan");
        table.put(205, "Mikasa");
        table.put(1254, "Rakash");
        table.put(4321, "Raksha");
        table.put(346, "LalBahadur");


        for(Integer key: table.keySet()){
            System.out.println(key.hashCode()%10+"\t"+key+"\t"+table.get(key));
        }


        table.remove(346);
        boolean check;
      check=  table.contains("LalBahadur");
        if(check!=false){
            System.out.println("Data is there "+table.get(346));
        }else{
            System.out.println("Data is not there");
        }
        System.out.println(table);
    }
}
