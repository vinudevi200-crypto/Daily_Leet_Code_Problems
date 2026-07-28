# 912. Sort an Array

## Problem Statement

Given an integer array `nums`, sort the array in ascending order and return it.

### Example

**Input:**
```
nums = [5,2,3,1]
```

**Output:**
```
[1,2,3,5]
```

---

## Approach

- Use the Insertion Sort algorithm.
- Start from the second element.
- Compare the current element with the previous elements.
- Shift larger elements one position to the right.
- Insert the current element into its correct position.
- Repeat until the entire array is sorted.

---

## Time Complexity

- **Best Case:** O(n)
- **Average Case:** O(n²)
- **Worst Case:** O(n²)

## Space Complexity

- **O(1)**

---

## Concepts Used

- Arrays
- For Loop
- While Loop
- Variables
- Insertion Sort

---

## What I Learned

- How the Insertion Sort algorithm works.
- How to divide the array into sorted and unsorted parts.
- How to compare the current element with previous elements.
- How to shift larger elements to the right.
- How to insert an element into its correct position.
- How to sort an array in ascending order.
- How to implement an in-place sorting algorithm without using extra arrays.
