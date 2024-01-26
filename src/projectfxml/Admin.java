package projectfxml;

public class Admin {
	
    // Data Fields
    private double Username;
    private double Password;

    // No-arg constructor
    public Admin(){}

    public Admin(double User,double Pass) {
        super();
        this.Username = User;
        this.Password = Pass;
    }

    // Getter
    public double getUsername() {
        return Username;
    }
    public double getPassword() {
        return Password;
    }

    // Setter
    public void setUsername(double Username) {
    this.Username = Username;
    }
    public void setPassword(double Password) {
    this.Password = Password;
    }
    
    

    @Override
    public String toString() {
        return 
        "FNAME=" + Username + ", "+
        "LNAME=" + Password + ", ";
    }
}