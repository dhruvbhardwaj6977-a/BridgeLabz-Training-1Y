class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int id, String restaurant, int time) {
        this.orderId = id;
        this.restaurant = restaurant;
        this.deliveryTime = time;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();

        try {
            System.out.println("Order " + orderId + " picked up by " + t.getName());
            Thread.sleep(deliveryTime * 500);

            System.out.println("Order " + orderId + " in transit...");
            Thread.sleep(deliveryTime * 500);

            System.out.println("Order " + orderId + " delivered!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time for Order " + orderId + ": " + (end - start) + " ms");
    }

    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 3), "Agent-1");
        Thread o2 = new Thread(new Order(2, "Dominos", 2), "Agent-2");
        Thread o3 = new Thread(new Order(3, "McD", 4), "Agent-3");
        Thread o4 = new Thread(new Order(4, "PizzaHut", 3), "Agent-4");
        Thread o5 = new Thread(new Order(5, "BurgerKing", 2), "Agent-5");

        o1.setPriority(10); // Express
        o2.setPriority(5);  // Standard
        o3.setPriority(3);  // Economy
        o4.setPriority(10);
        o5.setPriority(5);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}