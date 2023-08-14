import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main{

	public static void main(String[] args){
		QueueLl custque = new QueueLl();
        Scanner sc = new Scanner(System.in);
        int custcount=1;

        try{
            do {
                System.out.println("\n1. Order Food");
                System.out.println("2. View Queue");
                System.out.println("3. Exit");
                System.out.print("Enter your choice(1-3): ");
                int ch=sc.nextInt();

                if(ch==3){
                    System.out.println("Good Bye. Have a nice Day");
                    System.out.println("Total Customer served today "+(custcount-1));
                    break;
                }
                else if (ch==2) {
                    custque.display();
                }
                else{
                    String name;
                    int money = 0;
                    String[] items = new String[10];
                    int i = 0;
                    int orderid = (int) (Math.random() * 10000);

                    do {
                        System.out.println("\nCustomer "+custcount+" enter your order");
                        System.out.print("Enter your name(name atleast 2 letter long): ");
                        name = sc.next();
                    }while(name.length()<2);
                      
                    do {
                        System.out.println("\n");
                        menuList();
                        System.out.print("Enter your choice(1-10): ");
                        ch=sc.nextInt();
                        
                        switch (ch) {
                            case 1:
                                money+=10;
                                items[i]="samosa";
                                break;
                            case 2:
                                money+=45;
                                items[i]="sandwich";
                                break;
                            case 3:
                                money+=50;
                                items[i]="bread omlette";
                                break;
                            case 4:
                                money+=20;
                                items[i]="coca cola";
                                break;
                            case 5:
                                money+=80;
                                items[i]="noodles";
                                break;
                            case 6:
                                money+=40;
                                items[i]="maggie";
                                break;
                            case 8:
                                money+=40;
                                items[i]="paneer roll";
                                break;
                            case 9:
                                money+=40;
                                items[i]="egg roll";
                                break;
                            case 10:
                                money+=80;
                                items[i]="soya chaap";
                                break;
                            case 7:
                                money+=20;
                                items[i]="pastry";
                                break;
                            default:
                                System.out.println("Please enter correct option");
                                break;
                        }
                        i++;
                        System.out.print("Do you want to add more items to order?(Yes/No):");
                        String ch1=sc.next();
                        if (ch1.equalsIgnoreCase("no") || ch1.equalsIgnoreCase("n")) {
                            break;
                        }
                    } while(true);
                    Customer n = new Customer(name,orderid,custque);
                    custque.enqueue(n);
                    n.order(items, money);
                    System.out.println("Your Order id is "+orderid);
                    custcount++;
                }
            }while(true);
        }
        catch(Exception e){
            //System.out.println(e);
            System.out.println("\nPlease Try Again Later");
            //e.printStackTrace();
        }
	}

	static void menuList(){
        File menufile= new File(".\\Menu.txt");
        Scanner readfile= null;
        try{
        	readfile= new Scanner(menufile);
            for(int i=0;i<10;i++){
            	System.out.print("----");
        	}
        	System.out.println("\nMenu");
            System.out.println("\nS.No\tItem\t\tPrice\tWait Time");
            String s;
            while(readfile.hasNextLine()){
            	s= readfile.nextLine();
            	String[] temp = s.split("@");
                if (temp[1].length()<8) {
                    System.out.println(temp[0]+"\t"+temp[1]+"\t\t"+temp[2]+"\t"+temp[3]);
                }
                else {
                    System.out.println(temp[0]+"\t"+temp[1]+"\t"+temp[2]+"\t"+temp[3]);    
                }
            }
            for(int i=0;i<10;i++){
            	System.out.print("----");
        	}
            System.out.println("\n");
        }
        catch (Exception e){
            // if any I/O error occurs
            e.printStackTrace();
        }
        finally{
            readfile.close();
        }
	}
}
