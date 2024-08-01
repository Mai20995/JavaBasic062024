package MyHome;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        //Bài tập x,y
        /*Scanner sc = new Scanner(System.in);
        System.out.println( "Mời bạn nhập tổng");
        double tong = sc.nextDouble();
        System.out.println("Mời bạn nhập hiệu");
        double hieu = sc.nextDouble();
 double x = (tong+hieu)/2;
 double y = (tong-x);
        System.out.println("x là: " +x);
        System.out.println("y là: " +y);*/

        // Bài tập BMI
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều cao");
        double chieucao = sc.nextDouble();
        System.out.println("Mời bạn nhập cân nặng");
        double cannang = sc.nextDouble();
        double BMI = cannang / (Math.pow(chieucao,2));
        if (BMI < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Thân hình béo");
        } else if (BMI >= 35) {
            System.out.println("Thân hình quá béo");
        }
    }*/
        // Bài tập năm nhuận
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm");
        double nam = sc.nextDouble();
        if (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Không phải năm nhuận");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int thang = sc.nextInt();
        if ( thang==1 ||thang==3 ||thang==5 ||thang==7 ||thang==8 || thang==10 ||thang==12 )
        {
            System.out.println("Tháng có 31 ngày");
        }
        else if (thang==4 ||thang==6 ||thang==9 ||thang==7 ||thang==11)
        {
            System.out.println("Tháng có 30 ngày");
        }
        else  if ( thang== 2)
        {
            System.out.println("Mời bạn nhập năm");
            double nam = sc.nextDouble();
            if (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)) {
                System.out.println("Tháng có 29 ngày");
            } else {
                System.out.println("Tháng có 31 ngày");
            }
        }



    }
}

