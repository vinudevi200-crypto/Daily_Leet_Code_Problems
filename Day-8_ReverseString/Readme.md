# 66. Plus One

## Problem Statement

You are given an integer array `digits` where each element represents a single digit of a large integer.

Increment the integer by one and return the resulting array of digits.

---

## Approach

- Start checking from the last digit.
- If the digit is less than `9`, increment it by `1` and return the array.
- If the digit is `9`, change it to `0` and continue checking the previous digit.
- If all digits are `9`, create a new array with one extra element and place `1` at the beginning.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)** (except when a new array is created for all `9`s)

---

## Concepts Used

- Arrays
- For Loop
- If-Else
- Return Statement

---

## What I Learned

- How to traverse an array from the last index using `digits.length - 1`.
- Why we start from the last digit when adding `1`.
- How carry works when the digit is `9`.
- Why we set the digit to `0` when it is `9`.
- Why we create a new array when all digits are `9`.
- How `return` immediately ends the method after updating the array.
- How to solve array problems by checking conditions and updating elements.
