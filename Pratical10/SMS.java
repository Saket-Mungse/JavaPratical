import java.time.LocalDate;

class SMS { 
    public String name;
    public String DOB;
    public int age;
    public String regNo;
    public String branch;
    public String mail;
    private int admissionYear;
    private int curentYear;
    private int pursuingYear;
    private String doing;
    public String fullNameOfBranch;

    LocalDate curr = LocalDate.now();
    String currDate = curr.toString();

    private static int itSeq = 1;
    private static int cseSeq = 1;
    private static int ceSeq = 1;
    private static int meSeq = 1;
    private static int eceSeq = 1;
    private static int eeSeq = 1;
    private static int teSeq = 1;
    private static int cheSeq = 1;
    private static int otherSeq = 1;

    private static SMS[] students = new SMS[100]; 
    private static int studentCount = 0;         
    void setName(String name) {
        this.name = name;
    }

    void setDOB(String DOB) {
        this.DOB = DOB;
    }

    void setAge(String DOB) {
        int a1 = Integer.parseInt(DOB.substring(6, 10));
        int a2 = Integer.parseInt(currDate.substring(0, 4));
        age = a2 - a1;
    }

    void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    void setBranch(String branch) {
        if (branch.startsWith("DSY ")) {
            branch = branch.replace("DSY ", ""); 
            this.branch = branch;
            pursuingYear = 1; 
        } 
        if (branch.equalsIgnoreCase("Information Technology")) {
            this.branch = "IT";
        } else if (branch.equalsIgnoreCase("Computer Science")) {
            this.branch = "CSE";
        } else if (branch.equalsIgnoreCase("Mechanical Engineering")) {
            this.branch = "ME";
        } else if (branch.equalsIgnoreCase("Electrical Engineering")) {
            this.branch = "EE";
        } else if (branch.equalsIgnoreCase("Civil Engineering")) {
            this.branch = "CE";
        } else if (branch.equalsIgnoreCase("Electronics and Telecommunication")) {
            this.branch = "ECE";
        } else if (branch.equalsIgnoreCase("Textile Engineering")) {
            this.branch = "TE";
        } else if (branch.equalsIgnoreCase("Chemical Engineering")) {
            this.branch = "ChE";
        } else {
            System.out.println("This Branch is not available in this college");
        }

        curentYear = Integer.parseInt(currDate.substring(0, 4));
        pursuingYear = curentYear - admissionYear;
    }

    void setMail(String regNo) {
        mail = regNo + "@sggs.ac.in";
    }

    SMS(String[] array) { 
        for (String field : array) {
            String[] pair = field.split("=");

            String key = pair[0].trim();
            String value = pair[1].trim();

            switch (key) {
                case "Name":
                    setName(value);
                    break;
                case "DOB":
                    setDOB(value);
                    setAge(value);
                    break;
                case "AdmissionYear":
                    setAdmissionYear(Integer.parseInt(value));
                    break;
                case "Branch":
                    fullNameOfBranch = value;
                    setBranch(value);
                    break;
                default:
                    System.out.println("Unknown key: " + key);
            }
        }

        curentYear = Integer.parseInt(currDate.substring(0, 4));
        pursuingYear = curentYear - admissionYear;
        if (pursuingYear > 0 && pursuingYear < 5) {
            doing = "B.Tech in " + fullNameOfBranch;
            if (fullNameOfBranch.startsWith("DSY")) {
                regNo = admissionYear + branch + String.format("%03d", 500 + otherSeq++);
            } else if (branch.equalsIgnoreCase("IT")) {
                regNo = admissionYear + "BIT" + String.format("%03d", itSeq++);
            } else if (branch.equalsIgnoreCase("CE")) {
                regNo = admissionYear + "BCE" + String.format("%03d", ceSeq++);
            } else if (branch.equalsIgnoreCase("CSE")) {
                regNo = admissionYear + "BCS" + String.format("%03d", cseSeq++);
            } else if (branch.equalsIgnoreCase("ME")) {
                regNo = admissionYear + "BME" + String.format("%03d", meSeq++);
            } else if (branch.equalsIgnoreCase("EE")) {
                regNo = admissionYear + "BEE" + String.format("%03d", eeSeq++);
            } else if (branch.equalsIgnoreCase("ECE")) {
                regNo = admissionYear + "BECE" + String.format("%03d", eceSeq++);
            } else if (branch.equalsIgnoreCase("TE")) {
                regNo = admissionYear + "BAE" + String.format("%03d", teSeq++);
            } else if (branch.equalsIgnoreCase("ChE")) {
                regNo = admissionYear + "BChE" + String.format("%03d", cheSeq++);
            } else {
                regNo = admissionYear + "B" + branch + String.format("%03d", otherSeq++);
            }
            setMail(regNo);
        } else if (pursuingYear > 4 && pursuingYear < 7) {
            doing = "M.Tech " + fullNameOfBranch;
            regNo = admissionYear + branch + "001"; 
        } else {
            doing = "PhD";
            regNo = "PhD" + admissionYear; 
        }

        if (studentCount < students.length) {
            students[studentCount++] = this; 
        } else {
            System.out.println("Student array is full!");
        }
    }

    public String getInformation() {
        return "Name: " + name + "\n"
             + "Age: " + age + "\n"
             + "DOB: " + DOB + "\n"
             + "Pursuing: " + doing + "\n"
             + "RegNo.: " + regNo + "\n"
             + "E-Mail: " + mail + "\n"
             + "-------------------------------------";
    }

    static void Display(String[] array) {
        for (String record : array) {
            String[] details = record.split(",");
            SMS student = new SMS(details); 
            System.out.println(student.getInformation());
        }
    }

    public static SMS getStudent(int index) {
        if (index >= 0 && index < studentCount) {
            return students[index]; 
        } else {
            System.out.println("Invalid student index!");
            return null;
        }
    }

    public static void main(String[] args) {
        String information = args[0];
        String[] studentRecords = information.split("#");
        Display(studentRecords);
    }
}




/*
"Name=Saket Nitin Mungse,DOB=20-02-2006,AdmissionYear=2023,Branch=Information Technology#Name=Mohit Vilas Khandale,DOB=12-03-2004,AdmissionYear=2023,Branch=Information Technology#Name=Siddhesh Rajeshwar Dhewle,DOB=21-03-2005,AdmissionYear=2023,Branch=Electronics and Telecommunication#Name=Ayush Santosh Gulhane,DOB=31-01-2004,AdmissionYear=2023,Branch=DSY Civil Engineering#Name=Nukesh Zalke,DOB=31-01-2005,AdmissionYear=2023,Branch=DSY Civil Engineering" 
*/