# Richest Customer Wealth

## Problem

You are given a 2D integer array `accounts` where `accounts[i][j]` represents the amount of money the `iᵗʰ` customer has in the `jᵗʰ` bank.

Return the wealth of the richest customer.

A customer's wealth is the sum of all the money they have in all their bank accounts.

---

## Approach

This solution uses **Nested Loops**.

- Traverse each customer's bank accounts.
- Calculate the total wealth of each customer.
- Compare it with the current maximum wealth.
- Update the maximum wealth if a richer customer is found.
- Return the maximum wealth.

---

## Algorithm

1. Initialize `max` to `0`.
2. Traverse each row of the 2D array.
3. For each customer, calculate the sum of all bank accounts.
4. Compare the customer's wealth with `max`.
5. Update `max` if the current customer's wealth is greater.
6. Return `max`.

---

## Time Complexity

**O(m × n)**

- `m` = Number of customers
- `n` = Number of bank accounts per customer

---

## Space Complexity

**O(1)**

No extra space is used.

---

## Concepts Used

- 2D Arrays
- Nested Loops
- Traversal
- Maximum Element

---

## Difficulty

Easy

---

## LeetCode

- **Problem Number:** 1672
- **Problem Name:** Richest Customer Wealth
