// SUNDAR RAJ
public interface StudentsADT
{
	// sets maximum number of students that can recorded at the college
	public abstract void setMaxNumberOfStudents(int max);

	// adds the students info to the end of the list
	public abstract void addStudent(int id, Course c);

	// adds course for a student to the end of the respective list
	public abstract void addCourse(int id, Course c);

	// drops course for a student to the end of the respective list
	public abstract void dropCourse(int id, Course c);
}