# LeetCode 142 – Linked List Cycle II

## 📌 Problem Statement

Given the head of a linked list, determine if the linked list contains a cycle.

If a cycle exists, return the node where the cycle begins. If there is no cycle, return `null`.

---

## 💡 Approach

This solution uses **Floyd's Cycle Detection Algorithm** (Tortoise and Hare Algorithm).

- `slow` pointer moves one step at a time.
- `fast` pointer moves two steps at a time.
- If `slow` and `fast` meet, a cycle exists.
- After detecting the cycle, reset `slow` to `head`.
- Move both pointers one step at a time.
- The node where they meet is the starting node of the cycle.

---
