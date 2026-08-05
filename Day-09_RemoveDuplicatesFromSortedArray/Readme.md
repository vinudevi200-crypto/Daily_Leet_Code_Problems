# Remove Duplicates from Sorted Array

## Problem

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements after removing the duplicates.

The array should be modified in-place without using extra space.

---

## Approach

This solution uses the **Two Pointer** technique.

- The first pointer (`j`) keeps track of the last unique element.
- The second pointer (`i`) traverses the array.
- Whenever a new unique element is found, increment `j` and copy the current element to `nums[j]`.
- After the traversal, the first `j + 1` elements of the array contain all unique elements.

---

## Algorithm

1. Initialize `j` to `0`.
2. Traverse the array from index `1`.
3. Compare `nums[i]` with `nums[j]`.
4. If they are different:
   - Increment `j`.
   - Copy `nums[i]` to `nums[j]`.
5. Continue until the end of the array.
6. Return `j + 1` as the number of unique elements.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(1)**

No extra space is used. The array is modified in-place.

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
