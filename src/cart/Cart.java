/*
Name : Miss.Nutnicha Chusin
ID : 6130200358
Section : 830
Description : 800
*/
package cart;
import java.util.Scanner;
public class Cart {
    public static void main(String[] args) {
        try{
            int num1,age1,num2,num3,age2,num4;
            Scanner inp = new Scanner(System.in);
            Washer temp = new Washer();
            TumbleDryer item = new TumbleDryer();
            System.out.println("1=Normal  2=Super  3=High");
            System.out.print("Please select a cylinder speed of washer : ");
            num1=inp.nextInt();
            System.out.print("How long you stop using this product : ");
            age1=inp.nextInt();
            System.out.print("The number of machines required : ");
            num2=inp.nextInt();
            System.out.println("*********************************************");
            System.out.println("1=Small_15kg  2=Medium_20kg  3=Large_25kg");
            System.out.print("Please select a size of tumble dryer : ");
            num3=inp.nextInt();
            System.out.print("How long you stop using this product : ");
            age2=inp.nextInt();
            System.out.print("The number of machines required : ");
            num4=inp.nextInt();
            System.out.println("*********************************************");
            temp.getMachine1(num1,age1,num2);
            item.getMachine2(num3, age2, num4);
        }
        catch(Exception e){
            System.out.println("!!! You enter the wrong information !!!");
        }
        
    }
}