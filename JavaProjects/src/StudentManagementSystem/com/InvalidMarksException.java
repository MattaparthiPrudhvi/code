package StudentManagementSystem.com;
public class InvalidMarksException extends Exception
{
	public InvalidMarksException()
	{
		super();
	}
	
	public InvalidMarksException(String message)
	{
		super(message);
	}
}