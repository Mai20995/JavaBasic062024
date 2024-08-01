package Bai4;

public class DemoMang2 {
    public static void main(String[] args) {
        //Khai báo và gán gái trị
        int number2[]= {5,7,10,20,30};
        number2[2]= 100;
        System.out.println("Kích cỡ mảng "+ number2.length);
        System.out.println(number2[4]);
        // chỉ mục thứ 4 tức là phần tử thứ 5
        for (int i : number2){
            System.out.println(i);
        }
        boolean check = true;
        String dataCustomer[] = {"Hoa","Hồng","Huệ"};
        System.out.println(dataCustomer[0]); //test lần 1
        System.out.println(dataCustomer[1]); //test lần 2
        System.out.println(dataCustomer[2]); //test lần 3
        for (int i =0; i<dataCustomer.length; i++) {
            if (dataCustomer[i].equals("Hoa")) {
                check = true;
                System.out.println("Tìm thấy");
                break;
            } else {
                check = false;
                System.out.println("Không tìm thấy");
                break;
            }
        }
            /*if (check==true){
                System.out.println("Tìm thấy");
            }else {
                System.out.println("Không tìm thấy");
            }*/
        }
    }

