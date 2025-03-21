public class BuyAndSell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = 0;
        int buy = prices[0];
        for(int price : prices){
            if(price < buy){
                buy = price;
            }else if((price - buy) > profit ){
                profit = price - buy;
            }
        }
        System.out.println(profit);
    }
}
