# Reverse String

## Problem

Write a function that reverses a character array in-place.

The input is given as an array of characters `char[] s`.

You must modify the input array directly without using any extra array.

---

## Approach

This solution uses the **Two Pointer** technique.

- Initialize one pointer at the beginning of the array and another at the end.
- Swap the characters at both pointers.
- Move the left pointer forward and the right pointer backward.
- Continue until the two pointers meet.

This reverses the string in-place without using additional memory.

---

## Algorithm

1. Initialize `left` to `0`.
2. Initialize `right` to `s.length - 1`.
3. While `left < right`:
   - Swap `s[left]` and `s[right]`.
   - Increment `left`.
   - Decrement `right`.
4. The array is now reversed.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(1)**

The reversal is performed in-place without using extra space.

---

## Concepts Used

- Arrays
- Two Pointers
- Swapping
- In-place Modification

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 344
- **Problem Name:** Reverse String
