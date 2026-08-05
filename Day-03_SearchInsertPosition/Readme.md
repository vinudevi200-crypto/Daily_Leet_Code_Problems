# Search Insert Position

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be inserted while maintaining the sorted order.

---

## Approach

This solution traverses the array from left to right.

- If the target is found, return its index.
- If the target is smaller than the current element, return the current index as the insertion position.
- If the target is greater than all elements, return the length of the array.

---

## Algorithm

1. Traverse the array.
2. If the current element equals the target, return its index.
3. If the current element is greater than the target, return its index.
4. If the loop completes, return the array length.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Concepts Used

- Arrays
- Linear Search
- Conditional Statements

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 35
- **Problem Name:** Search Insert Position
