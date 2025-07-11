package Day13;

//Program to demonstrate InterThread Communication - Consumer Thread Class

public class Consumer extends Thread {
    Q obj;
    public Consumer(Q obj) {
        this.obj = obj;
        start();
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            obj.get();
        }
    }

    public static class Producer extends Thread {
        Q obj;

        public Producer(Q obj) {

            this.obj = obj;
            start();
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                obj.put(i);
                i++;
            }
        }
    }
}
