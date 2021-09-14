### 410.Split-Array-Largest-Sum

ex: nums = [7, 2, 5, 10, 8] / m = 2

#### 解法: Binary Search
最小值(左邊界)：切成N(nums.length)份，即每個元素自己一組 => nums中最大值   
最大值(右邊界)：切成1份 => nums元素總合      

進行二分搜尋法，在左邊界與右邊界中猜答案(mid)。    
如何判斷mid是否可行?
1. 盡可能合併元素，使任何子數組的和都不超過mid
2. 同時紀錄子數組的數量，若超過m個則不可行

[Leetcode Link](https://leetcode.com/problems/split-array-largest-sum)