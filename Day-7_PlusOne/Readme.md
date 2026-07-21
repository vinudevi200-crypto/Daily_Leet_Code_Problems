# Plus One

## Problem

You are given an integer represented as an array of digits.

Increase the integer by one and return the resulting array.

## Approach

1. Start checking from the last digit.
2. If the digit is less than 9, increase it by 1 and return the array.
3. If the digit is 9, change it to 0 and move to the previous digit.
4. If all digits are 9, create a new array with one extra element and place 1 at the beginning.

## Algorithm

1. Traverse the array from right to left.
2. Check if the current digit is less than 9.
3. If yes, increment the digit and return the array.
4. Otherwise, set the digit to 0 and continue.
5. If the loop finishes, create a new array of size `digits.length + 1`.
6. Set the first element to 1 and return the new array.

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)** (Except when a new array is created for all 9's.)

## Concepts Used

- Arrays
- For Loop
- If-Else
- Variables
- Return Statement

## Java Solution

```java
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
