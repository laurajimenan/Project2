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
public class PatientDriverApp {
	
	public static void main(String[] args) {
		Patient patient = new Patient("Laura", "Jimena", "Nino","125 Charles St", "Rockville", "MD", "20850",
				"001-002-003", "004-005-006", "Carlos Alfaro");

        Procedure proc1 = new Procedure();
        proc1.setNameOfProc("Eye Test");
        proc1.setDateOfProc("10/09/2026");
        proc1.setNameOfDoc("Doctora Gabriella");
        proc1.setCosts(45.99);

        Procedure proc2 = new Procedure("Eye contact lenses", "10/11/2026");
        proc2.setNameOfDoc("Doctor Gabriel");
        proc2.setCosts(29.99);

        Procedure proc3 = new Procedure("Glasses", "10/15/2026", "Doctor Gab", 19.99);
        displayPatient(patient);
        displayProcedure(proc1);
        displayProcedure(proc2);
        displayProcedure(proc3);
        double totalCost = calculateTotalCharges(proc1, proc2, proc3);
        System.out.printf("Total Charges: $%,.2f", totalCost);
        System.out.println("Student Name: Laura Jimena Nino Castillo");
        System.out.println("MyMC: M21186144");
        System.out.println("Due Date: 10/09/2026");
    }
    public static void displayPatient(Patient p) {
        System.out.println("Patient information: ");
        System.out.println("  Patient name: " + p.buildFullName());
        System.out.println("  Patient address: " + p.buildAddress());
        System.out.println("  Emergency Contact: " + p.buildEmergencyContact());
        System.out.println();
    }
    public static void displayProcedure(Procedure proc) {
        System.out.println("\tProcedure: " + proc.getNameOfProc());
        System.out.println("\tProcedureDate=" + proc.getDateOfProc());
        System.out.println("\tPractitioner=" + proc.getNameOfDoc());
        System.out.println("\tCharge=" + proc.getFormattedCharge());
        System.out.println();
    }
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCosts() + p2.getCosts() + p3.getCosts();
    }
}