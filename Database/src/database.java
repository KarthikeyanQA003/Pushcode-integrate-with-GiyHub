import java.util.Scanner;
class Student{
    void getDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the asked details");
        
        System.out.println("Enter Roll Number:");
        int rollNo = in.nextInt(); 
        
        System.out.println("Enter Name:");
        String name = in.next();
        
        System.out.println("Enter Age:");
        int age = in.nextInt();
      
        System.out.println("Inputed Student Detail");
        System.out.println("Roll Number:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
       
        
    }
}

public class database {
	 public static void main(String[] args) {
	        Student st = new Student();
	        st.getDetails();
	    }

	}


