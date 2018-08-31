# Common Algorithm Code in Java

* [Algorithm Code](https://github.com/lanrengufeng/AlgorithmCode)

> 常见算法的JAVA代码实现：  更新ing···
个人邮箱(lanrengufeng@gmail.com  lanrengufeng@163.com  lanrengufeng@qq.com)

***********************
 
### Summary:
- **[README.md](https://github.com/lanrengufeng/AlgorithmCode/blob/master/README.md)**: 涉及到的算法

- **[ReviewPage.md](https://github.com/lanrengufeng/AlgorithmCode/blob/master/ReviewPage.md)**: 所有算法的总结和归纳（不断完善中）


**************************************************

## Content

<!--GFM-TOC -->

- [Sort Algorithm](#sort-algorithm)
- [Search Algorithm](#search-algorithm)

<!--GFM-TOC -->

--------------------

## Sort Algorithm
> 内含对数器测试校验，在当前类的main函数中对排序方法进行校验，对数器由工具类[ArrayUtils](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/utils/ArrayUtils.java)生成

| Sequence | Name     | Best Time Complexity | Worst Time Complexity | Average Time Complexity |Stable | Others |
|:--------:|:---------|:--------------------:|:---------------------:|:-----------------------:|:-----:|:------:|
|1|[Bubble Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BubbleSort.java)| O(n) or O(n²)| O(n²) | O(n²)| Y | 常规版和优化版 |
|2|[Selection Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/SelectionSort.java)| O(n²)| O(n²) | O(n²)| N | |
|3|[Insertion Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/InsertionSort.java)| O(n)| O(n²) | O(n²)| Y | |
|4|[Shell Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/ShellSort.java)| O(n) | O(nlog²n) |  | N | |
|5|[Merge Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/MergeSort.java)| O(nlogn) | O(nlogn) | O(nlogn) | Y | |
|6|[Quick Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/QuickSort.java)| O(nlogn) | O(n²) | O(nlogn) | N | 经过优化的随机快排 |
|7|[Heap Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/HeapSort.java)| O(nlogn) | O(nlogn) | O(nlogn) | N | |
|8|[Bucket Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BucketSort.java)| O(N) | O(N+C) | O(N+C) | N | |
|9|[Radix Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/RadixSort.java)| O(d(r+n)) | O(d(r+n)) | O(d(r+n)) | Y | |


------------------------------

## Search Algorithm

| Sequence | Name     | Best Time Complexity | Worst Time Complexity | Average Time Complexity | Tags | Others |
|:--------:|:---------|:--------------------:|:---------------------:|:-----------------------:|:-----:|:------:|
|0|[Union Find Set](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/UnionFind.java)| O(1) | O(n) | O(1)| Hash Table, Tree | 并查集 |
|1|[Sequential Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/SequentialSearch.java)| O(1) | O(n) | O(n)| Array |  |
|2|[Binary Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/BinarySearch.java)| O(1) | O(logn) | O(logn)| |  |
|3|[Insertion Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/InsertionSearch.java)| O(1) | O(log(logn)) | O(log(logn))| |  |
|4|[Fibonacci Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/FibonacciSearch.java)| O(1) | O(logn) | O(logn)| | 斐波那契数列 |
|5|[Tree Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/ReviewPage.md)|  |  | | | 搜索平衡二叉树，B树B+树，红黑树等 |
|6|[BFPRT](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/BFPRT.java)| O(1) | O(n) | O(n) | 分治，递归 | 比随机快排的partition更优 |




--------------
## Search Algorithm Classic Problem
| Sequence | Name     | Time Complexity | Space Complexity | Tags | Others |
|:--------:|:---------|:---------------:|:----------------:|:----:|:------:|
|1|[Kth Value](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/KthValue.java)| O(n) | O(1), O(n) | partition, BFPRT | 并查集 |



