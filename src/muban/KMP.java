package muban;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String text = "abcabcabcabcabcasdfasdfuahsdgfuiyjgf";
        String pat = "abcas";
        System.out.println(new KMP(pat).search(text));
        System.out.println(new KMP().search(text, pat));
    }
}

class KMP {
    int[][] f;
    String pat;

    public KMP() {
    }

    public KMP(String pat) {
        f = new int[pat.length()][256];
        this.pat = pat;
        f[0][pat.charAt(0)] = 1;
        int x = 0;
        for (int i = 1; i < pat.length(); i++) {
            for (int j = 0; j < 256; j++) {
                f[i][j] = f[x][j];
            }
            f[i][pat.charAt(i)] = i + 1;
            x = f[x][pat.charAt(i)];
        }
    }

    public int search(String text) {
        int ans = 0;
        for (int i = 0; i < text.length(); i++) {
            ans = f[ans][text.charAt(i)];
            if (ans == pat.length()) {
                return i - pat.length() + 1;
            }
        }
        return -1;
    }

    public int[] calculateNext(String pat) {
        int[] next = new int[pat.length()];
        int p = 0;
        for (int i = 1; i < pat.length(); i++) {
            while (p > 0 && pat.charAt(p) != pat.charAt(i)) {
                p = next[p - 1];
            }
            if (pat.charAt(p) == pat.charAt(i)) {
                p++;
            }
            next[i] = p;
        }
        return next;
    }

    public List<Integer> search(String text, String pat) {
        int[] next = calculateNext(pat);
        List<Integer> ans = new ArrayList<>();
        int p = 0;
        for (int i = 0; i < text.length(); i++) {
            while (p > 0 && pat.charAt(p) != text.charAt(i)) {
                p = next[p - 1];
            }
            if (pat.charAt(p) == text.charAt(i)) {
                p++;
            }
            if (p == pat.length()) {
                ans.add(i - pat.length() + 1);
                p = next[p - 1];
            }
        }

        return ans;
    }
}