package Bai4;

public class DemoMang1 {
    public static void main(String[] args) {
        //Khai bao mang rỗng , chưa mang giá trị
        int number1[] = new int[5];
        //Gán giá trị
        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;
        number1[4] = 50;
        System.out.println("Độ dài manng " + number1.length);
        System.out.println(number1[4]);

        //  For basic Duyệt mảng để lấy giá trị ra
        for (int i = 2; i < number1.length; i++)
            System.out.println(number1[i]);
        // For cải tiến
        System.out.println("====================");
        for (int number : number1){
            System.out.println(number);
        }
    }
}
//Note: For basic linh động hơn, mình có thể giới hạn được khoảng i. Còn For cải tiến mình phải duyệt từ đầu đến cuối
