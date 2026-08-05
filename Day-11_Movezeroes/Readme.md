# Move Zeroes

## Problem

Given an integer array `nums`, move all the zeroes to the end while maintaining the relative order of the non-zero elements. The operation must be performed in-place without creating another array.

## Approach

This solution uses the **Two Pointer** technique.

- Traverse the array from left to right.
- Keep track of the position where the next non-zero element should be placed.
- Whenever a non-zero element is found, swap it with the current position of the second pointer.
- Continue until all elements are processed.

## Algorithm

1. Initialize a pointer to track the position of the next non-zero element.
2. Traverse the array.
3. If the current element is non-zero:
   - Swap it with the element at the tracked position.
   - Move the tracked position forward.
4. After traversal, all non-zero elements remain in their original order, and all zeroes are moved to the end.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

## Concepts Used

- Arrays
- Two Pointers
- In-place Swapping
- Iteration

## Difficulty

Easy

## LeetCode

**Problem Number:** 283  
**Problem Name:** Move Zeroes
