
class Schraubschlussel {
}

class Mechaniker extends Thread {
    private Schraubschlussel leftschlussel;
    private Schraubschlussel rightschlussel;

    public Mechaniker(Schraubschlussel leftschlussel, Schraubschlussel rightschlussel) {
        this.leftschlussel = leftschlussel;
        this.rightschlussel = rightschlussel;
    }


    public void run() {
        int num = 0;
        try {
            while (num != 5) {


                doAction(": waiting");
                synchronized (leftschlussel) {
                    doAction(

                            ": Picked up left schraupschlussel");
                    synchronized (rightschlussel) {
                        doAction(
                                ": Picked up right schraupschlussel - arbeitet");

                        doAction(
                                ": Put down right schraupschlussel");
                    }

                    // Back to waiting
                    doAction(
                            ": Put down left schraupschlussel. Back to waiting");
                }
                num += 1;

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(
                Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

}