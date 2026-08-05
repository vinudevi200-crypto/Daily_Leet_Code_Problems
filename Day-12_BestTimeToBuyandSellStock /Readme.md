# Best Time to Buy and Sell Stock

## Problem

Given an array `prices`, where `prices[i]` represents the price of a stock on the `iᵗʰ` day, find the maximum profit you can achieve by buying one stock and selling it later.

You may complete **only one transaction** (buy once and sell once).

If no profit is possible, return `0`.

---

## Approach

This solution uses the **Brute Force** approach with **Nested Loops**.

- The outer loop selects each day as the buying day.
- The inner loop checks every following day as the selling day.
- For each valid buy-sell pair, the profit is calculated.
- The maximum profit found is returned.

This approach ensures that the buying day always comes before the selling day.

---

## Algorithm

1. Initialize `maxProfit` to `0`.
2. Select each day as the buying day.
3. Compare it with every later day as the selling day.
4. Calculate the profit for each pair.
5. Update `maxProfit` if a larger profit is found.
6. Return the maximum profit.

---

## Time Complexity

**O(n²)**

Every buying day is compared with every possible selling day.

---

## Space Complexity

**O(1)**

No extra data structures are used.

---

## Concepts Used

- Arrays
- Nested Loops
- Brute Force
- Profit Calculation

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 121
- **Problem Name:** Best Time to Buy and Sell Stock
