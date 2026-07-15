# Remove Element-Day 3

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of remaining elements.

## Language

- Java

## Approach

- Initialize a pointer `i = 0`.
- Traverse the array using another pointer `j`.
- If `nums[j]` is not equal to `val`, swap `nums[i]` and `nums[j]`.
- Increment `i` after placing a valid element.
- After the loop, `i` represents the number of elements remaining after removing `val`.

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**

## Solution

The solution uses the **two-pointer technique** to move all elements that are not equal to `val` to the front of the array. It modifies the array in-place without using any extra space.

## Status

✅ Solved
