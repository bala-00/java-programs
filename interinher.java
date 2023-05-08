interface calc{
void add();
}

class sum implements calc
{
int a=20;
int b=5;
public void add()
{
System.out.println("a+b="+(a+b));
}
}
class sub implements calc
{
int a=20;
int b=5;
public void add()
{
System.out.println("a-b="+(a-b));
}
}
class interinher
{
 public static void main(String[]args)
 {  

sum a=new sum();
sub b=new sub();
a.add();
b.add();
}
}
