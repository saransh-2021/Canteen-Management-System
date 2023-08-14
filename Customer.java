class Customer{
    // Customer Details
    boolean order_status=false;
    String name;
    String[] orderList;
    int orderid, bill;
    QueueLl  custQueue;

    Customer(String name, int orderid, QueueLl  custQueue){
        this.name= name;
        this.orderid = orderid;
        this.custQueue=custQueue;
    }

    // Order summary
    void order(String[] orderList, int bill){
        this.order_status= false;
        this.orderList= orderList;
        this.bill= bill;
        orderPreparing op=new orderPreparing(orderList, name,orderid, bill,custQueue);
        Thread th= new Thread(op);
        th.start();
    }
    String getName(){
        return name;
    }
    
    String[] getOrderList(){
        return orderList;
    }
    boolean getOrder_Status(){
        return order_status;
    }
    int getOrderId(){
        return orderid;
    }
    int getbill(){
        return bill;
    }

    void getAll(){
        System.out.println("Name: "+ getName());
        System.out.print("OrderList: ");
        int i =0;
        while(getOrderList()[i]!=null){
            System.out.print(getOrderList()[i]+" ");
            i++;
        }
        System.out.println("\nOrderStatus: "+ getOrder_Status());
        System.out.println("OrderId: "+ getOrderId());
        System.out.println("Bill: "+ getbill());
        System.out.println();
    }
}