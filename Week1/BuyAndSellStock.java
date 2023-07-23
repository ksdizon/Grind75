class BuyAndSellStock {
	public static void main(String[] args) {
		int[] prices = [7,1,5,3,6,4];
	}
	
	public int maxProfit(int[] prices) {
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for (int day = 0; day < prices.length; day++) {
			if (prices[day] < minPrice) {
				minPrice = prices[day];
			} else if (prices[day] - minPrice > maxProfit) {
				maxProfit = prices[day] - minPrice;
			}
		}
	}
}

