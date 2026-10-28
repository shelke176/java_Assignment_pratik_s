class WorkerThread extends Thread { WorkerThread(String name){super(name);}public void run(){for(int i=1;i<=5;i++)System.out.println(getName()+" : "+i);} }
public class MultipleThreadsDemo { public static void main(String[] a){new WorkerThread("Thread 1").start();new WorkerThread("Thread 2").start();new WorkerThread("Thread 3").start();} }
