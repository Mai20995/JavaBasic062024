package Bai3;

public class DemoIF {
    public static void main(String[] args) {
        int age =20;
        String address = "TPHCM";
        String header = "Login CMS";
        if ( (age>18 && address.equals("TPHCM"))){
            System.out.println("Đươc đi quân sự");
        }
        if ((header.contains("Login"))){
            System.out.println("Đến được trang login");
        }
    }
}
