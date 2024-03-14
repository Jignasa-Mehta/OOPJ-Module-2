import java.util.Scanner;
class Exercise{
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("Enter one operator (+, -, *, /):");
        char c=sc.next().charAt(0);

        int result=0;
        
        switch(c) {
        
            case '+':
                result=a+b;
                System.out.println(result);
                break;
            
            case '-':
                result=a-b;
                System.out.println(result);
                break;
    
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            
            case '/':
                result=a/b;
                System.out.println(result);
                break;
        }
    }
}
    

