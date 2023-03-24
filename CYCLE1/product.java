public class product
{
 int pcode;
 int price;
 String pname;
 void getdata(int p1,String p2,int p3)
 {
   pcode=p1;
   pname=p2; 
   price=p3;
 }
 public static void main(String[] args)
 {
   System.out.println("Name : Anna Jose");
   System.out.println("Register Number : SJC22MCA-2008");
   System.out.println("Date : 24/03/2023");
   
   int smallest;
   product obj1 = new product();
   product obj2 = new product();
   product obj3 = new product();
      obj1.getdata(1111,"Refrigerator",200000);
      obj2.getdata(1112,"Washing Machine",50000);
      obj3.getdata(1113,"Television",150000);
   if(obj1.price<obj2.price)
   {
     if(obj3.price<obj1.price)
     {
       smallest=obj3.price;
     }
     else
     {
       smallest=obj1.price;
     }
   }
   else
   {
     if(obj2.price<obj3.price)
     {
       smallest=obj2.price;
     }
     else
     {
       smallest=obj3.price;
     }
   }
   System.out.println("The cheapest price is : "+smallest); 
 }
}
