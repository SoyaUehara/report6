package jp.ac.uryukyu.ie.e195752;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Read {
    ArrayList<String> List = new ArrayList<String>();
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
