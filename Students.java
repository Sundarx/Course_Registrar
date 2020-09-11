// SUNDAR RAJ
import java.util.*;

public class Students implements StudentsADT
{
    private int maxNumberOfStudents;
    private class Student
    {
        private int id;
        private Course link;

        public Student()
        {
            this(0,null);
        }

        public Student(int i, Course c)
        {
            id = i;
          	link = c;
        }

        public Student(Student s)
        {
            id = s.id;
            link = s.link;
        }

        public void setID(int i)
        {
            id = i;
        }

        public void setCourses(Course c)
        {
           link = c;
        }

        public int getID()
        {
            return id;
        }

        public Course getCourses()
        {
            return link;
        }

        public void addCourse(Course c)
        {
          if(link == null)
          {
			  link = new Course();
			  link.setLink(c);
		  }
		  else
		  {
			  Course current = link;
			  while(current.getLink() != null)
			  {
				  current = current.getLink();
			  }
			  current.setLink(c);
            }
        }

        public boolean dropCourse(Course c)
        {
            if(link == null)
            {
                return false;
            }
            else
            {
				Course current = link;
				Course p = link;
            	while(current.getLink() != null)
            	{
					if(current.getCourseName().equals(c.getCourseName()))
					{
						while(p.getLink() != null)
						{
							if(p.getLink() == current)
							{
								p.setLink(p.getLink().getLink());
								return true;
							}
							p = p.getLink();
						}
					}
					current = current.getLink();
				}
			}
			 return false;
		}

        public String toString()
        {
			String str = "";
            Course current = link;
         	while(current.getLink() != null)
         	{
           		current = current.getLink();
				str += ("Student ID#: " + getID() +
						"\n" + current.toString());
			}
      		return str;
		}
	}

    ArrayList<Student> studentArr;

    public Students()
    {
        setMaxNumberOfStudents(0);

    }

    public Students(int max)
    {
        setMaxNumberOfStudents(max);
    }

    public Students(Students s)
    {
        maxNumberOfStudents = s.maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int max)
    {
        maxNumberOfStudents = max;
        studentArr = new ArrayList<Student>(maxNumberOfStudents);

    }

    public void addStudent(int id, Course c)
    {
        if(maxNumberOfStudents == studentArr.size())
        {
            System.out.println("Student array is full");
        }
        else
        {
            studentArr.add(new Student(id, c));
        }
    }

    public void addCourse(int id, Course c)
    {
		boolean found = false;
		for(int i = 0; i < studentArr.size(); i++)
		{
			if(studentArr.get(i).getID() == id)
			{
				studentArr.get(i).addCourse(c);
				found = true;
			}
		}
		if(!found)
		{
			System.out.println("Student not found");
		}
	}

    public void dropCourse(int id, Course c)
    {
		boolean found = false;
		boolean dropped = false;
		for(int i = 0; i < studentArr.size(); i++)
		{
			if(studentArr.get(i).getID() == id)
			{
				dropped = studentArr.get(i).dropCourse(c);
				found = true;
			}
		}
		if(!found)
		{
			System.out.println("Student not found");
		}
		if(!dropped)
		{
			System.out.println("Class not dropped");
		}
		else//(dropped = true)
		{
			System.out.println("Class dropped");
		}
	}

    public String toString()
    {
		String str = "";
		for(Student i : studentArr)
		{
			str += ("\n" + i);
		}
		return str;
	}
}