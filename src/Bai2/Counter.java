package Bai2;

public class Counter {
    static int count = 0;

    public void DemSo() {
        /*static int count = 0;*/
        count++;
        System.out.println(count);

    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.DemSo();
        Counter c2 = new Counter();
        c2.DemSo();
        Counter c3 = new Counter();
        c3.DemSo();


    }

    public static class Student {
        /* int rollno;
         String name;*/
        static String college = "Bưu Chính Viễn Thông";


        public void Student1(int r, String n) {
            int rollno = r;
            String name = n;
            System.out.println(rollno + " - " + name + " - " + college);
        }


            /*void display() {
                System.out.println(rollno + " - " + name + " - " + college);*/


        public static void main(String args[]) {
            Student s1 = new Student();
            s1.Student1(100, "Thong");
            s1.Student1(200, "Mai");



               /* s1.display();
                s2.display();*/
        }
    }


}




