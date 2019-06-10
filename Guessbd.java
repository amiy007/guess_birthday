import java.util.Scanner;

class Guessbd
{public static void main(String []args)
   {String set1="1 3 5 7 \n"+
                 "9 11 13 15\n"+
                 "17 19 21 23\n"+
                 "25 27 29 31\n";
    String set2="2 3 6 7 \n"+
                "10 11 14 15\n"+
                "18 19 22 23\n"+
                "26 27 30 31\n";
    String set3="4 5 6 7 \n"+
                "12 13 14 15\n"+
                "20 21 22 23\n"+ 
                "28 29 30 31\n";
    String set4="8 9 10 11\n"+
                "12 13 14 15\n"+
                "24 25 26 27\n"+
                "28 29 30 31\n";
   
      String set5="16 17 18 19\n"+
                  "20 21 22 23\n"+
                  "24 25 26 27\n"+
                  "28 29 30 31\n";

 int day=0;
int a;
Scanner sc=new Scanner(System.in);
System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set1);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=1;
}
System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set2);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=2;
}
System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set2);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=2;
}
System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set3);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=4;
}
System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set4);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=8;
}
 System.out.println("does ur d.o.b belong to this set 1(yes) 0(no)");
System.out.println(set5);
System.out.println("enter ur choice");
a=sc.nextInt();
if(a==1)
{day+=16;
} 
System.out.println("hurray! your birthday is:"+day);
}
}