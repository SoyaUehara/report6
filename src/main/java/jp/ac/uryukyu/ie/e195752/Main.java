package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by soya on 2020/1/15.
 */
public class Main {
    public static void main(String[] args){
        Read DW = new Read("Damage_wall");
        Read Block = new Read("Block");
        Read Deceleration = new Read("Deceleration_Wall");
        Read GB = new Read("Gravity_Barrier");
        Read Magic = new Read("Magic_Circle");
        Read Mines = new Read("Mines");
        Read Wp = new Read("Warp");
        Read Wind = new Read("wind");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while (true){
            Search search = new Search();
            System.out.println("上のギミック一覧の中から入力してください");
            String input = scan.nextLine();
            if (input.equals("Damage_wall")){
                result = search.Searching(DW.getList(), result);
            }else if (input.equals("Block")){
                result = search.Searching(Block.getList(),result);
            }else if (input.equals("Deceleration_Wall")){
                result = search.Searching(Deceleration.getList(),result);
            }else if (input.equals("Gravity_Barrier")){
                result = search.Searching(GB.getList(),result);
            }else if (input.equals("Magic_Circle")){
                result = search.Searching(Magic.getList(),result);
            }else if (input.equals("Mines")){
                result = search.Searching(Mines.getList(),result);
            }else if (input.equals("Warp")){
                result = search.Searching(Wp.getList(),result);
            }else if (input.equals("wind")){
                result = search.Searching(Wind.getList(),result);
            }else if (input.equals("end.")){
                System.out.println("終了します");
                break;
            }else if (input.equals("リセット")){
                System.out.println("リセットします。");
                result.clear();
            } else {
                System.out.println("もう一度、入力して下さい");
            }
        }
    }
}
