# Remove Element

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of elements that are not equal to `val`.

The relative order of the remaining elements may be changed. Since the array is modified in-place, no extra array should be used.

---

## Approach

This solution uses the **Two Pointer** technique.

- Traverse the array using one pointer.
- Maintain another pointer to store the position of the next valid element.
- Whenever an element is not equal to `val`, place it at the current valid position.
- Increment the valid position pointer.
- Return the count of valid elements.

---

## Algorithm

1. Initialize a pointer `index` to `0`.
2. Traverse the array from the first element to the last.
3. If the current element is not equal to `val`:
   - Store it at `nums[index]`.
   - Increment `index`.
4. Return `index` as the number of remaining elements.

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

- **Problem Number:** 27
- **Problem Name:** Remove Element
