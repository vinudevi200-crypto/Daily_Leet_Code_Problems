# Merge Sorted Array

## Problem
You are given two sorted integer arrays `nums1` and `nums2`.

- `nums1` has a size of `m + n`, where the first `m` elements are valid and the last `n` elements are `0`.
- `nums2` has `n` elements.

Merge `nums2` into `nums1` so that `nums1` becomes one sorted array.

## Approach
1. Copy all elements of `nums2` into the empty positions of `nums1`.
2. Sort the merged array using `Arrays.sort()`.

## Algorithm
1. Traverse `nums2` using a `for` loop.
2. Copy each element to the end of `nums1`.
3. Sort `nums1`.
4. The merged sorted array is stored in `nums1`.

## Time Complexity
- **O((m + n) log(m + n))**

## Space Complexity
- **O(1)** (Ignoring the space used by the sorting algorithm.)

## Concepts Used
- Arrays
- For Loop
- Variables
- Array Indexing
- `Arrays.sort()`

## Java Solution

```java
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
```
