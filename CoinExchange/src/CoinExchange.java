import java.util.Scanner;


public class CoinExchange {

   public static void main(String[] args) {
      int coin_10, coin_5, coin_1;
      int remain_c10=100, remain_c5=100,remain_c1=100;
      int money, remain;
      
      
      
      
     while(true){
        int total=(remain_c10*10)+(remain_c5*5)+remain_c1; 
        remain = money = coin_10 = coin_5 = coin_1 = 0; 
        if(total<1){
            System.out.print("No coin");
            break;
        }
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please enter your money:"); 
        money = scan.nextInt();

        
        if(money>total){
            System.out.println("Not enough coins");
        }else{
              if(money/10>remain_c10){
                coin_10 = remain_c10; 
                remain = money - remain_c10*10; 
              }else{
                coin_10 = money / 10; 
                remain = money % 10;
              }
              if(remain/5>remain_c5){
                coin_5 = remain_c5;  
                remain = remain - remain_c5*5;   
              }else{
                coin_5 = remain / 5;  
                remain = remain % 5;  
              }    
              coin_1 = remain;      

              if(coin_10>0)
              System.out.println("10 = " + coin_10 + " coins.");
              if(coin_5>0)
              System.out.println("5 = " + coin_5 + " coins.");
              if(coin_1>0)
              System.out.println("1 = " + coin_1 + " coins.");
        



            Scanner in = new Scanner(System.in); 
            System.out.print("Plese enter A=Accept,C=Cancle:");
            String save = in.nextLine();

            if(save.equals("A")){
              remain_c10-=coin_10;
              remain_c5-=coin_5;
              remain_c1-=coin_1;
            }
            System.out.println("10 remain = " + remain_c10 + " coins.");
            System.out.println("5  remain = " + remain_c5 + " coins.");
            System.out.println("1  remain = " + remain_c1 + " coins.");
        }
     } 
   }
}