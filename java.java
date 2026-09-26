public class Main {
    public static void main(String[] args) {
        // Your Code goes here!
          int tenure=0; double cost=0, emi=0;
          scanner scan = new Scanner(System.in);
          System.out.println(x:"the amount for EMI eligibility");
          cost = scan.nextDouble();
          if(cost>=5000){
            System.out.print("eligible to convert"+ cost+"into EMI");  
            System.out.println(x:"Enter the desired tenure");
            tenure = scan.nextint();
            switch (tenure){
                case 12:case 3:case 6:case 9:
                emi = (cost+(cost*0.05))/tenure;
                system.out.println(x:"ROI 5 percentage");
                break;
              case 24:
                emi = ( (cost+(cost*0.10))/tenure;) 
                system.out.println(x:"ROI 10 percentage");
                break;
              case 36:
                emi = ( (cost+(cost*0.15))\tenure;) 
                system.out.println(x:"ROI 15 percentage");
                break;
               default:
                 System.out.println(x:"invalid tenure");
                 break;
             }
               System.out.println("your repayment EMI"+emi);
             }
             else{
                System.out.println("is not eligible");
             }
    }
}