# Sort an Array

## Problem

Given an integer array `nums`, return the array sorted in ascending order.

---

## Approach

This solution uses the **Insertion Sort** algorithm.

- Start from the second element of the array.
- Treat the left portion of the array as already sorted.
- Compare the current element with the sorted portion.
- Shift larger elements one position to the right.
- Insert the current element into its correct position.
- Repeat until the entire array is sorted.

---

## Algorithm

1. Traverse the array from index `0` to the last index.
2. Store the current element in a temporary variable.
3. Compare it with the elements before it.
4. Shift larger elements one position to the right.
5. Insert the current element into its correct position.
6. Return the sorted array.

---

## Time Complexity

- **Best Case:** O(n)
- **Average Case:** O(n²)
- **Worst Case:** O(n²)

---

## Space Complexity

**O(1)**

The sorting is performed in-place without using extra memory.

---

## Concepts Used

- Arrays
- Insertion Sort
- Nested Loops
- In-place Sorting

---

## Difficulty

Medium

---

## LeetCode

- **Problem Number:** 912
- **Problem Name:** Sort an Array
