# Running Sum of 1D Array

## Problem
Given an array `nums`, return the running sum of `nums`.

The running sum of an array is calculated as:

runningSum[i] = nums[0] + nums[1] + ... + nums[i]

## Approach
- Start the loop from index `1`.
- Add the previous element to the current element.
- Store the result in the current index.
- Return the updated array.

## Java Solution

```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
```

## Example

**Input:**
```
nums = [1,2,3,4]
```

**Output:**
```
[1,3,6,10]
```

## Time Complexity
- O(n)

## Space Complexity
- O(1)
