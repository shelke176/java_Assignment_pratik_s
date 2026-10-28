class MessageThread extends Thread { MessageThread(String name){super(name);}public void run(){for(int i=1;i<=5;i++)System.out.println(getName()+" "+i);} }
public class ThreadByExtending { public static void main(String[] a){new MessageThread("Child thread").start();} }
