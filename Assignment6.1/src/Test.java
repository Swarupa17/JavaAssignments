
public class Test {
	private static class UpdaterThread extends Thread {
        private final int TIMEOUT = 50;

        public void run() {
            while (true) {
                try {
                    Thread.sleep(TIMEOUT);
                    System.out.println("Time Out");
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        try {
            Thread u = new UpdaterThread();
            u.start();
            while (true) {
                System.out.println("---");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
