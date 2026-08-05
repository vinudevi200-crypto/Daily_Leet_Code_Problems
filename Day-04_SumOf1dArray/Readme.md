# Running Sum of 1D Array

## Problem

Given an array `nums`, return the running sum of the array.

The running sum of an array is defined as:

`runningSum[i] = sum(nums[0]...nums[i])`

---

## Approach

This solution updates the array in-place by adding the previous element's running sum to the current element.

- Start from the second element.
- Add the previous running sum to the current element.
- Continue until the end of the array.
- Return the modified array.

---

## Algorithm

1. Start traversing the array from index `1`.
2. Add the previous element to the current element.
3. Store the result in the current position.
4. Repeat until the last element.
5. Return the updated array.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(1)**

No extra array is used. The running sum is calculated in-place.

---

## Concepts Used

- Arrays
- Prefix Sum
- In-place Modification
- Traversal

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 1480
- **Problem Name:** Running Sum of 1D Array
