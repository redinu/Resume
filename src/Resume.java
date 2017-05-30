import java.util.Scanner;

public class Resume {

	public static void main(String[] args) {
		
		String name;
		String email;
		String[] education= new String[10];
		String[] experience = new String[10];
		String[] skills = new String[20];
		boolean hasNext = true;
		int counter = 0;
		String addMore = "y";
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = scn.nextLine();
		
		System.out.println("Enter your email address");
		email = scn.nextLine();
		
		
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
					}else{
						hasNext = false;
						counter =0;
						
					}
					}
		}
		
		
		
		counter =0;
		System.out.println("Enter all your skills");
		while (hasNext){
			skills[counter] = scn.nextLine();;
				
				System.out.println("Do you want to add another education?");
				
				if(addMore.equalsIgnoreCase(scn.nextLine())){
					hasNext = true;
					counter++;
				}else{
					hasNext = false;
					counter =0;
					
				}}
		
		
	}

}
