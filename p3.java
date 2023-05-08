import java.util.Scanner;
public class P3 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principle:");
        float p= sc.nextFloat();

        System.out.println("enter the rate:");
        float r = sc.nextFloat();

        System.out.println("enter the time:");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("the principle is:"+ p);
        System.out.println("the rate is:"+ r);
        System.out.println("the time is:"+ t);

        System.out.println("the simple interest is:"+si);


        


        
    }
    
}
