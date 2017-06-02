import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Resume {
	 
	 Person person = new Person();
	 ArrayList<Education> education= new ArrayList<Education>();
	 ArrayList<Experience> experience = new ArrayList<Experience>();
	 ArrayList<Skills> skills = new ArrayList<Skills>();
	 boolean hasNext = true;
	 String addMore = "y";
	
	 Scanner scn = new Scanner(System.in);
	
	

	public void saveResume() {
		
		saveName();
		saveEmail();
		saveEducation();
		saveExperience();
		saveSkill();
	}
	
	public void printResume()	{
		
		System.out.println("================================================");
		System.out.print(person.getFirstName() + " ");
		
		System.out.print(person.getLastName());
		System.out.println();
		
		System.out.println(person.getEmail());
		System.out.println();
		
		System.out.println("Education");
		for(Education ed: education){
			
			System.out.println(ed.getTypeOfDegree() + ",");
			System.out.print(ed.getInstitute() + ", ");
			System.out.print(ed.getCity() + ", ");
			System.out.println(ed.getEndDate());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Experience");
		for(Experience ex: experience){
			
			System.out.println(ex.getPosition());
			System.out.print(ex.getCompany() + ", ");
			System.out.println(ex.getStartDate() + "-" + ex.getEndDate());
			System.out.println(ex.getDuty());
			System.out.println();
		}
		System.out.println();
		System.out.println("Skills");
		for(Skills sk: skills){
			if(sk.getRating() > 8){
				System.out.println(sk.getSkill() + ", Very Good" );
			}else if (sk.getRating() > 5){
				System.out.println(sk.getSkill() + ",Good " );
			}else{
				System.out.println(sk.getSkill() + ",have a know-how" );
			}
		}
		
	}

	public void saveName(){
		System.out.println("Please enter your first name");
		person.setFirstName(scn.nextLine());
		System.out.print("Please enter your last name");
		person.setLastName(scn.nextLine());
		System.out.println();
		 
	}
	
	public void saveEmail(){
		System.out.println("Enter your email address");
		person.setEmail(scn.nextLine());
		System.out.println();
		 
	}
	public void saveEducation(){
		System.out.println("Enter your education");
		System.out.println("Enter the type of degree you get?");
		while (hasNext){
			Education edu1 = new Education();
			edu1.setTypeOfDegree(scn.nextLine());
			System.out.println("Enter the institute?");
			edu1.setInstitute(scn.nextLine());
			System.out.println("Enter the city?");
			edu1.setCity(scn.nextLine());
			System.out.println("Enter the end date?");
			edu1.setEndDate(scn.nextLine());
			System.out.println("Do you want to add another education?");
			
			education.add(edu1);
		
		if(addMore.equalsIgnoreCase(scn.nextLine())){
			hasNext = true;
			
		}else{
			hasNext = false;
			
		}
		}
		 System.out.println("");
		 
	}
	public void saveExperience(){
		System.out.println("Do you have experiance?");
		if(addMore.equalsIgnoreCase(scn.nextLine())){
			hasNext = true;
		
			while (hasNext){
				System.out.println("Please Enter your position");
				Experience exp1 = new Experience();
				exp1.setPosition(scn.nextLine());
				System.out.println("Please Enter the company name");
				exp1.setCompany(scn.nextLine());
				System.out.println("Please Enter the start date");
				exp1.setStartDate(scn.nextLine());
				System.out.println("Please Enter the ende date");
				exp1.setEndDate(scn.nextLine());
				System.out.println("Please Enter your duties");
				exp1.setDuty(scn.nextLine());
				experience.add(exp1);
					
				System.out.println("Do you want to add another experience?");
					
					if(addMore.equalsIgnoreCase(scn.nextLine())){
						hasNext = true;
						
					} else {
						hasNext = false;
						
						
					}
					}
			hasNext = true;
		}
		
		 System.out.println("");
		 
	}
	public void saveSkill(){
		System.out.println("Enter all your skills");
		while (hasNext){
			Skills sk = new Skills();
			sk.setSkill(scn.nextLine());
			System.out.println("How do you rate yourself for 1-10, ten being the higest");
			sk.setRating(scn.nextInt());	
			scn.nextLine();
			skills.add(sk);
			
			System.out.println("Do you want to add another skill?");
				
				if(addMore.equalsIgnoreCase(scn.nextLine())){
					hasNext = true;
					
				} else {
					hasNext = false;
					
					
				}}
		
		System.out.println("");
	}
	  
		 
	}



