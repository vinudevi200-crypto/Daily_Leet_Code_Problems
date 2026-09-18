# LeetCode 876 – Middle of the Linked List

## 📌 Problem Statement

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

---

## 💡 Approach

This solution uses the **Slow and Fast Pointer** technique.

- `slow` moves one node at a time.
- `fast` moves two nodes at a time.
- When `fast` reaches the end of the list, `slow` will be at the middle node.
- Return `slow`.

---
