import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        
        // Remove calls that are outside the 3000ms window [t - 3000, t]
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
