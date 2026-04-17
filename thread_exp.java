import java.lang.Thread;
class mythread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("soumya");
        }
    }
}
class mythread2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("simran");
        }
    }
    public void work()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("simran's doubt");
        }
    }
}
public class thread_exp {
    public static void main(String[] args) {

        mythread1 t1=new mythread1();//object creation of 1st class
        mythread2 t2=new mythread2();//object creation of 2nd class
        t1.start();//t1 called run() using start()
        t2.start();//t2 called run() using start()
        t2.work();
    }
}
