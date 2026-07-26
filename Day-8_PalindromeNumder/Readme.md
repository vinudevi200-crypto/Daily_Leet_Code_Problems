# 9. Palindrome Number

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, otherwise return `false`.

A palindrome is a number that reads the same forward and backward.

### Example

**Input:**
```
x = 121
```

**Output:**
```
true
```

---

## Approach

- Store the original number.
- Reverse the given number using a loop.
- Compare the reversed number with the original number.
- If both are equal, return `true`; otherwise, return `false`.

---

## Time Complexity

- **O(log n)**

## Space Complexity

- **O(1)**

---

## Concepts Used

- Variables
- While Loop
- If-Else
- Arithmetic Operators (`%` and `/`)

---

## What I Learned

- How to reverse a number using a `while` loop.
- How to extract the last digit using the modulus (`%`) operator.
- How to remove the last digit using the division (`/`) operator.
- How to build the reversed number using `reverse = reverse * 10 + digit`.
- Why it is important to store the original number before modifying it.
- How to compare the original number with the reversed number to determine whether it is a palindrome.
- How to solve number-based problems using loops and arithmetic operations.
