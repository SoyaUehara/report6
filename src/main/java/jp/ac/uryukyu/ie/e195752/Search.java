package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
public class Search {
    private ArrayList<String> Data = new ArrayList<>(){
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
     public ArrayList<String> Searching(ArrayList List, ArrayList result){
        int der = result.size();
        if (result.size()==0){
            result = List;
        }else{
            for (int i =0; i<List.size(); i++){
                if (result.contains(List.get(i))){
                    result.add(List.get(i));
                }
                else {
                }
            }
            for (int a=0; a<der; a++){
                result.remove(result.indexOf(result.get(0)));
            }
        }
        for (int i= 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        return result;
    }
}
