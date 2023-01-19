package cart;
public class Washer {
    public void getMachine1(int num1,int age1,int num2){
        int result1=0;
        if(num1>3){
            System.out.println("!!! You enter the wrong information !!!");
            System.out.println("--------------------------------------------");
        }
        if(num1==1){
            int price=180000;
            System.out.println("Normal level washing machine rotate at a speed of 33 rpm.");
            System.out.println("Price per machine 180,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age1;i++){
                result1=price-10000;
                price=result1;
                if(price==10000){
                    result1=10000*num2;
                    System.out.println("Used washing machines, the price will not be lower than 10,000 baht");
                    break;
                }
                if(i>=age1){
                    result1=result1*num2;
                }
            }
            System.out.println("Washing machine sale price : "+result1+" baht");
            System.out.println("--------------------------------------------");
        }
        if(num1==2){
            int price=200000;
            System.out.println("Super level washing machine rotate at a speed of 46 rpm.");
            System.out.println("Price per machine 200,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age1;i++){
                result1=price-10000;
                price=result1;
                if(price==20000){
                    result1=20000*num2;
                    System.out.println("Used washing machines, the price will not be lower than 20,000 baht.");
                    break;
                }
                if(i>=age1){
                    result1=result1*num2;
                }
            }
            System.out.println("Washing machine sale price : "+result1+" baht");
            System.out.println("--------------------------------------------");
        }
        if(num1==3){
            int price=230000;
            System.out.println("High level washing machine rotate at a speed of 82 rpm.");
            System.out.println("Price per machine 230,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age1;i++){
                result1=price-10000;
                price=result1;
                if(price==30000){
                    result1=30000*num2;
                    System.out.println("Used washing machines, the price will not be lower than 30,000 baht.");
                    break;
                }
                if(i>=age1){
                    result1=result1*num2;
                }
            }
            System.out.println("Washing machine sale price : "+result1+" baht");
            System.out.println("--------------------------------------------");
        }
    }
}