


import java.util.Scanner;

public class Main {
//for making fuctions
/*//    public static void printSum(int a,int b){
//        int sum=a+b;
//        System.out.println(sum);
//    }*/
    public static void main(String[] args) {
     /*//university fee
        Scanner sc= new Scanner(System.in);
        System.out.println("enter amount you have to pay university fee:   ");
        double amount= sc.nextDouble();
        if (amount < 68100)
        {System.out.println("you have low cash");
            System.out.println("get more cash");
        }
        else if (amount >= 68100)
            System.out.println("congrats now go university bank for payment");
*/
        //bank opening days
        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter day for going in a bank:   ");
        String day= sc.next();
        switch (day){
            case "mon":

                    System.out.println("bank is open");
                    break;
            case "tues":


                System.out.println("bank is open");
                break;
            case "wed":

                System.out.println("bank is open");
                break;
            case "thurs":



                System.out.println("bank is open");
                break;
            case "fri":

                System.out.println("bank is open");
                break;
            default:
                System.out.println("bank is not open");
        }*/
        //for
     /*   for (int i = 100; i >= 1; i--) {
            System.out.println(i +", i purple you");
        }*/
        //while
        /*int i=100;
        while(i>=1){
            System.out.println(i+"*");
            i--;
        }*/
        //dowhile
        /*int k = 100;
        do {
            System.out.println(k);
            k--;
        }
        while (k >= 1);*/
      /*  int l;
        l=0;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter positive numbers only");
            l = sc.nextInt();


                System.out.println(l);
             }
            while (l >= 0) ;
        System.out.println("program end due to  negative number");*/
        //break
       /* int i = 1;
        while (i<=12) {
            System.out.println(i + "purple you");
            i++;
            if (i==10) {
                i++;
                continue;
            }
       }*/
      /*  int i = 1;
        while (true) {

                if (i == 6){
                    i++;
                continue;
            }

            System.out.println(i);
            i++;
        if (i >= 10) {
            break;

        }
    }*/
//exception handling
        int a[] = {78, 50, 45, 49};

/*try {
    System.out.println(a[6]);


}
    catch (Exception likho) {
        System.out.println("out of bond");
    }
        System.out.println("welcome to marks array");*/
        //functions methods
//for calling functions
        /*printSum(6,6);*/

        //ranxdom no generate user can guess
        //user sy pocho gy guess kro 1 100 ky a=darmiya number
        //agr zyda kary ga to kam hey
        //agr kam kary ga to zyda hy
        //thak jata hy to -1 to stop
        int randomNo = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int guess=0;
        do {
            System.out.println("guess no b/w 1-100: ");
            guess = sc.nextInt();

            if (randomNo == guess || guess ==-1){
                System.out.println(randomNo);
                System.out.println("wow congrats");
            break;}
            else if (randomNo > guess)
                System.out.println("your guess is small plz try again");
            else
                System.out.println("your guess is large plz try again");


        }

        while (true);

        {

            System.out.println("out of loop");
        }
    }
}





