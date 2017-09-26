package attendance;

public class Student implements Attendee {
	private String firstName;
	private String lastName;
	private boolean present = false;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
			return firstName.equals(first)&& (lastName.equals(last));
		}
		
		public boolean matches(String last) {
			return lastName.equals(last);
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
				lastName += "PRESENT";
			}
			else {
				lastName += "ABSENT";
			}
			return lastName;
		}
}