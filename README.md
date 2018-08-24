# Common Algorithm Code in Java

* [Algorithm Code](https://github.com/lanrengufeng/AlgorithmCode)

> 常见算法的JAVA代码实现：  更新ing···
个人邮箱(lanrengufeng@gmail.com  lanrengufeng@163.com  lanrengufeng@qq.com)

***********************
 
### Tips:
- **[README.md](https://github.com/lanrengufeng/AlgorithmCode/blob/master/README.md)**: 涉及到的算法

- **[ReviewPage.md](https://github.com/lanrengufeng/AlgorithmCode/blob/master/ReviewPage.md)**: 所有算法的总结和归纳（不断完善中）


**************************************************

## Sort Algorithm
> 内含对数器测试校验，在当前类的main函数中对排序方法进行校验，对数器由工具类[ArrayUtils](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/utils/ArrayUtils.java)生成

| Sequence | Name | Best Time Complexity | Worst Time Complexity | Average Time Complexity |Stable | Others |
|:--------:|:-----|:--------------------:|:---------------------:|:-----------------------:|:-----:|:------:|
|1|[Bubble Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/BubbleSort.java)| O(n) or O(n²)| O(n²) | O(n²)| Y | 常规版和优化版 |
|2|[Selection Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/SelectionSort.java)| O(n²)| O(n²) | O(n²)| N | |
|3|[Insertion Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/InsertionSort.java)| O(n)| O(n²) | O(n²)| Y | |
|4|[Shell Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/ShellSort.java)| O(n) | O(nlog²n) |  | N | |
|5|[Merge Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/MergeSort.java)| O(nlogn) | O(nlogn) | O(nlogn) | Y | |
|6|[Quick Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/QuickSort.java)| O(nlogn) | O(n²) | O(nlogn) | N | 经过优化的随机快排 |
|7|[Heap Sort](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/sort/HeapSort.java)| O(nlogn) | O(nlogn) | O(nlogn) | N | |


**************************************************

## Search Algorithm

| Sequence | Name       | Time Complexity  | Language  | Stable | Others |
|:-------:|:--------------|:------:|:---------:|:----:|:-------------:|
|1|[Two Sum](https://github.com/lanrengufeng/LeetCodeEx/blob/master/src/leetcode/TwoSum.java)|Easy|Java| Array, Hash Table ||