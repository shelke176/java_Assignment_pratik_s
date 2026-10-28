class TrafficSignal implements Runnable { public void run(){String[] lights={"RED - STOP","YELLOW - WAIT","GREEN - GO"};try{for(String light:lights){System.out.println(light);Thread.sleep(1000);}}catch(InterruptedException e){Thread.currentThread().interrupt();}} }
public class TrafficSignalRunnable { public static void main(String[] a){new Thread(new TrafficSignal()).start();} }
