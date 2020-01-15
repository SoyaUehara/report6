package jp.ac.uryukyu.ie.e195752;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Readクラス。ここでFileを読み込む。
 * ArrayList<String> List; //クエストの一覧
 */
public class Read {
    private ArrayList<String> List = new ArrayList<>();

    /**
     * ArrayList<String> Listのゲッターメソッド
     * @return　対応したListを返す
     */
    public ArrayList getList(){
        return this.List;
    }

    /**
     * コンストラクタ。Fileを読み込む。
     * @param gimmick　ギミック名
     */
    public Read(String gimmick){
        try {
            File file = new File("/Users/e195752/IdeaProjects/report6/"+gimmick+".txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()){
                String str = scan.next();
                this.List.add(str);
            }
        }catch(FileNotFoundException e){
            System.out.println("ファイルがありません");
        }
    }
}
