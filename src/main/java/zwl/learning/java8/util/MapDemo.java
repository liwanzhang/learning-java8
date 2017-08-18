package zwl.learning.java8.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-18 下午9:08
 */
public class MapDemo {

    public void map() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("key:" + entry.getKey() + ";value:" + entry.getValue());
        }
//output
//        A---10
//        B---20
//        C---30
//        D---40
//        E---50
//        F---60
        items.forEach((k,v)->System.out.println("key : " + k + "; value : " + v));

//output
//        key : A value : 10
//        key : B value : 20
//        key : C value : 30
//        key : D value : 40
//        key : E value : 50
//        key : F value : 60

        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });

//        key : A; value : 10
//        key : B; value : 20
//        key : C; value : 30
//        key : D; value : 40
//        key : E; value : 50
//        Hello E
    }



}
