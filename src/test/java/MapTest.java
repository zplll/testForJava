import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zipon on 2017/9/27.
 */
public class MapTest {

    @Test
    public void mapTest(){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("yanzhong1","suoyoumeng");
        hashMap.put("yanzhong2","suoyoumeng");

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());
        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()+"_________"+entry.getValue());
        }
    }
    @Test
    public void listStreamTest(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("wo");
        list.add("hui");
        list.add("nu");
        list.add("li");
        list.add("de");

        System.out.println(list);

        List list1=list.stream().map(n->n+"adc").collect(Collectors.toList());
        List list2=list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(list1);
        list2.stream().collect(Collectors.toList());
        System.out.println("list2==="+list2);
    }

}
