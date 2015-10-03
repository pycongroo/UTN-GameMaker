import java.util.ResourceBundle;


public class JuegoFactory 
{
	public static Juego getJuego()
	{
		try
		{		
			ResourceBundle rb = ResourceBundle.getBundle("juego");
			
			String sClassname = rb.getString("JUEGO");
			
			return (Juego) Class.forName(sClassname).newInstance();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		
		
		
	}
}
