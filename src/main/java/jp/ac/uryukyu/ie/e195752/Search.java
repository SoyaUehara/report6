package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;

/**
 * Searchクラス。
 * Gimmick_Data　//ギミックのリスト
 */
public class Search {
    private ArrayList<String> Gimmick_Data = new ArrayList<>(){
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

    /**
     *コンストラクタ。誰でも使用できるようにギミックの一覧を表示する。
     */
    public Search(){
        System.out.print("[");
        for (int i=0; i<Gimmick_Data.size(); i++){
            System.out.print(Gimmick_Data.get(i));
            if (i<Gimmick_Data.size()-1){
                System.out.print(":");
            }
        }
        System.out.println("]");
    }

    /**
     *
     * @param List　ギミックがあるクエスト一覧
     * @param result　検索結果の保存
     * @return 検索結果を返す
     */
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
