public class Executiontime {
    public static void main(String[] args) throws InterruptedException{
        long start=System.nanoTime();
        Thread.sleep(3000);
        long duration=(System.nanoTime()-start)/100000;
        System.out.println(duration+"ms");
    }
}
