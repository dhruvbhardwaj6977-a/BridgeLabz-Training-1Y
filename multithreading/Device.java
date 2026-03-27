class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running | Priority: " +
                    t.getPriority() + " | Cycle: " + i +
                    " | Time: " + System.currentTimeMillis());
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature Sensor", 5));
        Thread camera = new Thread(new Device("Security Camera", 3));
        Thread light = new Thread(new Device("Light Controller", 4));
        Thread door = new Thread(new Device("Door Lock", 6));

        camera.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        camera.start();
        light.start();
        door.start();
    }
}