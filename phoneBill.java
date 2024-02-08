// William Burgess
// Feb. 8, 2024
// phone plan assignment
// input:plan and amount of gigabytes
//output: the cost

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What phone bill plan do you have green, blue, purple: ");
        String plan = input.nextLine();
        plan = plan.toLowerCase();

        System.out.print("How many GB of data did you use: ");
        Double gb = input.nextDouble();

        String enter = input.nextLine();
        while(plan.equals("green") || plan.equals("blue") || plan.equals("purple")) {
            double cost = 0;
            //if they have the green plan
            if (plan.equals("green")) {
                cost = 49.99;
                //if they used more than 2 gigabytes then charge more
                if (gb > 2) {
                    cost += (gb-2) * 15;
                }
                //asks if they have a coupon and if cost is greater than 75
                System.out.print("Do you have a coupon?(yes or no): ");
                String coupon = input.nextLine();
                if (cost > 75 && coupon.equals("yes")) {
                    cost -= 20;
                }
            }
            //for blue plan
            else if (plan.equals("blue")) {
                cost = 70;
                //accounts for extra gigabytes
                if (gb > 4) {
                    cost += (gb-4) * 10;
                }
            }
            //purple plan
            else{
                cost = 99.95;
            }
            //round cost to two decimal
            cost = (int) (cost * 100) / 100.0;
            //output final bill
            System.out.println("Your final bill is " + cost);
            //stop loop
            plan = "u";
        }

    }
}
