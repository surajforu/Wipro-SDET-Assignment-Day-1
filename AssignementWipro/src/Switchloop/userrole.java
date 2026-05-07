package Switchloop;

public class userrole {

	public static void main(String[] args) {
		String role = "Admin";

		switch(role){
		    case "Admin": System.out.println("Full Access"); break;
		    case "User": System.out.println("Limited Access"); break;
		    default: System.out.println("Guest Access");
		}
	}

}
