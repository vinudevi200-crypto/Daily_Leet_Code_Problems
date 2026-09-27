# 20. Valid Parentheses

## Problem
Given a string `s` containing only the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid if:
- Every opening bracket has a matching closing bracket.
- Brackets are closed in the correct order.
- Every closing bracket matches the most recent opening bracket.

## Approach
Use a **Stack** because Stack follows **LIFO (Last In, First Out)**.

- If the character is an opening bracket `(`, `{`, `[`, push it into the stack.
- If it is a closing bracket `)`, `}`, `]`:
  - Check if the stack is empty.
  - Pop the top element.
  - Check whether it matches the closing bracket.
- At the end, the stack must be empty.

## Example

### Input
```text
s = "([{}])"
