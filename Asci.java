import java.util.Scanner;
public class Asci{
public static void main(String[] args) {
    System.out.println("enter the  character  =");
 Scanner k=new Scanner(System.in);
 char m=k.next().charAt(0);
 int j=(int) m;
 System.out.println("theh ascii value of the number "+j+" is "+j);
    k.close();
}
}