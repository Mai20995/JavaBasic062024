package Bai4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Tasks");
        menu.add("Sale");
        System.out.println(menu.contains("Tasks"));// true
        System.out.println(menu.remove("Sale"));
        System.out.println(menu.size());
        System.out.println("Các phần từ của Set ");
        // Lấy cả cục giá trị
        System.out.println("\t" + menu + "\n");

        // \t là tương đương với 4 dấu cách. \n là ký hệu dòng mới
// Show set through Iterator ( Truy xuâất đc ừng giá trị trong menu)
        /*Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }*/
        // Show set through for-each
        System.out.println("\n============");
        for (String obj : menu) { //dung for cải tiến
            System.out.println(obj);
           /* for ( int y = 0; y < menu.size(); y++ ){
                System.out.println(menu.get[y]);

            }*/ // dùng for thông thường này ko đc, đây là kiểu đặc biệt

// có thể dung 1 trong 2 cách ( interator or forr để duyệt )

        }
    }
}
