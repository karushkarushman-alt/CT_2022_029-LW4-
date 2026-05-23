package q4;

class Bicycle {
    // Data Member
    private String ownerName;
    private String phoneNo;
    //Constructor: Initializes the data member
    public Bicycle() {
        ownerName = "Unknown";
    }
    public Bicycle(String name,String num) {
        ownerName = name;
        phoneNo = num;
    }
    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;