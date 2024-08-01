package Bai2;

public class BSinhVien {
    double s1;
    static double s2;
    String tenLop = "12A";
    String tensv1 = "Nguyễn Mai";
    static String address = "Số 1 Đại Cồ Việt";

    public void sinhVien1() {
        int maSinhVien1 = 100;
        s1 = maSinhVien1;
        System.out.println(maSinhVien1);
        System.out.println(this.tensv1 + " " + maSinhVien1 + " " + this.tenLop);
    }

    public static void sinhVien2(String tenTruong) {
       /* double diem = 12;*/
        String name1 = "An";

        System.out.println(tenTruong);
    }
    public  static void Mai(){
        double a = 2;
        double b = 3;
        s2 = a+b; // s2 là biến static thì mới tham chiếu đc trong hàm static này
        System.out.println(s2);
    }

    public static void main(String[] args) {
        BSinhVien sv1 = new BSinhVien();
      /*  sv1.sinhVien1();
        System.out.println(sv1.s1);*/
        // nếu muốn lấy giá trị s1( s1 là biến toàn cục nên mới lấy đc) trong hàm sinhVien1 thì ta phải khai báo tendoituong chấm gọi tên hàm chứa s1
        //sau đó mơ lấy tên đối tượng chấm gọi tên biến s1

        // thì mới thực thi được công thức s1 trong hàm sinhVien1,
        // Còn Cac biến a,b,name1 vì là biến cục bộ nên ko thể gọi ở ham main đc
        /*System.out.println(sv1.s1);*/// Còn Nếu ko chấm gọi tên hàm thì s1 sẽ được lấy ở trên cùng
        sinhVien2("Đại Học Văn Lang");
        System.out.println(address);
        BSinhVien.Mai();
        Mai();



    }
}

