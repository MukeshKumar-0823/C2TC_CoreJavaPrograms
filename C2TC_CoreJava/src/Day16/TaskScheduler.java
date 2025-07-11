package Day16;

import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Add tasks with different priorities
        taskQueue.add(new Task("Task 1", 3)); // Low priority
        taskQueue.add(new Task("Task 2", 1)); // High priority
        taskQueue.add(new Task("Task 3", 2)); // Medium priority

        // Process tasks based on priority
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing: " + task.getName() + " (Priority: " + task.getPriority() + ")");
            // Execute the task
        }
    }
}