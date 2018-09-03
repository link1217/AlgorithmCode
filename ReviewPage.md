# Review Page

This page summarize the solutions of all problems. For thoughts,ideas written in English, refer to deach individual solution. 
New problems will be automatically updated once added.
--------------------------------------------
## Content


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
	- [1.Sequential Search](#1-sequential-search)
	- [2.Binary Search](#2-binary-search)
	- [3.Insertion Search](#3-insertion-search)
	- [4. Fibonacci Search](#4-fibonacci-search)
	- [5. Tree Search](#5-数表查找)
	- [6. BFPRT](#6-bfprt)
- [Search Algorithm Classic Problem](#search-algorithm-classic-problem)     
    - [1. Kth Value](#1-kth-value)
    
    


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
>　　查找成功时的平均查找长度为：（假设每个数据元素的概率相等） ASL = 1/n(1+2+3+…+n) = (n+1)/2 ;  
> 　当查找不成功时，需要n+1次比较，时间复杂度为O(n);  
>　　所以，顺序查找的时间复杂度为O(n)。  

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

	 在介绍插值查找之前，首先考虑一个新问题，为什么上述算法一定要是折半，而不是折四分之一或者折更多呢？	
	个比方，在英文字典里面查“apple”，你下意识翻开字典是翻前面的书页还是后面的书页呢？如果再让你查“zoo”，你又怎么查？很显然，这里你绝对不会是从中间开始查起，而是有一定目的的往前或往后翻。	
同样的，比如要在取值范围1 ~ 10000 之间 100 个元素从小到大均匀分布的数组中查找5， 我们自然会考虑从数组下标较小的开始查找。
- 经过以上分析，折半查找这种查找方式，不是自适应的（也就是说是傻瓜式的）。二分查找中查找点计算如下：
> mid=(low+high)/2, 即mid=low+1/2*(high-low);
> 通过类比，我们可以将查找的点改进为如下：
> mid=low+(key-a[low])/(a[high]-a[low])*(high-low)，
> 也就是将上述的比例参数1/2改进为自适应的，根据关键字在整个有序表中所处的位置，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。
- 基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。
- 注：对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择。
- 复杂度分析：查找成功或者失败的时间复杂度均为O(log2(log2n))。

------------
### 4. [Fibonacci Search](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/FibonacciSearch.java)
- Worst Time Complexity ： O(1)
- Best Time Complexity : O(logn)
- Average Time Complexity ： O(logn)
- Worst Space Complexity ： O(n+m)
- 在介绍斐波那契查找算法之前，我们先介绍一下很它紧密相连并且大家都熟知的一个概念——黄金分割。
> 黄金比例又称黄金分割，是指事物各部分间一定的数学比例关系，即将整体一分为二，较大部分与较小部分之比等于整体与较大部分之比，其比值约为1:0.618或1.618:1。0.618被公认为最具有审美意义的比例数字，这个数值的作用不仅仅体现在诸如绘画、雕塑、音乐、建筑等艺术领域，而且在管理、工程设计等方面也有着不可忽视的作用。因此被称为黄金分割。
> 大家记不记得斐波那契数列：`1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89…….`（从第三个数开始，后边每一个数都是前两个数的和）。然后我们会发现，随着斐波那契数列的递增，前后两个数的比值会越来越接近0.618，利用这个特性，我们就可以将黄金比例运用到查找技术中。

- 基本思想：也是二分查找的一种提升算法，通过运用黄金比例的概念在数列中选择查找点进行查找，提高查找效率。同样地，斐波那契查找也属于一种有序查找算法。相对于折半查找，一般将待比较的key值与第`mid=（low+high）/2` 位置的元素比较，比较结果分三种情况：  
1. 相等，mid位置的元素即为所求
2. 大于，`low=mid+1`
3. 小于，`high=mid-1`
- 斐波那契查找与折半查找很相似，他是根据斐波那契序列的特点对有序表进行分割的。他要求开始表中记录的个数为某个斐波那契数小1，及n=F(k)-1;开始将k值与第F(k-1)位置的记录进行比较(及`mid=low+F(k-1)-1`),比较结果也分为三种:  
1. 相等，mid位置的元素即为所求
2. 大于，`low=mid+1,k-=2`
> 说明：`low=mid+1`说明待查找的元素在`[mid+1,high]`范围内，`k-=2` 说明范围`[mid+1,high]`内的元素个数为`n-(F(k-1))= Fk-1-F(k-1)=Fk-F(k-1)-1=F(k-2)-1`个，所以可以递归的应用斐波那契查找。
3. 小于，`high=mid-1,k-=1`
> 说明：`low=mid+1`说明待查找的元素在`[low,mid-1]`范围内，`k-=1` 说明范围`[low,mid-1]`内的元素个数为`F(k-1)-1`个，所以可以递归 的应用斐波那契查找。

- 复杂度分析：最坏情况下，时间复杂度为O(logn)，且其期望复杂度也为O(logn)。

-------------------------

### 5. 数表查找

   5.1 最简单的树表查找算法——二叉树查找算法

   **基本思想：**二叉查找树是先对待查找的数据进行生成树，确保树的左分支的值小于右分支的值，然后在就行和每个节点的父节点比较大小，查找最适合的范围。 这个算法的查找效率很高，但是如果使用这种查找方法要首先创建树。 

   　　**二叉查找树**（BinarySearch Tree，也叫二叉搜索树，或称二叉排序树Binary Sort Tree）或者是一棵空树，或者是具有下列性质的二叉树：

   　　1）若任意节点的左子树不空，则左子树上所有结点的值均小于它的根结点的值；

   　　2）若任意节点的右子树不空，则右子树上所有结点的值均大于它的根结点的值；

   　　3）任意节点的左、右子树也分别为二叉查找树。

   　　**二叉查找树性质**：**对二叉查找树进行中序遍历，即可得到有序的数列。**

   　　不同形态的二叉查找树如下图所示：

   ![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/2434234234.jpg)

    　　有关二叉查找树的查找、插入、删除等操作的详细讲解，请移步[浅谈算法和数据结构: 七 二叉查找树](http://www.cnblogs.com/yangecnu/p/Introduce-Binary-Search-Tree.html)。

   **复杂度分析：它和二分查找一样，插入和查找的时间复杂度均为O(logn)，但是在最坏的情况下仍然会有O(n)的时间复杂度。原因在于插入和删除元素的时候，树没有保持平衡（比如，我们查找上图（b）中的“93”，我们需要进行n次查找操作）。我们追求的是在最坏的情况下仍然有较好的时间复杂度，这就是平衡查找树设计的初衷。**

   　　下图为二叉树查找和顺序查找以及二分查找性能的对比图：

   **![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/234234125443.png)**

    

   　　基于二叉查找树进行优化，进而可以得到其他的树表查找算法，如平衡树、红黑树等高效算法。

   　　**5.2 平衡查找树之2-3查找树（2-3 Tree）**

   　　**2-3查找树定义**：和二叉树不一样，2-3树运行每个节点保存1个或者两个的值。对于普通的2节点(2-node)，他保存1个key和左右两个自己点。对应3节点(3-node)，保存两个Key，2-3查找树的定义如下：

   　　1）要么为空，要么：

   　　2）对于2节点，该节点保存一个key及对应value，以及两个指向左右节点的节点，左节点也是一个2-3节点，所有的值都比key要小，右节点也是一个2-3节点，所有的值比key要大。

   　　3）对于3节点，该节点保存两个key及对应value，以及三个指向左中右的节点。左节点也是一个2-3节点，所有的值均比两个key中的最小的key还要小；中间节点也是一个2-3节点，中间节点的key值在两个跟节点key值之间；右节点也是一个2-3节点，节点的所有key值比两个key中的最大的key还要大。

   [![Definition of 2-3 tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/252248450292152.png)

   　　**2-3查找树的性质：**

   　　**1）如果中序遍历2-3查找树，就可以得到排好序的序列；**

   　　**2）在一个完全平衡的2-3查找树中，根节点到每一个为空节点的距离都相同。（这也是平衡树中“平衡”一词的概念，根节点到叶节点的最长距离对应于查找算法的最坏情况，而平衡树中根节点到叶节点的距离都一样，最坏情况也具有对数复杂度。）**

   　　性质2）如下图所示：

   ![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/252249082017906.png)

    

   　　**复杂度分析：**

   　　2-3树的查找效率与树的高度是息息相关的。

   * 在最坏的情况下，也就是所有的节点都是2-node节点，查找效率为lgN
   * 在最好的情况下，所有的节点都是3-node节点，查找效率为log3N约等于0.631lgN

   　　距离来说，对于1百万个节点的2-3树，树的高度为12-20之间，对于10亿个节点的2-3树，树的高度为18-30之间。

   　　对于插入来说，只需要常数次操作即可完成，因为他只需要修改与该节点关联的节点即可，不需要检查其他节点，所以效率和查找类似。下面是2-3查找树的效率：

   [![analysis of 2-3 tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/252249104513019.png)

    

   　　**5.3 平衡查找树之红黑树（Red-Black Tree）**

   　　2-3查找树能保证在插入元素之后能保持树的平衡状态，最坏情况下即所有的子节点都是2-node，树的高度为lgn，从而保证了最坏情况下的时间复杂度。但是2-3树实现起来比较复杂，于是就有了一种简单实现2-3树的数据结构，即红黑树（Red-Black Tree）。

   　　**基本思想：**红黑树的思想就是对2-3查找树进行编码，尤其是对2-3查找树中的3-nodes节点添加额外的信息。红黑树中将节点之间的链接分为两种不同类型，红色链接，他用来链接两个2-nodes节点来表示一个3-nodes节点。黑色链接用来链接普通的2-3节点。特别的，使用红色链接的两个2-nodes来表示一个3-nodes节点，并且向左倾斜，即一个2-node是另一个2-node的左子节点。这种做法的好处是查找的时候不用做任何修改，和普通的二叉查找树相同。

   ![Red black tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/270024368439888.png)

   　　**红黑树的定义：**

   　　红黑树是一种具有红色和黑色链接的平衡查找树，同时满足：

   * 红色节点向左倾斜
   * 一个节点不可能有两个红色链接
   * 整个树完全黑色平衡，即从根节点到所以叶子结点的路径上，黑色链接的个数都相同。

   　　下图可以看到红黑树其实是2-3树的另外一种表现形式：如果我们将红色的连线水平绘制，那么他链接的两个2-node节点就是2-3树中的一个3-node节点了。

   [![1-1 correspondence between 2-3 and LLRB](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/270024403113529.png)

   　　**红黑树的性质**：**整个树完全黑色平衡，即从根节点到所以叶子结点的路径上，黑色链接的个数都相同（2-3树的第2）性质，从根节点到叶子节点的距离都相等）。**

   　　**复杂度分析：****最坏的情况就是，红黑树中除了最左侧路径全部是由3-node节点组成，即红黑相间的路径长度是全黑路径长度的2倍。**

   　　下图是一个典型的红黑树，从中可以看到最长的路径(红黑相间的路径)是最短路径的2倍：

   [![a typic red black tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/270027368747653.png)

   ## 　　红黑树的平均高度大约为logn。

   　　下图是红黑树在各种情况下的时间复杂度，可以看出红黑树是2-3查找树的一种实现，它能保证最坏情况下仍然具有对数的时间复杂度。

   ![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/270027378905711.png)

   　　红黑树这种数据结构应用十分广泛，在多种编程语言中被用作符号表的实现，如：

   * Java中的java.util.TreeMap,java.util.TreeSet；
   * C++ STL中的：map,multimap,multiset；
   * .NET中的：SortedDictionary,SortedSet 等。

   　　**5.4 B树和B+树（B Tree/B+ Tree）**

   　　平衡查找树中的2-3树以及其实现红黑树。2-3树种，一个节点最多有2个key，而红黑树则使用染色的方式来标识这两个key。

   　　维基百科对B树的定义为“在计算机科学中，B树（B-tree）是一种树状数据结构，它能够存储数据、对其进行排序并允许以O(log n)的时间复杂度运行进行查找、顺序读取、插入和删除的数据结构。B树，概括来说是一个节点可以拥有多于2个子节点的二叉查找树。与自平衡二叉查找树不同，B树为系统最优化**大块数据的读和写操作**。B-tree算法减少定位记录时所经历的中间过程，从而加快存取速度。普遍运用在**数据库**和**文件系统**。

   　　**B树定义：**

   　　**B树**可以看作是对2-3查找树的一种扩展，即他允许每个节点有M-1个子节点。

   * 根节点至少有两个子节点
   * 每个节点有M-1个key，并且以升序排列
   * 位于M-1和M key的子节点的值位于M-1 和M key对应的Value之间
   * 其它节点至少有M/2个子节点

   　　下图是一个M=4 阶的B树:

   ![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/290047034539184.png)

   　　可以看到B树是2-3树的一种扩展，他允许一个节点有多于2个的元素。B树的插入及平衡化操作和2-3树很相似，这里就不介绍了。下面是往B树中依次插入

   **6 10 4 14 5 11 15 3 2 12 1 7 8 8 6 3 6 21 5 15 15 6 32 23 45 65 7 8 6 5 4**

   的演示动画：

   ![img](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/23423423413.gif)

   　　**B+树定义：**

   　　**B+**树是对B树的一种变形树，它与B树的差异在于：

   * 有k个子结点的结点必然有k个关键码；
   * 非叶结点仅具有索引作用，跟记录有关的信息均存放在叶结点中。
   * 树的所有叶结点构成一个有序链表，可以按照关键码排序的次序遍历全部记录。

   　　如下图，是一个B+树:

   ![B Plus tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/290050048129679.png)

    

  下图是B+树的插入动画：
  
  ![Bplustreebuild](https://github.com/lanrengufeng/AlgorithmCode/tree/master/src/files/Bplustreebuild.gif)
    
   **B和B+树的区别在于，B+树的非叶子结点只包含导航信息，不包含实际的值，所有的叶子结点和相连的节点使用链表相连，便于区间查找和遍历。**

   B+ 树的优点在于：

   * 由于B+树在内部节点上不好含数据信息，因此在内存页中能够存放更多的key。 数据存放的更加紧密，具有更好的空间局部性。因此访问叶子几点上关联的数据也具有更好的缓存命中率。
   * B+树的叶子结点都是相链的，因此对整棵树的便利只需要一次线性遍历叶子结点即可。而且由于数据顺序排列并且相连，所以便于区间查找和搜索。而B树则需要进行每一层的递归遍历。相邻的元素可能在内存中不相邻，所以缓存命中性没有B+树好。

   　　**但是B树也有优点，其优点在于，由于B树的每一个节点都包含key和value，因此经常访问的元素可能离根节点更近，因此访问也更迅速。**

   　　下面是B 树和B+树的区别图：

   ![Different between B tree and B plus tree](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/290050088914733.png)

   　　B/B+树常用于文件系统和数据库系统中，它通过对每个节点存储个数的扩展，使得对连续的数据能够进行较快的定位和访问，能够有效减少查找时间，提高存储的空间局部性从而减少IO操作。它广泛用于文件系统及数据库中，如：

   * Windows：HPFS文件系统；
   * Mac：HFS，HFS+文件系统；
   * Linux：ResiserFS，XFS，Ext3FS，JFS文件系统；
   * 数据库：ORACLE，MYSQL，SQLSERVER等中。

   　　有关B/B+树在数据库索引中的应用，请看张洋的[MySQL索引背后的数据结构及算法原理](http://blog.codinglabs.org/articles/theory-of-mysql-index.html)这篇文章，这篇文章对MySQL中的如何使用B+树进行索引有比较详细的介绍，推荐阅读。

   　　**树表查找总结：**

   　　二叉查找树平均查找性能不错，为O(logn)，但是最坏情况会退化为O(n)。在二叉查找树的基础上进行优化，我们可以使用平衡查找树。平衡查找树中的2-3查找树，这种数据结构在插入之后能够进行自平衡操作，从而保证了树的高度在一定的范围内进而能够保证最坏情况下的时间复杂度。但是2-3查找树实现起来比较困难，红黑树是2-3树的一种简单高效的实现，他巧妙地使用颜色标记来替代2-3树中比较难处理的3-node节点问题。红黑树是一种比较高效的平衡查找树，应用非常广泛，很多编程语言的内部实现都或多或少的采用了红黑树。

   　　除此之外，2-3查找树的另一个扩展——B/B+平衡树，在文件系统和数据库系统中有着广泛的应用。

------------------
### 6. [BFPRT](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/BFPRT.java)
- Worst Time Complexity ： O(n)
- Average Time Complexity ： O(n)
- Space Complexity ： O(n)

- 在一个无序的数组中查找第k小的数，时间复杂度严格O(n)，而随机快排的partition过程只能做到时间复杂度长期期望为O(n)


----------------
## Search Algorithm Classic Problem
### 1. [Kth Value](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/search/KthValue.java)
- Time Complexity ： O(n)
- Space Complexity ： O(1)/O(n)

- 利用随机快排的partition过程或者BFPRT算法，时间复杂度都是O(n)，空间复杂度分别为O(1)和O(n)


----------------


--------------

- [back to top](#review-page)
