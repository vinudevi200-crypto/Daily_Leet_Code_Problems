# Remove Duplicates from Sorted Array (LeetCode 26)

## Problem
Given a sorted integer array `nums`, remove the duplicate elements in-place and return the number of unique elements.

## Approach
- Use two pointers (`i` and `j`).
- `j` stores the position of the last unique element.
- `i` checks each element in the array.
- If a new unique element is found, move `j` forward and place the new element at `nums[j]`.
- Return `j + 1` as the number of unique elements.

## Algorithm
1. Initialize `j = 0`.
2. Traverse the array using `i` from `1` to `nums.length - 1`.
3. If `nums[i]` is different from `nums[j]`:
   - Increment `j`.
   - Copy `nums[i]` to `nums[j]`.
4. Return `j + 1`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

## Language
Java
