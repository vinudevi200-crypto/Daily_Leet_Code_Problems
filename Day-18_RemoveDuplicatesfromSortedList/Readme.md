# LeetCode 83 – Remove Duplicates from Sorted List

## 📌 Problem Statement

Given the head of a sorted linked list, delete all duplicates such that each element appears only once.

Return the linked list after removing the duplicates.

---

## 💡 Approach

Use a temporary pointer `temp` to traverse the linked list.

- Start `temp` from `head`.
- Compare the current node with the next node.
- If both values are equal, skip the duplicate node.
- Otherwise, move `temp` to the next node.
- Continue until the end of the list.
- Return `head`.

---
