# Concatenation of Array

## Problem
Given an integer array `nums` of length `n`, create a new array `ans` of length `2n` such that `ans = nums + nums`.

## Approach
- Find the length of the array.
- Create a new array with double the size.
- Copy the original array into the first half.
- Copy the same array again into the second half.
- Return the new array.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Language
Java
