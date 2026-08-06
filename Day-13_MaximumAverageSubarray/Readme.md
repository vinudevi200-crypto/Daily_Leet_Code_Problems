# Maximum Average Subarray I

## Problem

Given an integer array `nums` consisting of `n` elements and an integer `k`, find the contiguous subarray of length `k` that has the maximum average value.

Return the maximum average. Answers within `10⁻⁵` of the actual answer are accepted.

---

## Approach

This solution uses the **Sliding Window** technique.

- Calculate the sum of the first `k` elements.
- Store it as the current maximum sum.
- Slide the window one element at a time:
  - Add the new element entering the window.
  - Remove the element leaving the window.
  - Update the maximum sum if the current window sum is larger.
- Divide the maximum sum by `k` to get the maximum average.

---

## Algorithm

1. Calculate the sum of the first `k` elements.
2. Store this sum as the current maximum.
3. Traverse the remaining elements using a sliding window.
4. Update the window sum by:
   - Adding the new element.
   - Subtracting the element that leaves the window.
5. Update the maximum sum if needed.
6. Return `(double) maxSum / k`.

---

## Time Complexity

**O(n)**

The array is traversed only once after calculating the initial window.

---

## Space Complexity

**O(1)**

Only a few extra variables are used.

---

## Concepts Used

- Arrays
- Sliding Window
- Traversal
- Maximum Value
- Type Casting

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 643
- **Problem Name:** Maximum Average Subarray I
