# Plus One

## Problem

You are given a large integer represented as an integer array `digits`, where each element contains a single digit. The digits are ordered from most significant to least significant.

Increment the integer by one and return the resulting array of digits.

---

## Approach

This solution traverses the array from the last digit to the first.

- If the current digit is less than `9`, increment it by one and return the array.
- If the current digit is `9`, change it to `0` and continue to the previous digit.
- If all digits are `9`, create a new array with one extra digit, set the first element to `1`, and return it.

---

## Algorithm

1. Traverse the array from the last index to the first.
2. If the current digit is less than `9`:
   - Increment it by `1`.
   - Return the updated array.
3. Otherwise, set the current digit to `0`.
4. If the loop finishes, create a new array of size `digits.length + 1`.
5. Set the first element of the new array to `1`.
6. Return the new array.

---

## Time Complexity

**O(n)**

The array is traversed at most once.

---

## Space Complexity

**O(1)**

If no new array is created, only constant extra space is used. In the special case where all digits are `9`, a new array of size `n + 1` is created.

---

## Concepts Used

- Arrays
- Traversal
- Carry Propagation
- Conditional Statements

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 66
- **Problem Name:** Plus One
