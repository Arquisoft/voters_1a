package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserInfo {
	
	private static final Logger log = LoggerFactory.getLogger(UserInfo.class);

    private final String name, email;
    private final Integer age, votingCode;

    public UserInfo(String name, Integer age, String email, Integer votingCode) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.votingCode = votingCode;
        log.info("Created " + this.toString());
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public int votingCode() {
    	return this.votingCode;
    }

	@Override
	public String toString() {
		return String.format("UserInfo [name=%s, email=%s, age=%s, votingCode=%s]",
				name, email, age, votingCode);
	}
}