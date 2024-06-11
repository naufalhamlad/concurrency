public class Add extends Thread {
    
     int add;
     int temp = 0;

    public Add(int add) {
        this.add = add;
    }

    public void run() {
        while (temp < add) {
            InventoryMain.update(1);
            temp++;
        }
    }
}

