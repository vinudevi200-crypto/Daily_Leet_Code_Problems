# Merge Sorted Array

## Problem

You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n` representing the number of valid elements in each array.

Merge `nums2` into `nums1` as one sorted array. The final sorted array should be stored in `nums1`.

---

## Approach

This solution uses a simple **Copy and Sort** approach.

- Copy all elements from `nums2` into the empty positions at the end of `nums1`.
- Sort the entire `nums1` array using `Arrays.sort()`.
- The merged and sorted array is stored in-place in `nums1`.

---

## Algorithm

1. Traverse `nums2`.
2. Copy each element into `nums1` starting from index `m`.
3. Sort the entire `nums1` array.
4. The merged sorted array is stored in `nums1`.

---

## Time Complexity

**O((m + n) log(m + n))**

- Copying elements: **O(n)**
- Sorting the merged array: **O((m + n) log(m + n))**

---

## Space Complexity

**O(1)**

No extra array is used. The merge is performed in-place.

---

## Concepts Used

- Arrays
- Traversal
- Sorting
- In-place Modification

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 88
- **Problem Name:** Merge Sorted Array
