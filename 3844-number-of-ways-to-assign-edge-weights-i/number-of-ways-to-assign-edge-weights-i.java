class Solution {
    //test
    private static final long MOD = 1_000_000_007L;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        q.offer(new int[]{1, 0}); // node, depth
        visited[1] = true;

        int maxDepth = 0;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int depth = curr[1];

            maxDepth = Math.max(maxDepth, depth);

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(new int[]{next, depth + 1});
                }
            }
        }

        if (maxDepth == 0) {
            return 0;
        }

        long ans = 1;
        long base = 2;
        int power = maxDepth - 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            power >>= 1;
        }

        return (int) ans;
    }
}