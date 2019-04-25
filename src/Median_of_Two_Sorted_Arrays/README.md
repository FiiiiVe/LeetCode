# Median of Two Sorted Arrays
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:
```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
```
Example 2:
```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```
### my solution
merge two array into one array like what mergeSort does

the difference between mergeSort and this is there is no need to store the final sorted array

Time complexity: **O( (m+n) / 2 )**, in which m = arr1.length, n = arr2.length

Space complexity: **O(1)**

### better solution
```
          left_part          |        right_part
    A[0], A[1], ..., A[i-1]  |  A[i], A[i+1], ..., A[m-1]
    B[0], B[1], ..., B[j-1]  |  B[j], B[j+1], ..., B[n-1]
```

based on the fact that i+j = (m+n+1)/2, which means when we know i we know j, we can use binary search instead of searching one by one

What we need to do is ensuring that **max(left_part)≤min(right_part)**

Time complexity: **O( min(m,n)) )**

Space complexity: **O(1)**
