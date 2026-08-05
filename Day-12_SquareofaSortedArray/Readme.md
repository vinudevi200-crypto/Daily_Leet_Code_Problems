# Squares of a Sorted Array

## Problem

Given an integer array `nums` sorted in non-decreasing order, return an array containing the squares of each number, also sorted in non-decreasing order.

---

## Approach

This solution follows a simple two-step approach:

- Traverse the array and square each element.
- Sort the modified array in ascending order.
- Return the sorted array.

This approach is easy to understand and is suitable for beginners learning arrays and sorting.

---

## Algorithm

1. Traverse the array from the first element to the last.
2. Replace each element with its square.
3. Sort the array using `Arrays.sort()`.
4. Return the sorted array.

---

## Time Complexity

**O(n log n)**

- Squaring all elements: **O(n)**
- Sorting the array: **O(n log n)**

Overall: **O(n log n)**

---

## Space Complexity

**O(1)**

The array is modified in-place without using any additional array.

---

## Concepts Used

- Arrays
- Traversal
- Sorting
- Math Operations

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 977
- **Problem Name:** Squares of a Sorted Array
