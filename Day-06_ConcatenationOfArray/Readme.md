# Concatenation of Array

## Problem

Given an integer array `nums` of length `n`, return an array `ans` of length `2n` where:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

for `0 <= i < n`.

---

## Approach

This solution creates a new array of size `2 * n`.

- Traverse the original array once.
- Copy each element to its original position in the new array.
- Copy the same element again to the position `i + n`.
- Return the concatenated array.

---

## Algorithm

1. Create a new array `ans` of size `2 * nums.length`.
2. Traverse the original array.
3. Store each element at:
   - `ans[i]`
   - `ans[i + nums.length]`
4. Return the new array.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(n)**

A new array of size `2n` is created.

---

## Concepts Used

- Arrays
- Traversal
- Array Manipulation

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 1929
- **Problem Name:** Concatenation of Array
