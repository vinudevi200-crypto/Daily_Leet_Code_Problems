# Second Largest Digit in a String

## Problem

Given a string `s` consisting of lowercase English letters and digits, return the **second largest numerical digit** that appears in the string.

If the second largest digit does not exist, return **-1**.

---

## Approach

This solution traverses the string once and keeps track of the **largest** and **second largest** digits found.

- Ignore all alphabetic characters.
- Convert digit characters into integers.
- Update the largest and second largest values while traversing the string.
- Return the second largest digit if it exists; otherwise, return `-1`.

---

## Algorithm

1. Initialize two variables to store the largest and second largest digits.
2. Traverse each character in the string.
3. Check whether the current character is a digit.
4. Convert the digit character to an integer.
5. Update the largest and second largest values accordingly.
6. Return the second largest digit, or `-1` if it is not found.

---

## Time Complexity

**O(n)**

The string is traversed only once.

---

## Space Complexity

**O(1)**

Only a constant amount of extra space is used.

---

## Concepts Used

- Strings
- Character Manipulation
- Conditional Statements
- Traversal

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 1796
- **Problem Name:** Second Largest Digit in a String
