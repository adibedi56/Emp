import java.util.*;
public class main {
   ArrayList<Emp> a1=new  ArrayList<Emp>();
   Scanner sc = new Scanner(System.in);
   void addEmp() {
	   System.out.println("Enter Emp no");
	   int eno=sc.nextInt();
	   
	   System.out.println("Enter Emp name");
	   String ename=sc.next();
	   
	   System.out.println("Enter sal");
	   double sal=sc.nextDouble();
	   
	   System.out.println("Enter Emp desg");
	   String desg=sc.next();
	   
	   Emp e= new Emp(eno,ename,sal,desg);
	   a1.add(e);
	   }
   void viewEmp() {
	   System.out.println("The available empolyes are:");
	   for(Emp e1:a1) {
		   System.out.println(e1.getEno()+" "+e1.getEname()+" "+e1.getSal()+" "+e1.getDesg());
	   }
	   System.out.println("=======================================");
   }
   void updateEmp() {
	   
   }
   void deleteEmp() {
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    main m=new main();
    int ch;
    do 
    {
    	System.out.println("1.Addemp \n2.veiwEmp \n3.updateEmp \n4.DeleteEmp \n5.Exit");
    	ch= sc.nextInt();
    	
    	switch(ch) {
    	case 1:m.addEmp();
    		break;
    	case 2:m.viewEmp();
    		break;
    	case 3:
    		break;
    	case 4:
    		break;
    	case 5:
    		System.out.println("Thank you for using our service");
    		break;
    	default:
    		System.out.println("Wrong choice");
       }
    }while(ch!=5);
  }

}


