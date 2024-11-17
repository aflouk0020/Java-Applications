package serialize;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L; // Include a version UID to avoid serialization compatibility issues
    private String name;
    private String email;
    
    

    public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + "]";
    }
}
