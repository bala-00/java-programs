interface A
{
    void show();
 }
 class B implements A
 {
     void show(int r)
     {
         System.out.println(3.14*r*r);
     }
    
}   
 class test 
 {
     B obj=new B();
     obj.show(2);
    
}