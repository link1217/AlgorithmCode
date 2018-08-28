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
	- [0.Union Find Set](#0-union-find-set)
        
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
- Average Time Complexity ： O(nlogn)
- Worst Space Complexity ： O(n)

- 优化后的随机快排，时间复杂度长期期望为O(nlogn)
> 每次排序随机交换标志位与待排序的任意一位数；partition过程根据荷兰国旗问题改进，一次partition将小于标志位的放左边，等于标志位的放中间，大于标志位的放右边，可有效处理数组中存在大量重复元素的问题

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
- Stable: YES
- Worst Time Complexity ： O(d(r+n)
- Best Time Complexity : O(d(r+n)
- Average Time Complexity ：O(d(r+n)
- Worst Space Complexity ： O(n+r)

- 对每一个数位进行桶排序，若只有非负数桶数为10，若包含负数桶数为19

--------------------


## Search Algorithm
> 与查找相关的算法


### 0. [Union Find Set](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/UnionFind.java)
- Worst Time Complexity ： O(n)
- Best Time Complexity : O(1)
- Average Time Complexity ： O(1)
- Worst Space Complexity ： O(n)

- 可用于并行计算孤立岛数量，只需要记录各个分块的相邻边界处的并查集信息和总的岛数量

---------------------------
### 1. [Sequential Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/SequentialSearch.java)
- Worst Time Complexity ： O(n)
- Best Time Complexity : O(1)
- Average Time Complexity ： O(n)
- Worst Space Complexity ： O(1)

- 说明：顺序查找适合于存储结构为顺序存储或链接存储的线性表。
- 基本思想：顺序查找也称为线形查找，属于无序查找算法。从数据结构线形表的一端开始，顺序扫描，依次将扫描到的结点关键字与给定值k相比较，若相等则表示查找成功；若扫描结束仍没有找到关键字等于k的结点，表示查找失败。
- 复杂度分析：　
　　查找成功时的平均查找长度为：（假设每个数据元素的概率相等） ASL = 1/n(1+2+3+…+n) = (n+1)/2 ;
　　当查找不成功时，需要n+1次比较，时间复杂度为O(n);
　　所以，顺序查找的时间复杂度为O(n)。

---------------
### 2. [Binary Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/BinarySearch.java)
- Worst Time Complexity ： O(1)
- Best Time Complexity : O(logn)
- Average Time Complexity ： O(logn)
- Worst Space Complexity ： O(1)

- 说明：元素必须是有序的，如果是无序的则要先进行排序操作。
- 基本思想：也称为是折半查找，属于有序查找算法。用给定值k先与中间结点的关键字比较，中间结点把线形表分成两个子表，若相等则查找成功；若不相等，再根据k与该中间结点关键字的比较结果确定下一步查找哪个子表，这样递归进行，直到查找到或查找结束发现表中没有这样的结点。
- 复杂度分析：最坏情况下，关键词比较次数为log2(n+1)，且期望时间复杂度为O(log2n)；
- 注：折半查找的前提条件是需要有序表顺序存储，对于静态查找表，一次排序后不再变化，折半查找能得到不错的效率。但对于需要频繁执行插入或删除操作的数据集来说，维护有序的排序会带来不小的工作量，那就不建议使用。——《大话数据结构》

--------------------
### 3. [Insertion Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/InsertionSearch.java)
- Worst Time Complexity ： O(1)
- Best Time Complexity : O(log(logn))
- Average Time Complexity ： O(log(logn))
- Worst Space Complexity ： O(1)

- 在介绍插值查找之前，首先考虑一个新问题，为什么上述算法一定要是折半，而不是折四分之一或者折更多呢？
- 打个比方，在英文字典里面查“apple”，你下意识翻开字典是翻前面的书页还是后面的书页呢？如果再让你查“zoo”，你又怎么查？很显然，这里你绝对不会是从中间开始查起，而是有一定目的的往前或往后翻。
- 同样的，比如要在取值范围1 ~ 10000 之间 100 个元素从小到大均匀分布的数组中查找5， 我们自然会考虑从数组下标较小的开始查找。
- 经过以上分析，折半查找这种查找方式，不是自适应的（也就是说是傻瓜式的）。二分查找中查找点计算如下：
> mid=(low+high)/2, 即mid=low+1/2*(high-low);
> 通过类比，我们可以将查找的点改进为如下：
> mid=low+(key-a[low])/(a[high]-a[low])*(high-low)，
> 也就是将上述的比例参数1/2改进为自适应的，根据关键字在整个有序表中所处的位置，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。
- 基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。
- 注：对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择。
- 复杂度分析：查找成功或者失败的时间复杂度均为O(log2(log2n))。


------------