# Remove Duplicates from Sorted Array

## Problem

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements.

The relative order of the elements should be maintained, and no extra array should be used.

---

## Approach

This solution uses the **Two Pointer** technique.

- One pointer (`j`) keeps track of the last unique element.
- Another pointer (`i`) traverses the array.
- Whenever a new unique element is found, move `j` forward and place the unique element at `nums[j]`.
- After traversing the array, return the count of unique elements.

---

## Algorithm

1. Initialize `j` to `0`.
2. Traverse the array from index `1`.
3. Compare the current element with the last unique element.
4. If they are different:
   - Increment `j`.
   - Store the current element at `nums[j]`.
5. Return `j + 1` as the number of unique elements.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(1)**

The array is modified in-place without using any extra space.

---

## Concepts Used

- Arrays
- Two Pointers
- In-place Modification
- Traversal

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 26
- **Problem Name:** Remove Duplicates from Sorted Array
