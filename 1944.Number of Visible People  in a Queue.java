import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Iterate backwards through the queue
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            
            // Pop all shorter people to the right, as person i can see them
            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                stack.pop();
                count++;
            }
            
            // If the stack is not empty, person i can also see the first person 
            // taller than them who blocks the view to anyone behind
            if (!stack.isEmpty()) {
                count++;
            }
            
            answer[i] = count;
            
            // Push the current person's height onto the stack
            stack.push(heights[i]);
        }

        return answer;
    }
}
