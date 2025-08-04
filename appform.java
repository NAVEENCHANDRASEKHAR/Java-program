public class appform {
    String name;
    int rollno;
    double mark;

    public void display()
     {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(mark);
    }

    public static void main(String[] args) {
        appform scan = new appform();
        scan.name = "naveen";
        scan.rollno = 23;         
        scan.mark = 567.4;       
        scan.display();
    }
}
