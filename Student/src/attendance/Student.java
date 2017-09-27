package attendance;

public class Student implements Attendee {
	private String firstName;
	private String lastName;
	private boolean present;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		present = false;
	}

		public boolean isPresent() {
			return present;
		}
		
		public void setPresent(boolean present) {
			this.present = present;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public boolean mathces(String first, String last) {
			return first.toLowerCase().equals(firstName.toLowercase())&& last.toLowerCase().equals(lastName.toLowerCase());
		}
		
		public boolean matches(String last) {
			return last.toLowerCase().equals(lastName.toLowerCase());
		}
		
		public String getReportString() {
			if(lastName.length()>20){
				lastName = lastName.substring(0, 17)+ "...";
			}
			else while (lastName.length()<20){
				lastName += " ";
			}
			if (firstName.length() > 20){
				lastName = firstName.substring(0, 17)+ "...";
			}
			else {
				lastName+= firstName;
			}
			while(lastName.length()<40){
				lastName += " ";
			}
			if(present){
				lastName += "PRESENT\n";
			}
			else {
				lastName += "ABSENT\n";
			}
			return lastName;
		}
}
