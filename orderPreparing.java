class orderPreparing implements Runnable{
    String[] orders;
    String name;
    int order_id, bill;
    QueueLl custQueue;
    orderPreparing(String[] orders,String name, int order_id, int bill,QueueLl  custQueue){
        this.orders= orders;
        this.order_id= order_id;
        this.name= name;
        this.bill= bill;
        this.custQueue=custQueue;
    }
    public void run() {
        try{
            int i = 0;
            while(i<orders.length && orders[i]!=null){
            //for(int i=0;i<orders.length;i++){
                if(orders[i].equalsIgnoreCase("sandwich")) Thread.currentThread().sleep(5000);
                if(orders[i].equalsIgnoreCase("bread omlette")) Thread.currentThread().sleep(10000);
                if(orders[i].equalsIgnoreCase("coca cola")) Thread.currentThread().sleep(2000);
                if(orders[i].equalsIgnoreCase("noodles")) Thread.currentThread().sleep(7000);
                if(orders[i].equalsIgnoreCase("maggie")) Thread.currentThread().sleep(8000);
                if(orders[i].equalsIgnoreCase("pastry")) Thread.currentThread().sleep(2000);
                if(orders[i].equalsIgnoreCase("paneer roll")) Thread.currentThread().sleep(10000);
                if(orders[i].equalsIgnoreCase("egg roll")) Thread.currentThread().sleep(10000);
                if(orders[i].equalsIgnoreCase("soya chaap")) Thread.currentThread().sleep(12000);
                if(orders[i].equalsIgnoreCase("samosa")) Thread.currentThread().sleep(9000);
                i++;
            }
            System.out.print("\nOrder prepared for: | " + name + " | order_id: | " + order_id + " | bill: | " + bill);
            System.out.println("| orderstat: | Prepared |\n");
            custQueue.dequeue();                
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("An Error Occured");
        }
    }
}