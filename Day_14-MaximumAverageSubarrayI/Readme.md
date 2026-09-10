# Day-13: Maximum Average Subarray I

## 🧩 Problem

Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the maximum average value.

## 💡 Approach

This problem is solved using the **Sliding Window** technique.

1. Calculate the sum of the first `k` elements.
2. Store it as the maximum sum.
3. Slide the window one position at a time.
4. Remove the element leaving the window.
5. Add the new element entering the window.
6. Update the maximum sum.
7. Divide the maximum sum by `k` to get the maximum average.

## 🔑 Key Concept

**Sliding Window**

Instead of calculating the sum of every subarray from scratch, we reuse the previous window's sum.

```text
New Sum = Previous Sum - Removed Element + Added Element
```

## ⏱️ Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

## 💻 Language

Java

## 🔗 LeetCode

Problem: Maximum Average Subarray I (LeetCode 643)

---

**Day 13 of my LeetCode journey 🚀**

Continuing to improve my problem-solving and DSA skills with Java.
