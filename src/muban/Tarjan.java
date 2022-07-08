package muban;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * tarjan实现 点/边计数从1-n
 */
public class Tarjan {
    int time, idx;  // 时间戳  边计数
    Stack<Integer> stack;   // dfs过程 点入栈
    Edge[] edges;   // 边 链式前向星
    int[] dfn, low, head;   // dfs时间戳  回溯值  链式前向星头
    boolean[] visited;  // 点是否在栈中
    List<List<Integer>> result;     // 所有强连通分量

    static class Edge {
        int next;
        int to;
        int from;
    }

    public void add(int from, int to) {
        edges[++idx] = new Edge();
        edges[idx].next = head[from];
        edges[idx].from = from;
        edges[idx].to = to;
        head[from] = idx;
    }

    public void tarjan(int cur) {
        dfn[cur] = ++time;
        low[cur] = time;
        visited[cur] = true;
        stack.push(cur);
        for (int i = head[cur]; i != 0; i = edges[i].next) {
            int v = edges[i].to;
            if (dfn[v] == 0) {
                tarjan(v);
                low[cur] = Math.min(low[cur], low[v]);
            }
            if (visited[cur]) {
                low[cur] = Math.min(low[cur], low[v]);
            }
        }
        if (low[cur] == dfn[cur]) {
            List<Integer> list = new ArrayList<>();
            while (true) {
                int pop = stack.pop();
                visited[pop] = false;
                list.add(pop);
                if (pop == cur) {
                    break;
                }
            }
            result.add(list);
        }
    }

    public static void main(String[] args) throws IOException {
        Tarjan t = new Tarjan();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // 求所有的强连通分量 第一行输入点的个数 第二行输入所有的边 空格分隔 每两个数为一条边
        int n = Integer.parseInt(input.readLine());
        t.dfn = new int[n + 1];
        t.low = new int[n + 1];
        t.head = new int[n + 1];
        t.visited = new boolean[n + 1];
        t.edges = new Edge[n * (n - 1) + 1];
        t.stack = new Stack<>();
        t.result = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input.readLine());
        while (st.hasMoreElements()) {
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            t.add(from, to);
            //t.add(to, from);
        }
        for (int i = 1; i <= n; i++) {
            if (t.dfn[i] == 0) {
                t.tarjan(i);
            }
        }
        out.println(t.result);

        // 缩点
        int[] map = new int[n + 1];
        for (int i = 0; i < t.result.size(); i++) {
            for (int p : t.result.get(i)) {
                map[p] = i;
            }
        }
        int[] degree = new int[t.result.size()];
        int cnt0 = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= t.idx; i++) {
            int from = map[t.edges[i].from];
            int to = map[t.edges[i].to];
            if (from != to) {
                degree[from]++;
            }
        }
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                if (cnt0 == 0) {
                    ans = t.result.get(i);
                }
                cnt0++;
            }
        }
        if (cnt0 > 1) {
            ans = new ArrayList<>();
        }
        out.println(ans);

        input.close();
        out.close();
    }

}