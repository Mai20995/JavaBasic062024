import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Mời nhập vào dtb: ");
        Scanner sc = new Scanner(System.in);
        double dtb = sc.nextDouble();
        // kiểm tra điều kiện
        if (dtb<=10 && dtb>=8)
        {
            System.out.println("Bạn xl giỏi");
        }
            else if ( dtb <8 && dtb >= 6.5)
        {
            System.out.println("Bạn xl khá");
        }
            else if (dtb < 6.5 && dtb >= 5)
        {
            System.out.println("Bạn xl TB");
        }
            else
        {
            System.out.println("Bạn xl yếu");
        }
    }

}
