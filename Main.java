import org.python.util.PythonInterpreter;

public class Main {

	public static void main(String[] args) {
		
		PythonInterpreter py = new PythonInterpreter();
				
		py.exec("print('Hello World')");
		
	}
	
}
