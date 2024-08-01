package Bai1;

public class Bien {

    String address = "Can Tho";

    public void sayHello() {
        int n = 10;                 // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        Bien a1= new Bien();
        a1.sayHello();
        int a = 10;
        System.out.println(a);
    }

    public static class DeMoToanTu {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c= 5;
            double d,e,f;
            d=e=f=1000;

            System.out.println("a / b =" + (a==b));
            System.out.println("a % b =" + (a!=b));
            System.out.println(a++);
            System.out.println(a);
            System.out.println(a+=5);

    //        System.out.println(a+b-c);
    //        System.out.println(a+b*c/5);

            // Toán tử so sánh
            System.out.println("sao sánh a>b: "+ (a>b));
            System.out.println((a>b) && (b> c) );
            System.out.println((a>b) || (b> c) );
            System.out.println(((a<b) && (b>c)) || ((a<b) && (a<c)));



        }
    }
}
