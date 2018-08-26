# Review Page

This page summarize the solutions of all problems. For thoughts,ideas written in English, refer to deach individual solution. 
New problems will be automatically updated once added.
--------------------------------------------
## Content

<!--GFM-TOC -->
- [Sort Algorithm](#sort-algorithm)
	- [1.Bubble Sort](#1-bubble-sort)
	- [2.Selection Sort](#2-selection-sort)
	- [3.Insertion Sort](#3-insertion-sort)
	- [4.Shell Sort](#4-shell-sort)
	- [5.Merge Sort](#5-merge-sort)
	- [6.Quick Sort](#6-quick-sort)
	- [7.Heap Sort](#7-heap-sort)
	- [8.Bucket Sort](#8-bucket-sort)
	- [9.Radix Sort](#9-radix-sort)
- [Search Algorithm](#search-algorithm)
	- [1.Union Find Set](#1-union-find-set)
        
<!--GFM-TOC -->

--------------------

## Sort Algorithm  
> 内含对数器测试校验，在当前类的main函数中对排序方法进行校验，对数器由工具类[ArrayUtils](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/utils/ArrayUtils.java)生成


### 1. [Bubble Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BubbleSort.java)
- Stable: YES
- Worst Time Complexity ： O(n²) 
- Best Time Complexity(改进版(bubbleSort2)) : O(n)
- Average Time Complexity(常规版) ： O(n²) 
- Worst Space Complexity ： O(1)

- 若原数组有序，使用改进后的冒泡排序可以做到只需要遍历一遍

---------------------
### 2. [Selection Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/SelectionSort.java)
- Stable: NO
- Worst Time Complexity ： O(n²) 
- Best Time Complexity : O(n²)
- Average Time Complexity ： O(n²) 
- Worst Space Complexity ： O(1)

----------------------------------
### 3. [Insertion Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/InsertionSort.java)
- Stable: YES
- Worst Time Complexity ： O(n²) 
- Best Time Complexity : O(n)
- Average Time Complexity ： O(n²) 
- Worst Space Complexity ： O(1)

- 在数据量很少时性能优越

--------------------------
### 4. [Shell Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/ShellSort.java)
- Stable: NO
- Worst Time Complexity ：O(nlog²n)
- Best Time Complexity : O(n)
- Average Time Complexity ： 取决于间隔序列
- Worst Space Complexity ： O(n)
- Average Space Complexity ： O(1)

- 插入排序的变种

-------------------------
### 5. [Merge Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/MergeSort.java)
- Stable: YES
- Worst Time Complexity ： O(nlogn)
- Best Time Complexity : O(nlogn)
- Average Time Complexity ： O(nlogn)
- Worst Space Complexity ： O(n)

- 分治思想的经典体现

------------------------
### 6. [Quick Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/QuickSort.java)
- Stable: NO
- Worst Time Complexity ： O(n²) 
- Best Time Complexity : O(nlogn)
- Average Time Complexity ： O(1)
- Worst Space Complexity ： O(n)

- 优化后的随机快排，时间复杂度长期期望为O(nlogn)

-------------------
### 7. [Heap Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/HeapSort.java)
- Stable: NO
- Worst Time Complexity ： O(nlogn)
- Best Time Complexity : O(nlogn)
- Average Time Complexity ： O(nlogn)
- Worst Space Complexity ： O(n)

-----------------------
### 8. [Bucket Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BucketSort.java)
- Stable: NO
- Worst Time Complexity ： O(nlogn)
- Best Time Complexity : O(N+C)
- Average Time Complexity ： O(N+C)，其中C=N*(logN-logM)
- Worst Space Complexity ： O(N+M)

- 一种以空间换时间的排序方法，额外空间高，消耗时间短，单论时间而言，一般比快排还要快
- 对固定区间的数字排序

----------------
### 9. [Radix Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/RadixSort.java)
| O(d(r+n)) | O(d(r+n)) | O(d(r+n)) | Y | |
- Stable: YES
- Worst Time Complexity ： O(d(r+n)
- Best Time Complexity : O(d(r+n)
- Average Time Complexity ：O(d(r+n)
- Worst Space Complexity ： O(n+r)

- 对每一个数位进行桶排序，若只有非负数桶数为10，若包含负数桶数为19

--------------------


## Search Algorithm
> 与查找相关的算法


### 1. [Union Find Set](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/UnionFind.java)
- Worst Time Complexity ： O(n)
- Best Time Complexity : O(1)
- Average Time Complexity ： O(1)
- Worst Space Complexity ： O(n)

- 可用于并行计算孤立岛数量，只需要记录各个分块的相邻边界处的并查集信息和总的岛数量

---------------------------



--------------------




