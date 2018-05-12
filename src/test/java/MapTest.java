import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zipon on 2017/9/27.
 */
@Listeners({NewReport.class})
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
        Assert.assertEquals(1,2);
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


    }

}
