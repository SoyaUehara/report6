package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
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
        Search search = new Search();
        ArrayList<String> result = new ArrayList<String>();
        while (true){
            System.out.println("ギミックを入力してください");
            String input = scan.nextLine();
            if (input.equals("Damage_wall")){
                search.Searching(DW.List, result);
                search.ResultPrint(result);
            }else if (input.equals("Block")){
                search.Searching(Block.List,result);
                search.ResultPrint(result);
            }else if (input.equals("Deceleration_Wall")){
                search.Searching(Deceleration.List,result);
                search.ResultPrint(result);
            }else if (input.equals("Gravity_Barrier")){
                search.Searching(GB.List,result);
                search.ResultPrint(result);
            }else if (input.equals("Magic_Circle")){
                search.Searching(Magic.List,result);
                search.ResultPrint(result);
            }else if (input.equals("Mines")){
                search.Searching(Mines.List,result);
                search.ResultPrint(result);
            }else if (input.equals("Warp")){
                search.Searching(Wp.List,result);
                search.ResultPrint(result);
            }else if (input.equals("wind")){
                search.Searching(Wind.List,result);
                search.ResultPrint(result);
            }else if (input.equals("end.")){
                System.out.println("終了します");
                break;
            }else {
                System.out.println("もう一度、入力して下さい");
            }
        }
    }
}
