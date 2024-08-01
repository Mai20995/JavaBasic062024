package Bai3;

public class DemoSWITCHCASE {
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
        String brower = "chorme";
        switch (brower){
            case "chorme":
            System.out.println("chạy web vs chorme");
            case "edge":
                System.out.println("chạy web vs edge");
            case "firefox":
                System.out.println("chạy web vs firefox");
            default:
                System.out.println("Mặc định");
        }
    }
}
