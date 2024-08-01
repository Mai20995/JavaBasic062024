package Bai5;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        // thêm dữ liệu dùng hàm put, còn set thì dùng add
        map1.put("A", "B"); // lưu theo dạng ( key:value)
        map1.put("C", "D");
        // cập nhật value trên key
        map1.put("A", "X");
        map2.put(1, 111D);
        map2.put(2, 222D);
        System.out.println("Map 1" + map1);
        System.out.println("Map 2" + map2);
        System.out.println(map1.containsKey("A"));
        System.out.println(map1.containsValue("B"));
        /*map1.remove("C");*/

        // duyệt kiểudữ liệu map
        //Get hêt gái trị của key và value
        // vì nó là dạng key value nên khi khi khai báo và in r phải gồm c key và value
        // khi in map napf thfi phải lấy đúng định dạng của map đó
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
