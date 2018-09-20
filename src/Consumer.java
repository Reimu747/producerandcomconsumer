public class Consumer extends Thread {
    private MyStack stack;

    public Consumer(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int i = stack.pull();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
