//Build A hospital management system that keeps track of patient visits.
//Task: Create a class Patient with encapsulated fields: patientId, name, visits[].
//Include a static counter for total patients.
//Create constructors to initialize data.
//Display visit data using enhanced for loop.
//Demonstrate usage of String fields and proper comparisons.

package Module_1;

class Patient {
    private int patientId;
    private String name;
    private String[] visits;

    private static int totalPatients = 0;
    public Patient(int patientId,String name,String[] visits){
        this.patientId=patientId;
        this.name=name;
        this.visits=visits;
        totalPatients++;
    }
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String[] getVisits() {
        return visits;
    }
    public static int getTotalPatients() {
        return totalPatients;
    }
    public void displayDetails(){
        System.out.println("Patient ID:"+patientId);
        System.out.println("Name:"+name);
        System.out.println("Visits:");
        for(String visit:visits){ 
            System.out.println("-"+visit);
        }
        System.out.println();
    }
    public boolean hasName(String otherName) {
        return this.name.equals(otherName);
    }
}
public class q6_Module1 {
	public static void main(String[] args) {
        String[] visits1={"2023-01-10:Fever","2023-05-15:Checkup"};
        String[] visits2={"2024-02-20:Surgery","2024-08-05:Follow-up"};
        Patient p1=new Patient(101,"Pravallika",visits1);
        Patient p2=new Patient(102,"Satya",visits2);
        p1.displayDetails();
        p2.displayDetails();
        System.out.println("Total patients registered: " + Patient.getTotalPatients());
        String searchName = "Alice";
        if (p1.hasName(searchName)) {
            System.out.println("Patient with name \"" + searchName + "\" found (using equals).");
        } else {
            System.out.println("Patient not found.");
        }
    }

}
