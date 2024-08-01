package Bai3;

public class DemoFORCAITEN {
    public static void main(String[] args) {
        //Khai bao mảng gán giá trị
        int arr[] = { 12, 23, 44, 56, 78 };
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("=======");
        for ( int i =1; i <5; i++){
            System.out.println(arr[i]);
        }
        System.out.println("=======");
        String menu[] = {"Dashoard", "Project", "Task"};
        for (String menuName : menu) {
            System.out.println(menuName);
        }
    }

}
