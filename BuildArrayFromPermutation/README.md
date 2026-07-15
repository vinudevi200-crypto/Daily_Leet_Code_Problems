# Build Array from Permutation - Day 1

## Problem Solved

**Problem:** 1920. Build Array from Permutation

**Language:** Java

**Difficulty:** Easy

## Problem

Given a zero-based permutation `nums`, build an array `ans` where:

`ans[i] = nums[nums[i]]`

Return the array `ans`.

## Code Explanation

- Create a new array `ans`.
- Traverse the array using a `for` loop.
- Store `nums[nums[i]]` in `ans[i]`.
- Return the `ans` array.

## Time Complexity

O(n)

## Space Complexity

O(n)

**Status:** ✅ Solved
