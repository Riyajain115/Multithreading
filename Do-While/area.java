import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Menu\n1-Area of Square\n2-Area of Circle\n3-Area of Rectangle\n4-Area of Trapezium\n5-Exit\nEnter your choice");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter side");
                int s=sc.nextInt();
                System.out.println("Area = "+(s*s));
                break;
                
                case 2:
                System.out.println("Enter Radius");
                double r=sc.nextInt();
                System.out.println("Area = "+(3.14*r*r));
                break;
                
                case 3:
                System.out.println("Enter length");
                int l=sc.nextInt();
                System.out.println("Enter breadth");
                int b=sc.nextInt();
                System.out.println("Area = "+(l*b));
                break;
                
                case 4:
                    System.out.println("Enter the base and top of Trapezium");
                    int b1=in.nextInt();
                    int b2=in.nextInt();
                    System.out.println("Enter the height of Trapezium");
                    int h=in.nextInt();
                    System.out.println("Area= "+((a+b)*h/2);
                break;
                                       case 5:
                                       break;
                default:
                System.out.println("Invalid Choice");                
            }
        }while(n==1||n==2||n==3);
    }
}
        
