package study.threads;
//change is done by kajal

public class MultiThreadExample {
//commit done by prathamesh
	public static void main(String[] args) {
		ChatThread th1 = new ChatThread();
		VideoThread th2 = new VideoThread();
		
		th1.start(); //this method will create OS level thread and add it to ready queue
		th2.start(); //when the schedular will select the thread at that time run() execute

	}//end of main

}//end of MultiThreadExample

class ChatThread extends Thread
{
	@Override
	public void run() {
	
		while(true)
			System.out.println("zoom chat is running");
	
	}
}

class VideoThread extends Thread
{
	@Override
	public void run() {
	
		while(true)
			System.out.println("zoom video is running");
	
	}
}



