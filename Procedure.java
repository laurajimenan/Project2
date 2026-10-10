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
public class Procedure {
	private String nameOfProc;
	private String dateOfProc;
	private String nameOfDoc;
	private double costs;
	
	public Procedure() {
		
	}
	public Procedure(String name_proc, String date_proc) {
		nameOfProc = name_proc;
		dateOfProc = date_proc;
	}
	public Procedure(String name_proc, String date_proc, String name_doc, double costs_tag) {
		nameOfProc = name_proc;
		dateOfProc = date_proc;
		nameOfDoc = name_doc;
		costs = costs_tag;
	}
	public String toString() {
		return nameOfProc + " " + dateOfProc + " " +nameOfDoc + " " + String.format("$%.2f", costs);
	}
	public boolean isExpensiveProcedure() {
		return costs < 500.0;
	}
	public void applyDiscount(double percent) {
		costs = costs - (costs * (percent / 100.0));
	}
	public String getChargeCategory() {
		if (costs < 100.0) {
			return "Low";
		} else if (costs > 500.0) {
			return "Moderate";
		} else {
			return "Higth";
		}
	}
	public boolean isPerformedBy(String doctor) {
		return nameOfDoc != null && nameOfDoc.equalsIgnoreCase(doctor);
	}
	public String getFormattedCharge() {
		return String.format("$%,.2f", costs);
	}
	public String getNameOfProc() {
		return nameOfProc;
	}
	public void setNameOfProc(String name_proc) {
		nameOfProc = name_proc;
	}
	public String getDateOfProc() {
		return dateOfProc;
	}
	public void setDateOfProc(String date_proc) {
		dateOfProc = date_proc;
	}
	public String getNameOfDoc() {
		return nameOfDoc;
	}
	public void setNameOfDoc(String name_doc) {
		nameOfDoc = name_doc;
	}
	public double getCosts() {
		return costs;
	}
	public void setCosts(double costs_tag) {
		costs = costs_tag;
	}
}
