package Bai5;

public class XuLyChuoi {
    public static void main(String[] args) {
        String s1= "Lorem ipsum is placeholder text";
        String s2= "From its medieval origins to the digital era";
        String s3= " Test Auto ";

        // Cắt chuỗi, chuỗi bắt đầu từ 0, tính khoảng trắng là 1 kí tự
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(2,10));

        // Ghép chuỗi, nhanh nhất là dùng dấu +
        System.out.println(s1+ " " + s2 );

        // Chuyển kiểu in hoa thường
        System.out.println(s2.toLowerCase());// in thường
        System.out.println(s1.toUpperCase());// in hoa
        // Xóa kí tự khoảng trăắng 2 đầu( ko có xóa ở giữa, vì nó tính là kí tự
        System.out.println(s3.trim());

        // Độ dài chuỗi, nó đếm luôn cả khoảng trắng
        System.out.println(s1.length());

        // Tìm kiếm kí tự
        System.out.println(s1.charAt(10));
        // Tìm kếm vị trí của kí tự
        System.out.println(s1.indexOf("m"));


        // So sánh chuỗi có 2 hàm ( contains và equals)
        //+  ss bằng
        String s4 = "Test Auto";// vì ở trên chưa dùng hàm để trim khoảng trắng chỉ mới in ra thôi nên kqua là false
        System.out.println(s3.equals(s4));
        // ss chứa
        System.out.println(s4.contains("auto"));// chứng tỏ n phân biệt in hoa in thường
        // ss bỏ qua hoa thường dùng equalignore , còn contains không có
        String s5 = "test auto";
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
