package formato;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class Formatolog extends Formatter{

	
	@Override
	public String format(LogRecord record) {
	return "El mensaje que se guarda en el log es: "+record.getMessage();
	}
	@Override
	 public String getHead(Handler h) {
	 return "\nPrincipio LOG\n";
	 }
	@Override
	 public String getTail(Handler h) {
	 return "\nFinal LOG\n";
	 }


}
