class Minus extends Thread {

     int minus;
     int temp = 0;

    public Minus(int minus) {
        this.minus = minus;
    }

    public void run() {
        while (temp < minus) {
            InventoryMain.update(2);
            temp++;
        }
    }
}
