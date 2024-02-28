package TicTacGame.com;

public class AlreadyPlacedException extends RuntimeException
{
	public AlreadyPlacedException()
	{
		super();
	}
	
	public AlreadyPlacedException(String message)
	{
		super(message);
	}
}