import java.util.ArrayList;

public class StockPriceAnalysis {

    // Method to calculate the average stock price from an array
    public static double calculateAveragePrice(float[] stockPrices) {
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to find the maximum stock price from an array
    public static float findMaximumPrice(float[] stockPrices) {
        float maxPrice = stockPrices[0];
        for (float price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count the occurrence of a specific stock price in an array
    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        int count = 0;
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices using an ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPricesList) {
        ArrayList<Float> cumulativeSumList = new ArrayList<>();
        float cumulativeSum = 0;
        for (Float price : stockPricesList) {
            cumulativeSum += price;
            cumulativeSumList.add(cumulativeSum);
        }
        return cumulativeSumList;
    }

    public static void main(String[] args) {
        // Example array of stock prices for 10 days (float datatype)
        float[] stockPricesArray = {145.3f, 150.7f, 142.9f, 148.2f, 151.5f, 147.0f, 149.8f, 152.3f, 146.5f, 153.9f};
        
        // Example ArrayList of stock prices for 10 days
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate the average price
        double averagePrice = calculateAveragePrice(stockPricesArray);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find the maximum price
        float maxPrice = findMaximumPrice(stockPricesArray);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Count the occurrence of a specific price (e.g., 150.7)
        float targetPrice = 150.7f;
        int occurrenceCount = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrenceCount);

        // Compute the cumulative sum of stock prices using ArrayList
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
