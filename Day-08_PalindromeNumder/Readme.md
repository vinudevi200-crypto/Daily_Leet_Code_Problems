# Palindrome Number

## Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## Approach

This solution reverses the given integer and compares it with the original number.

- If the number is negative, it cannot be a palindrome.
- Store the original number.
- Reverse the digits of the number.
- Compare the reversed number with the original.
- Return `true` if they are equal; otherwise, return `false`.

---

## Algorithm

1. If `x` is negative, return `false`.
2. Store the original number in a variable.
3. Initialize a variable to store the reversed number.
4. Extract each digit using the modulo (`%`) operator.
5. Build the reversed number.
6. Compare the reversed number with the original number.
7. Return the comparison result.

---

## Time Complexity

**O(log₁₀ n)**

The number of iterations is equal to the number of digits in the integer.

---

## Space Complexity

**O(1)**

Only a few extra variables are used.

---

## Concepts Used

- Integers
- Modulo Operator
- While Loop
- Number Reversal
- Conditional Statements

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 9
- **Problem Name:** Palindrome Number
