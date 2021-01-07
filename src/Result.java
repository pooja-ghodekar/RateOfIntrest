import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        CalculateIntrest c=new CalculateIntrest();
        Scanner in=new Scanner(System.in);
        int choice;
            do {

                System.out.println("1.principle"+ c.getP());
                System.out.println("2.Rate of interes");
                System.out.println("3.Time period");
                System.out.println("4.Calculate intrest");
                System.out.println("5. defoult");
                System.out.println("enter choice");
                choice =in.nextInt();
                    switch(choice)
                    {
                        case 1:System.out.println("Enter Principal Amoun");
                            c.setP(in.nextFloat());

                            break;
                        case 2:System.out.println("enter Rate of interes");
                            c.setR(in.nextFloat());
                            break;
                        case 3:
                            System.out.printf("Enter the Time period ");
                            c.setT(in.nextFloat());
                            break;
                        case 4: c.setSinterest((c.getP() * c.getR() * c.getT()) / 100);
                            System.out.println("result:"+c.getSinterest());

                            break;
                        case 5:
                            System.exit(1);
                            /*default:
                        System.out.println("no choice");*/




                    }


            }while(choice<=5);






    }


}
