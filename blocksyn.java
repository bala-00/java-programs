public class blocksyn implements Runnable
{
    public static void main(String args[])
    {
        blocksyn b = new blocksyn();
        Thread t1 = new Thread(b,"hi");
        Thread t2 = new Thread(b,"hello");
        t1.start();
        t2.start();
    }
    public void run()
    {
        synchronized(this)
        {
            try 
            {
                if(Thread.currentThread().getName().equals("hi"))
                {
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(5*i);
                    }
                }
                else
                {
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(10*i);
                    }
                }
            }catch(Exception e)
            {
                System.out.println("error occured");
            }
        }
    }
}