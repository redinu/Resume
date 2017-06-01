import java.util.Scanner;

public class Resume {
	
	static String name;
	static String email;
	static String[] education= new String[10];
	static String[] experience = new String[10];
	static String[] skills = new String[20];
	static boolean hasNext = true;
	static int counter = 0;
	static String addMore = "y";
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		printName();
		printEmail();
		printEducation();
		printExperience();
		printSkill();
		
		
	}
		
	public static void printName(){
		System.out.println("Please enter your name");
		name = scn.nextLine();
		System.out.println(name);
		 
	}
	
	public static void printEmail(){
		System.out.println("Enter your email address");
		email = scn.nextLine();
		System.out.println(name);
		 
	}
	public static void printEducation(){
		System.out.println("Enter your education");
		while (hasNext){
		education[counter] = scn.nextLine();
		System.out.println("Do you want to add another education?");
		
		if(addMore.equalsIgnoreCase(scn.nextLine())){
			hasNext = true;
			counter++;
		}else{
			hasNext = false;
			counter =0;
			
		}
		}
		 System.out.println("");
		 
	}
	public static void printExperience(){
		System.out.println("Do you have experiance?");
		if(addMore.equalsIgnoreCase(scn.nextLine())){
			hasNext = true;
		System.out.println("Enter your experiance");
			
			while (hasNext){
				experience[counter] = scn.nextLine();
					
					System.out.println("Do you want to add another experience?");
					
					if(addMore.equalsIgnoreCase(scn.nextLine())){
						hasNext = true;
						counter++;
					} else {
						hasNext = false;
						counter =0;
						scn.nextLine();
					}
					}
		}
		
		 System.out.println("");
		 
	}
	public static void printSkill(){
		System.out.println("Enter all your skills");
		while (hasNext){
			skills[counter] = scn.nextLine();
				
				System.out.println("Do you want to add another skill?");
				
				if(addMore.equalsIgnoreCase(scn.nextLine())){
					hasNext = true;
					counter++;
				} else {
					hasNext = false;
					counter =0;
					
				}}
		
		System.out.println("");
	}
	  
		 
	}



