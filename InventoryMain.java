public class InventoryMain {

    static int size = 0;
    
    
    public static synchronized void update(int i) {
        if (i==1) {
            size++;
            System.out.println("Added. Inventory Size = " + size);
        } else if(i==2) {
            size--;
            System.out.println("Removed. Inventory Size = " + size);
        }
    }

    
    public static void main(String args[]) {

        
        int firstArg = Integer.parseInt(args[0]);
        int secArg = Integer.parseInt(args[1]);

        Add op1 = new Add(firstArg);
        Minus op2 = new Minus(secArg);
        op1.start();
        op2.start();
        try {
            op1.join();
            op2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final inventory size = " + size);
    }

   
}

