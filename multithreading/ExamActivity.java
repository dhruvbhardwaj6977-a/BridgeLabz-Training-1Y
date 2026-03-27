class ExamActivity implements Runnable {
    private String activity;
    private int delay;

    public ExamActivity(String activity, int delay) {
        this.activity = activity;
        this.delay = delay;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(activity + " State: " + t.getState());

        try {
            Thread.sleep(delay);
            System.out.println(activity + " started | Priority: " + t.getPriority());

            Thread.sleep(3000);
            System.out.println(activity + " completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(activity + " State after execution: " + t.getState());
    }

    public static void main(String[] args) {
        Thread entry = new Thread(new ExamActivity("Student Entry", 0));
        Thread paper = new Thread(new ExamActivity("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new ExamActivity("Attendance Marking", 10000));
        Thread collection = new Thread(new ExamActivity("Answer Sheet Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}