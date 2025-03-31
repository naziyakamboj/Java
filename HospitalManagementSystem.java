// Superclass: Person
class Person {
    protected String name;
    protected int age;
    protected String gender;
    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}

// Subclass: Patient
class Patient extends Person {
    private static int patientCount = 0;
    private int patientID;
    private String disease;
    
    public Patient(String name, int age, String gender, int patientID, String disease) {
        super(name, age, gender);
        this.patientID = patientID;
        this.disease = disease;
        patientCount++;
    }
    
    public Patient(String name, int age, String gender) {
        this(name, age, gender, ++patientCount, "Not Specified");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + patientID + ", Disease: " + disease);
    }
    
    public static int getPatientCount() {
        return patientCount;
    }
}

// Subclass: Doctor
class Doctor extends Person {
    private static int doctorCount = 0;
    private int doctorID;
    private String specialization;
    
    public Doctor(String name, int age, String gender, int doctorID, String specialization) {
        super(name, age, gender);
        this.doctorID = doctorID;
        this.specialization = specialization;
        doctorCount++;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doctor ID: " + doctorID + ", Specialization: " + specialization);
    }
    
    public static int getDoctorCount() {
        return doctorCount;
    }
}

// Hospital class to manage doctors and patients
class Hospital {
    private Patient[] patients;
    private Doctor[] doctors;
    private int patientIndex;
    private int doctorIndex;
    
    public Hospital(int maxPatients, int maxDoctors) {
        patients = new Patient[maxPatients];
        doctors = new Doctor[maxDoctors];
        patientIndex = 0;
        doctorIndex = 0;
    }
    
    public void addPatient(Patient p) {
        if (patientIndex < patients.length) {
            patients[patientIndex++] = p;
        } else {
            System.out.println("Hospital is at full patient capacity.");
        }
    }
    
    public void addDoctor(Doctor d) {
        if (doctorIndex < doctors.length) {
            doctors[doctorIndex++] = d;
        } else {
            System.out.println("Hospital is at full doctor capacity.");
        }
    }
    
    public void displayAllPatients() {
        System.out.println("\n--- Patients List ---");
        for (int i = 0; i < patientIndex; i++) {
            patients[i].displayInfo();
            System.out.println("----------------------");
        }
    }
    
    public void displayAllDoctors() {
        System.out.println("\n--- Doctors List ---");
        for (int i = 0; i < doctorIndex; i++) {
            doctors[i].displayInfo();
            System.out.println("----------------------");
        }
    }
    
    public void displayTotalCount() {
        System.out.println("Total Patients: " + Patient.getPatientCount());
        System.out.println("Total Doctors: " + Doctor.getDoctorCount());
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(10, 5);
        
        // Adding Patients
        Patient p1 = new Patient("Alice", 30, "Female", 101, "Flu");
        Patient p2 = new Patient("Bob", 45, "Male"); // Overloaded constructor
        
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        
        // Adding Doctors
        Doctor d1 = new Doctor("Dr. Smith", 50, "Male", 201, "Cardiology");
        Doctor d2 = new Doctor("Dr. Emily", 40, "Female", 202, "Neurology");
        
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        
        // Display Information
        hospital.displayAllPatients();
        hospital.displayAllDoctors();
        hospital.displayTotalCount();
    }
}

