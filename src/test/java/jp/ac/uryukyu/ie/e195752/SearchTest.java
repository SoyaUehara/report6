package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void searching() {
        Search search = new Search();
        ArrayList<String> test_list1 = new ArrayList<>();
        ArrayList<String> test_list2 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<10; i++){
            test_list1.add(String.valueOf(i));
        }
        for (int j=2; j<5; j++){
            test_list2.add(String.valueOf(j));
        }
        System.out.println("テスト・パート１");
        result = search.Searching(test_list1,result);
        System.out.println("テスト・パート２");
        result = search.Searching(test_list2, result);
    }
}