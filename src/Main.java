import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----------------");
        boolean answer=shouldWakeUp (true, 1);
        System.out.println(answer);
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println("-----------------");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println("-----------------");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println("-----------------");


        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("enter width of rectangle");
            double x = scanner.nextDouble();
            System.out.println("enter high of rectangle");
            double y=scanner.nextDouble();
            System.out.println("area =" + area(x,y));


        } catch (Exception ex){
            System.out.println("invalid input");

        }

        //ya da

        boolean isValid = true;
        while (isValid) {
            try{
                System.out.println("enter width of rectangle");
                double x = scanner.nextDouble();
                System.out.println("enter high of rectangle");
                double y=scanner.nextDouble();
                System.out.println("area =" + area(x,y));


            } catch (Exception ex){
                isValid=false;
                System.out.println("invalid input");

            }
            break;
        }

        Scanner scanner1 = new Scanner(System.in);
        boolean isValid2=true;
        while (isValid2){
            try{
                System.out.println("enter radius height");
                double x =scanner1.nextDouble();
                System.out.println("area = " + area(x));

            } catch (Exception ex){
                isValid2=false;
                System.out.println("input type");

            }
            break;
        }

        System.out.println(area(5.0));
        System.out.println(area(-1));

    }


    public static boolean shouldWakeUp (boolean isBarking, int clock){
        //Guarding
        if(clock<0 || clock>23) return false;
        if(!isBarking) return false;
       // if(clock<8 || clock>=20) {
      //      return true;
      //  }
        return (clock<8 || clock>=20);

    }
    public static boolean hasTeen(int age1, int age2, int age3) {
        if (13 <= age1 && age1 <= 19 || 13 <= age2 && age2 <= 19 || 13 <= age3 && age3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean season, int temp){
        if (season && temp<=45 && temp>=25) {
            return true;
        } else if (!season && temp<=35 && temp>=25){
            return true;
        }
        return false;
    }

    public static double area(double a,double b){
        if(a*b<0) {
            return -1;
        }
        return a*b;
    }

    public static double area (double radius){
        if(radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }


}