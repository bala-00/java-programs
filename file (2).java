import java.io.*;
class file
{
    public static void main(String args[])
    {
        FileInputStream f1=null;
        int count1=0;
        int count2=0;
        int count3=0;
        try
        {
            f1=new FileInputStream("sss.txt");
            
            int c;
            do
            {
                c=f1.read();
                if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
                {
                    count1++;
                }
                if(c==' '||c=='.')
                {
                    count2++;
                }
                if(c=='.')
                {
                    count3++;
                }
            }while(c!=-1);
            System.out.println("charactor count:"+count1);
            System.out.println("word count:"+count2);
            System.out.println("line count:"+count3);
        }
        catch(IOException e)
        {
            System.out.println("Error occured");
        }
    }
}