package jvm;

public class HelloGc {

    public static void main(String[] args) {
        System.out.println("***********HelloGC");


        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("totalMemory = " + totalMemory + "   " + totalMemory/(1024*1024));
        System.out.println(maxMemory + "   " + maxMemory/(1024*1024));
//        try {
//        Thread.sleep(Integer.MAX_VALUE);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        byte [] byteArray = new byte[50*1024*1024];
    }
}
