package Bai2;

public class BCalculator {
    double s ;
    public void tong2SoNguyen(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
        s = number1 + number2;

    }

    public static double tich2SoThuc(double a, double b) {
         double tich = (a * b);
        System.out.println(tich);
        return b;
    }

    public static void main(String[] args) {
        BCalculator ca = new BCalculator();
        ca.tong2SoNguyen(5,4);
       tich2SoThuc(4.1,4.2);

    }

        }




