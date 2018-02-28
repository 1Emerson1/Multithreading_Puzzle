import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * ALGORITHM
 * 
 * Fork Possibilites - Generate successors
 * 
 * Create thread pool
 * Assign task to threads
 * 
 * 
 */
public class solverThread {
	
	public static void main(String [] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		Callable<String> task1 = () -> {
			TimeUnit.MILLISECONDS.sleep(300);
			System.out.println("Task 1 executed");
			return "Task 1 executed";
		};
		
		Callable<Integer> task2 = () -> {
			int sum;
			
			sum = 1+3;
			TimeUnit.MILLISECONDS.sleep(300);
			System.out.println("Task 2 executed");
			return sum;
		};
		
		Callable<String> task3 = () -> {
			TimeUnit.MILLISECONDS.sleep(300);
			System.out.println("Task 3 executed");
			return "Task 3 executed";
		};
		
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		
	}
}
