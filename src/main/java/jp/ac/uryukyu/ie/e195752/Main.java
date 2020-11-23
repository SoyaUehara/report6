package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by so-ya on 2020/1/15.
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
            System.out.println("＝＞");
            String input = scan.nextLine();
            switch (input){
                case "Damage_wall":
                    result = search.Searching(DW.getList(), result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Block":
                    result = search.Searching(Block.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Deceleration_Wall":
                    result = search.Searching(Deceleration.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Gravity_Barrier":
                    result = search.Searching(GB.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Magic_Circle":
                    result = search.Searching(Magic.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Mines":
                    result = search.Searching(Mines.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "Warp":
                    result = search.Searching(Wp.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "wind":
                    result = search.Searching(Wind.getList(),result);
                    for (String quest : result){
                        System.out.println(quest);
                    }
                    break;
                case "リセット":
                    System.out.println("リセットします。");
                    result.clear();
                    break;
                case "end.":
                    break;
                default:
                    System.out.println("もう一度、入力してください");
                    break;
            }
            if (input.equals("end.")){
                System.out.println("終了します");
                break;
            }
        }
    }
}
