import java.util.*;
import java.io.*;


class Job implements Comparable<Job>{

	int profit;
	int start_time, end_time;

	public Job(int profit, int start_time, int end_time) {
		this.profit = profit;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public int compareTo(Job j) {
		if(end_time > j.end_time) 
			return 1;
		else if(end_time < j.end_time)
			return -1;
		else 
			return 0;
	}
}
public class JobScheduling {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		System.out.println("Profit    start time    end time\n");

		ArrayList<Job> job = new ArrayList<Job>();
		for(int i = 0; i < n; i++) {
				int p = in.nextInt();
				int st = in.nextInt();
				int et = in.nextInt();
				job.add(new Job(p, st, et));
		}

		Collections.sort(job);

		int[] maxProfit = new int[job.size()];
		for(int i = 0; i < job.size(); i++) {
			maxProfit[i] = job.get(i).profit;
		}

		int maxprofit = maxProfit[0];
		for(int i = 1; i < job.size(); i++) {
			for(int j = 0; j < i; j++) {
				if(job.get(j).end_time <= job.get(i).start_time) {
					maxProfit[i]  = Math.max(maxProfit[i], job.get(i).profit + maxProfit[j]);
				}
			}
			if(maxprofit < maxProfit[i]) {
				maxprofit = maxProfit[i];
			}
		}
		System.out.println(maxprofit);
	}
}