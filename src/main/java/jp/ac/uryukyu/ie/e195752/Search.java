package jp.ac.uryukyu.ie.e195752;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
public class Search {
    ArrayList<String> Data = new ArrayList<String>(){
        {
            add("ギミック名");
            add("Damage_wall");
            add("Block");
            add("Deceleration_Wall");
            add("Gravity_Barrier");
            add("Magic_Circle");
            add("Mines");
            add("Warp");
            add("wind");
        }
    };
    public Search(){
        System.out.print("[");
        for (int i=0; i<Data.size(); i++){
            System.out.print(Data.get(i));
            if (i<Data.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}
