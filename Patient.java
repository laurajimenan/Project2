/*
Class: CMSC203 CRN21751
Instructor: Gary Thai
Description: A patient record information
Due: 10/09/2026
Platform/compiler: Eclipse
I pledge that I have completed the programming assignment 
independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
Print your Name here: Laura Jimena Nino Castillo.
*/
package abc;
public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	private String emergContName;
	private String emergContNum;
	
	public Patient() {
		
	}
	public Patient(String first_name, String middle_name, String last_name) {
		firstName = first_name;
		middleName = middle_name;
		lastName = last_name;
	}
	public Patient(String first_name, String middle_name, String last_name, String street_name, String city_name, 
			String state_name, String zipCode, String phone_num, String emergencyContactName, String emergencyContactNum) {
		firstName = first_name;
		middleName = middle_name;
		lastName = last_name;
		streetName = street_name;
		city = city_name;
		state = state_name;
		zip = zipCode;
		phoneNum = phone_num;
		emergContName = emergencyContactName;
		emergContNum = emergencyContactNum;
	}
	public String buildFullName() {
		return firstName + " " + middleName +  " " + lastName;
	}
	public String buildAddress() {
		return streetName + " " + city + " " + state + " " + zip;
	}
	public String buildEmergencyContact() {
		return emergContName + " " + emergContNum;
	}
	public String toString() {//displays all patient information using the build methods
		return buildFullName() + "\n" + buildAddress() + "\n" + buildEmergencyContact();
	}
	public boolean isValidPhoneNumber() {
		return phoneNum != null && !phoneNum.isEmpty();
	}
	public boolean isValidEmergencyPhoneNumber() {
		return emergContNum != null && !emergContNum.isEmpty();
	}
	public String getLastFirstMiddle() {
		return lastName + ", " + firstName + " " + middleName;
	}
	public boolean hasSameCityState(String city_name, String state_name) {
		return city != null && city.equalsIgnoreCase(city_name) && state != null && state.equalsIgnoreCase(state_name);
	}
	public void updateAddress(String street_name, String city_name, String state_name, String zipCode) {
		streetName = street_name;
		city = city_name;
		state = state_name;
		zip = zipCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first_name) {
		firstName = first_name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middle_name) {
		middleName = middle_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last_name) {
		lastName = last_name;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String street_name) {
		streetName = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city_name) {
		city = city_name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state_name) {
		state = state_name;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zipCode) {
		zip = zipCode;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phone_num) {
		phoneNum = phone_num;
	}
	public String getEmergContName() {
		return emergContName;
	}
	public void setEmergContName(String emergencyContactName) {
		emergContName = emergencyContactName;
	}
	public String getEmergContNum() {
		return emergContNum;
	}
	public void setEmergContNum(String emergencyContactNum) {
		emergContNum = emergencyContactNum;
	}
}
