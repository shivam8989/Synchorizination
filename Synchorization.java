package Multithreading;
import java.lang.*;

class table{
     synchronized void printTable(int n){
        System.out.println("The Table is");
        for(int i = 1; i<11; i++){
        System.out.println(n+" * " +i+" = "+n*i);
    }
        try{
            Thread.sleep(300);
            }catch(Exception e){
            System.out.println(e);
        }
        }
}
class myThread1 extends  Thread{
    table t ;
    myThread1(table t){
        this.t = t;
    }
    public void run (){
        t.printTable(2);
    }
}
class myThread2 extends  Thread{
    table t ;
    myThread2(table t){
        this.t = t;
    }
    public void run (){
        t.printTable(3);
    }
}

public class Synchorization {
    public static void main(String[] args) {


        table t1 = new table();
        myThread1 m1 = new myThread1(t1);
        myThread2 m2 = new myThread2(t1);
        m1.start();
        m2.start();
    }
}




