// SUNDAR RAJ
public class Course
{
    private String courseName;
    private int sectionNumber;
    private int numberOfCredits;
    private Course link;

    public Course()
    {
        this("",0,0, null);
    }

    public Course(String cn, int sn, int nc, Course n)
    {
        courseName = cn;
        sectionNumber = sn;
        numberOfCredits = nc;
        link = n;
    }

    public Course(Course c)
    {
        courseName = c.courseName;
        sectionNumber = c.sectionNumber;
        numberOfCredits = c.numberOfCredits;
        link = null;

    }

    public void setCourseName(String cn)
    {
        courseName = cn;
    }

    public void setSectionNumber(int sn)
    {
        sectionNumber = sn;
    }

    public void setNumberOfCredits(int nc)
    {
        numberOfCredits = nc;
    }

    public void setLink(Course n)
    {
        link = n;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getSectionNumber()
    {
        return sectionNumber;
    }

    public int getNumberOfCredits()
    {
        return numberOfCredits;
    }

    public Course getLink()
    {
        return link;
    }

    public String toString()
	{
		return "\nCourse Name: " + courseName +
				"\nSection Number: " + sectionNumber +
				"\nNumber of Credits: " + numberOfCredits + "\n";
	}
}