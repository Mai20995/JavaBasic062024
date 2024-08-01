package Bai5;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionArrayList {
    public static void main(String[] args) {
        // khai báo dữ liệu
        // đc phép lưu giá trị trùng lặp
        List<String> menu = new ArrayList<>();
// List là cha của arraylist ( arraylist là con , nên thương nta hay sử dung List, nên nta để thường List ở đầu
        /* ArrayList<String> menu2 = new ArrayList<String>();*/

        // thêm dữ liệu
        menu.add("Project");//0
        menu.add("Dashboard");//1
        menu.add("Customer");//2
        menu.add("Project");//3
        menu.add("Tasks");//4
        menu.add("Sale");//5
        // cập nhât dữ liệu thông qua vị trí của nó, pải thông qua 2 bước thì mới cập nhật đc
        // b1: Vì nó có chỉ mục nên  phải xóa tại chỉ mục,b2 rồi thêm gán giá trị tại chỉ mục đó// chon kiểu index
        menu.remove(4);
        menu.add(4, "Task123");
        menu.set(4,"123");// ak nãy thầy nhầm có thể dùng hàm set thì ko cần xóa và add
        // get giá trị theo chỉ mục
        System.out.println(menu.get(4));
        // ktra du liệu, sau này sẽ ktra
        System.out.println(menu.contains("Dashboard"));

        // Duyệt kiểu dữ liệu, dùng hàm get để truy xuất để lấy giá trị từng thằng
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }// dùng for thông thường
        System.out.println("------------");
        for ( String x : menu ){// dùng for cảu tiến
            System.out.println(x);
        }
        // Phải thêm j vào nữa để lấy đc giá trị từng thằng, nếu bỏ j thì nó sẽ in ra tất cả các dòng luôn ( ko tin thử là biết)
      /*  int j = 0;
        for (String value : menu) {
            System.out.println((menu.get(j)));
            j++;
        }
        System.out.println("=======");
        List<String> menu2 = new ArrayList<String>();
        menu2.addAll(menu); // thêm nguyên bộ data trong menu vào menu 2

        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }*/
    }
}
