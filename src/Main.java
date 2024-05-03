public class Main {
    public static void main(String[] args) throws InterruptedException {
        FibObject fib1 = new FibObject(12,1,2);
        Thread thread1 = new Thread(fib1);

        FibObject fib2 = new FibObject(12,3,4);
        Thread thread2 = new Thread(fib2);

        FibObject fib3 = new FibObject(12,5,6);
        Thread thread3 = new Thread(fib3);

        thread1.start();
        thread2.start();
        thread3.start();

        while (!fib1.Print()) {
            Thread.sleep(100);
        }
        while (!fib2.Print()) {
            Thread.sleep(100);
        }
        while (!fib3.Print()) {
            Thread.sleep(100);
        }
    }
}