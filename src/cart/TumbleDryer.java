package cart;
public class TumbleDryer {
    public void getMachine2(int num3,int age2,int num4){
        int result2=0;
        if(num3>3){
            System.out.println("!!! You enter the wrong information !!!");
            System.out.println("--------------------------------------------");
        }
        if(num3==1){
            int price=250000;
            System.out.println("Small tumble dryer can receive 15 kg of clothes and can choose the temperature.");
            System.out.println("Price per machine 250,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age2;i++){
                result2=price-10000;
                price=result2;
                if(price==40000){
                    result2=40000*num4;
                    System.out.println("Used tumble dryer, the price will not be lower than 40,000 baht.");
                    break;
                }
                if(i>=age2){
                    result2=result2*num4;
                }
            }
            System.out.println("Tumble dryer sale price : "+result2+" baht.");
            System.out.println("--------------------------------------------");
        }
        if(num3==2){
            int price=270000;
            System.out.println("Medium tumble dryer can receive 20 kg of clothes and can choose the temperature.");
            System.out.println("Price per machine 270,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age2;i++){
                result2=price-10000;
                price=result2;
                if(price==50000){
                    result2=50000*num4;
                    System.out.println("Used tumble dryer, the price will not be lower than 50,000 baht.");
                    break;
                }
                if(i>=age2){
                    result2=result2*num4;
                }
            }
            System.out.println("Tumble dryer sale price : "+result2+" baht.");
            System.out.println("--------------------------------------------");
        }
        if(num3==3){
            int price=300000;
            System.out.println("Large tumble dryer can receive 25 kg of clothes and can choose the temperature.");
            System.out.println("Price per machine 300,000 baht.");
            System.out.println("Depreciation 10,000 baht per year.");
            for(int i=1;i<=age2;i++){
                result2=price-10000;
                price=result2;
                if(price==60000){
                    result2=60000*num4;
                    System.out.println("Used tumble dryer, the price will not be lower than 60,000 baht.");
                    break;
                }
                if(i>=age2){
                    result2=result2*num4;
                }
            }
            System.out.println("Tumble dryer sale price : "+result2+" baht.");
            System.out.println("--------------------------------------------");
        }
    }
}