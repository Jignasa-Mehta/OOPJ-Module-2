import java.util.Scanner;
class Exercise{
  public static void main(String[] args)
    {
        System.out.println("Enter Year");
       Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        
       /* if (year%4==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("No Leap Year");
        } */
        int a =year%4;
        switch(a) {
        
            case 0:
                System.out.println("Leap Year");
                break;
            
            default:
                System.out.println("No Leap Year");
                break;
        }
        
    }
}