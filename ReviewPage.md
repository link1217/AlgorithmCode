# Review Page

This page summarize the solutions of all problems. For thoughts,ideas written in English, refer to deach individual solution. 
New problems will be automatically updated once added.
--------------------------------------------
### Content
<!-- GFM-TOC -->
  * [Sort Algorithm](#1-Sort-Algorithm)
    * [Selection Sort](#2-Selection-Sort)

<!-- GFM-TOC -->
-----------------------

## 1. Sort Algorithm
> 内含对数器测试校验，在当前类的main函数中对排序方法进行校验，对数器由工具类[ArrayUtils](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/utils/ArrayUtils.java)生成


### **1. [Bubble Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BubbleSort.java)**
#### Stable: YES
* Worst Time Complexity ： O(n²) 
* Best Time Complexity(改进版(bubbleSort2)) : O(n)
* Average Time Complexity(常规版) ： O(n²) 
* Worst Space Complexity ： O(1)

* 若原数组有序，使用改进后的冒泡排序可以做到只需要遍历一遍

---------------------
### **2. [Selection Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/SelectionSort.java)**
#### Stable: NO
* Worst Time Complexity ： O(n²) 
* Best Time Complexity : O(n²)
* Average Time Complexity ： O(n²) 
* Worst Space Complexity ： O(1)

----------------------------------
### **3. [Insertion Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/InsertionSort.java)**
#### Stable: YES
* Worst Time Complexity ： O(n²) 
* Best Time Complexity : O(n)
* Average Time Complexity ： O(n²) 
* Worst Space Complexity ： O(1)

* 在数据量很少时性能优越

--------------------------
### **4. [Shell Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/ShellSort.java)**
#### Stable: NO
* Worst Time Complexity ：O(nlog²n)
* Best Time Complexity : O(n)
* Average Time Complexity ： 取决于间隔序列
* Worst Space Complexity ： O(n)
* Average Space Complexity ： O(1)

* 插入排序的变种

-------------------------
### **5. [Merge Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/MergeSort.java)**
#### Stable: YES
* Worst Time Complexity ： O(nlogn)
* Best Time Complexity : O(nlogn)
* Average Time Complexity ： O(nlogn)
* Worst Space Complexity ： O(n)

* 分治思想的经典体现

------------------------
### **6. [Quick Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/QuickSort.java)**
#### Stable: NO
* Worst Time Complexity ： O(n²) 
* Best Time Complexity : O(nlogn)
* Average Time Complexity ： O(1)
* Worst Space Complexity ： O(n)

* 优化后的随机快排，时间复杂度长期期望为O(nlogn)

-------------------
### **7. [Heap Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/HeapSort.java)**
#### Stable: NO
* Worst Time Complexity ： O(nlogn)
* Best Time Complexity : O(nlogn)
* Average Time Complexity ： O(nlogn)
* Worst Space Complexity ： O(n)

-----------------------



## Search Algorithm
> 与查找相关的算法


### **1. [Union Find Set](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/UnionFind.java)**
* Worst Time Complexity ： O(n)
* Best Time Complexity : O(1)
* Average Time Complexity ： O(1)
* Worst Space Complexity ： O(n)

* 可用于并行计算孤立岛数量，只需要记录各个分块的相邻边界处的并查集信息和总的岛数量

---------------------------



--------------------




