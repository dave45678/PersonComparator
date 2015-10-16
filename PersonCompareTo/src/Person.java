import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Person {
	private String firstName;
	private String lastName;
    private Date birthday;
    
    //http://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html
 

    Person(String firstName,String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
    public String getLastName() {
		return lastName;
	}

    public String getFullName() {
    	return firstName + " " + lastName;
    }

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


    public Integer getAge(){
    	Calendar cal = new GregorianCalendar();
    	cal.setTime(getBirthday());
        Calendar now = new GregorianCalendar();
        int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
            || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_MONTH) > now
                .get(Calendar.DAY_OF_MONTH))) {
          res--;
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %d", getFullName(), getAge());
    }
  
}

