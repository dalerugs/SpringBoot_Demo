package jccm.PEPSOL.object;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String contactNumber;
    private String address;
    private String cellLeader;
    private String networkLeader;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String birthDate, String contactNumber, String address, String cellLeader, String networkLeader) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contactNumber = contactNumber;
        this.address = address;
        this.cellLeader = cellLeader;
        this.networkLeader = networkLeader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellLeader() {
        return cellLeader;
    }

    public void setCellLeader(String cellLeader) {
        this.cellLeader = cellLeader;
    }

    public String getNetworkLeader() {
        return networkLeader;
    }

    public void setNetworkLeader(String networkLeader) {
        this.networkLeader = networkLeader;
    }
}
