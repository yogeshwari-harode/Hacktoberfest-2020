import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i] = scn.nextInt();
        }
        int fee = scn.nextInt();
        
        int boughtStateProfit = -prices[0];
        int soldStateProfit = 0;
        
        for(int i=1;i<prices.length;i++){
            
            int newBoughtStateProfit =0;
            int newSoldStateProfit =0;
            /* This is for the bought state */
            if(soldStateProfit - prices[i] > boughtStateProfit){
                newBoughtStateProfit = soldStateProfit - prices[i];
                
            }else{
                newBoughtStateProfit = boughtStateProfit;
                
            }
            
            /* This is for the selling state */
            if(boughtStateProfit + prices[i] -fee > soldStateProfit ){
             newSoldStateProfit = boughtStateProfit + prices[i] -fee ;
             
            }else{
                newSoldStateProfit = soldStateProfit;
            }
            
            soldStateProfit = newSoldStateProfit;
               boughtStateProfit = newBoughtStateProfit;
        }
        System.out.println(soldStateProfit);
    }

}
