package threads;

// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	int ctr2;
	int lower;
	int upper;
	
	
	public static void main(String[] args) {
		System.out.println(code);
		System.out.println("Starting Brute Force Checker");
		
		//fastest
		new Thread(()->{checkRange(0, 200_000);}).start();
		new Thread(()->{checkRange(200_001, 400_000);}).start();
		new Thread(()->{checkRange(400_001, 600_000);}).start();
		new Thread(()->{checkRange(600_001, 800_000);}).start();
		new Thread(()->{checkRange(800_001, 1000000);}).start();
		
		//kind of fast
		new Thread(()->{checkRange(0, 500_000);}).start();
		new Thread(()->{checkRange(500_001, 1000000);}).start();
		
		
		
		//boring
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
		int ctr = 0;
		while(!checkCode(ctr++));
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(long p){
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(p == code){
			return true;
		}else{
			return false;
		}
	}
	public static void checkRange(int lower, int upper) {
		long startTimeThread;
		startTimeThread = System.currentTimeMillis();
		long endTimeThread;
		float elapsedTimeThread;
		for (int i = lower; i < upper; i++) {
			if(checkCode(i)) {
				System.out.println(i);
				endTimeThread = System.currentTimeMillis();
				elapsedTimeThread = (float)(endTimeThread - startTimeThread);
				elapsedTimeThread /= 1000.f;
				System.out.println(elapsedTimeThread);
				break;
			}
	}
}
}
