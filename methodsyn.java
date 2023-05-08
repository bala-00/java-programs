public class methodsyn implements Runnable
{
    public static void main(String args[])
    {
        methodsyn m = new methodsyn();
        Thread t1 = new Thread(m,"add");
        Thread t2 = new Thread(m,"multiply");
        t1.start();
        t2.start();
    }

    public void run()
    {
        try
        {
            check(Thread.currentThread().getName());
        }catch(Exception e)
        {
            System.out.println("error occured");
        }
    }