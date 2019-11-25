package application;

public class Model implements ModelInterface {

	private int numCredits;
	
	private String yearInSchool;
	
	public Model() {
		setNumCredits(0);
	}
	
	public Model(int newNumCredits) {
		setNumCredits(newNumCredits);
	}
	
	@Override
	public void setNumCredits(int newNumCredits) {
		numCredits = newNumCredits;
		if (numCredits < 0)
			yearInSchool = "Unenrolled";
		else if (numCredits <= 30)
			yearInSchool = "Freshman";
		else if (numCredits <= 60)
			yearInSchool = "Sophmore";
		else if (numCredits <= 90)
			yearInSchool = "Junior";
		else if (numCredits <= 122)
			yearInSchool = "Senior";
		else
			yearInSchool = "Supersenior";
	}

	@Override
	public int getNumCredits() {
		return numCredits;
	}

	@Override
	public String getYearInSchool() {
		return yearInSchool;
	}

}
