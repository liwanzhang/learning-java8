package zwl.learning.java8.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-18 下午9:08
 */
public class ListDemo {

    public void list() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        for (String item:arrayList){
            System.out.println(item);
        }

        arrayList.forEach(item->System.out.println(item));

        arrayList.forEach(System.out::println);

        arrayList.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        arrayList.stream()
                .filter(s-> s.contains("B")||s.contains("C"))
                .forEach(System.out::println);

        arrayList.stream()
                .filter(s->s.contains("E"))
                .findFirst().ifPresent(s -> System.out.println(s));
    }
}
