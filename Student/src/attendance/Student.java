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
			String s = lastName;
			if(s.length()>20){
				s = s.substring(0, 17)+ "...";
			}
			else while (s.length()<20){
				s += " ";
			}
			if (firstName.length() > 20){
				s = firstName.substring(0, 17)+ "...";
			}
			else {
				s+= firstName;
			}
			while(s.length()<40){
				s += " ";
			}
			if(present){
				s += "PRESENT\n";
			}
			else {
				s += "ABSENT\n";
			}
			return s;
		}
}
