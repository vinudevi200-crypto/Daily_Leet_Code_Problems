# Search Insert Position

## Problem

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found. If not, return the index where it should be inserted to keep the array sorted.

---

## Approach

- Traverse the array from left to right.
- If `nums[i]` is equal to `target`, return `i`.
- If `nums[i]` is greater than `target`, return `i` because the target should be inserted at that position.
- If the loop finishes without finding a suitable position, return `nums.length` since the target belongs at the end of the array.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Status

✅ Solved
