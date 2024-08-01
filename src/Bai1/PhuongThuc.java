package Bai1;

public class PhuongThuc {

     public  double sum;
     public  double res;

    // hàm không trả về kết quả
    public void cong2so(){
        int a =5;
        int b = 10;
        sum = a+b;
        System.out.println(sum);

    }

    public  void loginCRM(){
        System.out.println("naviga to url");
        System.out.println("enter email and password");
        System.out.println("click login button");
        System.out.println("very login success");
    }
    // hàm có trả về kết quả
    public double nhan2So(){
        int a=5;
        int b=10;
        res = a*b;
       return res;
    }

    public  void  cong2So(int number1, int number2){
        System.out.println(number1+number2);
    }
    public  long nhan3So (int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2So();
        System.out.println(phuongThuc.nhan2So()+10);
        phuongThuc.loginCRM();
        phuongThuc.cong2So(20,50);
       /* System.out.println(phuongThuc.nhan3So(2,5,10));*/




    }
}
