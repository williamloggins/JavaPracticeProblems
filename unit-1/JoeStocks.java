public class JoeStocks {
    public static void main(String[] args) {
        int purchasedShares = 1000;
        double costPerShare = 32.87;
        double sellPrice = 33.92;
        double commissionAmount = 0.02;// same as 2%
        
        double totalCost = purchasedShares * costPerShare;
        double purchaseCommission = totalCost * commissionAmount;
        double saleRevenue = purchasedShares * sellPrice;
        double saleCommission = saleRevenue * commissionAmount;
        double profit = saleRevenue - saleCommission - totalCost - purchaseCommission;
        
        System.out.println("Amount paid for the stock: $" + totalCost);
        System.out.println("Commission paid to broker when purchasing stock: $" + purchaseCommission);
        System.out.println("Amount sold for: $" + saleRevenue);
        System.out.println("Commission paid to broker when selling stock: $" + saleCommission);
        System.out.println("Profit or loss: $" + profit);
    }
}
