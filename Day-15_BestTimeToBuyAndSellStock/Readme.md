## LeetCode – Best Time to Buy and Sell Stock

Solved the **Best Time to Buy and Sell Stock** problem using an efficient single-pass approach in Java.

### Problem

Given an array of stock prices where `prices[i]` represents the price of a stock on the `i-th` day, the goal is to find the **maximum profit** by choosing one day to buy and a later day to sell.

### Approach

* Start by considering the first price as the minimum buying price.
* Traverse the array from left to right.
* Update the minimum price whenever a lower price is found.
* Calculate the profit by subtracting the minimum price from the current price.
* Keep track of the maximum profit obtained so far.
* Since we traverse from left to right, the buying day always comes before the selling day.

### Example

For:

`prices = [7, 1, 5, 3, 6, 4]`

The best choice is:

* **Buy at:** `1`
* **Sell at:** `6`
* **Maximum Profit:** `5`

### Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

This problem helped me understand how to track the minimum value and maximum result efficiently while traversing an array only once.

Another problem completed in my **LeetCode Java practice journey** 🚀
